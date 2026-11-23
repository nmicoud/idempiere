/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 *****************************************************************************/
/**
 * Minimal drawing pad for the Image field dialog (IDEMPIERE-7224).
 * Plain HTML5 canvas + Pointer Events: finger, stylus and mouse.
 *
 * Usage (same pattern as photobooth):
 *   jq(wgt).drawpad();                          // create
 *   jq(wgt).data('drawpad').clear();            // clear
 *   jq(wgt).data('drawpad').toDataURL();        // PNG data URL, or null if empty
 *   jq(wgt).data('drawpad').destroy();          // remove
 */
(function ($) {

	function DrawPad(container, options) {
		this.options = $.extend({
			penColor: '#000000',
			penWidth: 2.5,          // in CSS pixels
			background: '#ffffff',  // white: safer for printing than transparent
			reservedHeight: 45      // room left for the dialog buttons below the canvas
		}, options);

		this.container = container;
		this.canvas = document.createElement('canvas');
		this.canvas.className = 'drawpad-canvas';
		var s = this.canvas.style;
		s.display = 'block';
		s.width = '100%';
		s.height = 'calc(100% - ' + this.options.reservedHeight + 'px)';
		s.touchAction = 'none';    // no page scroll or zoom while drawing
		s.cursor = 'crosshair';
		s.border = '1px solid #ccc';
		s.boxSizing = 'border-box';
		// canvas first, the dialog buttons (server side) stay below it
		container.insertBefore(this.canvas, container.firstChild);

		this.ctx = this.canvas.getContext('2d');
		this.empty = true;
		this.pointerId = null;
		this.last = null;

		this._resize();
		this._bind();
	}

	DrawPad.prototype = {

		/** Size the bitmap to the displayed size x device pixel ratio (sharp on tablets). */
		_resize: function () {
			var rect = this.canvas.getBoundingClientRect();
			var ratio = Math.max(window.devicePixelRatio || 1, 1);
			this.ratio = ratio;
			this.canvas.width = Math.max(Math.round(rect.width * ratio), 1);
			this.canvas.height = Math.max(Math.round(rect.height * ratio), 1);
			this._paintBackground();
			this.empty = true;
		},

		_paintBackground: function () {
			var ctx = this.ctx;
			ctx.save();
			ctx.setTransform(1, 0, 0, 1, 0, 0);
			ctx.fillStyle = this.options.background;
			ctx.fillRect(0, 0, this.canvas.width, this.canvas.height);
			ctx.restore();
		},

		/** Pointer position in bitmap pixels. */
		_point: function (e) {
			var rect = this.canvas.getBoundingClientRect();
			return {
				x: (e.clientX - rect.left) * (this.canvas.width / rect.width),
				y: (e.clientY - rect.top) * (this.canvas.height / rect.height)
			};
		},

		_bind: function () {
			var self = this;
			this._down = function (e) {
				if (self.pointerId !== null || (e.pointerType === 'mouse' && e.button !== 0))
					return;
				e.preventDefault();
				self.pointerId = e.pointerId;
				try { self.canvas.setPointerCapture(e.pointerId); } catch (ignore) { }
				self.last = self._point(e);
				self._dot(self.last);
			};
			this._move = function (e) {
				if (e.pointerId !== self.pointerId)
					return;
				e.preventDefault();
				// coalesced events give a smoother line on fast strokes
				var events = (e.getCoalescedEvents && e.getCoalescedEvents().length) ? e.getCoalescedEvents() : [e];
				for (var i = 0; i < events.length; i++)
					self._lineTo(self._point(events[i]));
			};
			this._up = function (e) {
				if (e.pointerId !== self.pointerId)
					return;
				self._finish(self._point(e));
				self.pointerId = null;
				self.last = null;
			};
			this.canvas.addEventListener('pointerdown', this._down);
			this.canvas.addEventListener('pointermove', this._move);
			this.canvas.addEventListener('pointerup', this._up);
			this.canvas.addEventListener('pointercancel', this._up);
		},

		_style: function () {
			var ctx = this.ctx;
			ctx.strokeStyle = this.options.penColor;
			ctx.fillStyle = this.options.penColor;
			ctx.lineWidth = this.options.penWidth * this.ratio;
			ctx.lineCap = 'round';
			ctx.lineJoin = 'round';
		},

		/** A tap leaves a dot. */
		_dot: function (p) {
			this._style();
			this.ctx.beginPath();
			this.ctx.arc(p.x, p.y, this.ctx.lineWidth / 2, 0, Math.PI * 2);
			this.ctx.fill();
			this.empty = false;
		},

		/** Smooth segment: quadratic curve through the midpoint of the last two points. */
		_lineTo: function (p) {
			if (!this.last)
				return;
			var mid = { x: (this.last.x + p.x) / 2, y: (this.last.y + p.y) / 2 };
			this._style();
			this.ctx.beginPath();
			this.ctx.moveTo(this.last.mid ? this.last.mid.x : this.last.x, this.last.mid ? this.last.mid.y : this.last.y);
			this.ctx.quadraticCurveTo(this.last.x, this.last.y, mid.x, mid.y);
			this.ctx.stroke();
			p.mid = mid;
			this.last = p;
			this.empty = false;
		},

		/** End of stroke: the curves stop at midpoints, so draw the last piece up to where the pointer was lifted. */
		_finish: function (p) {
			if (!this.last || !this.last.mid)
				return;
			this._style();
			this.ctx.beginPath();
			this.ctx.moveTo(this.last.mid.x, this.last.mid.y);
			this.ctx.quadraticCurveTo(this.last.x, this.last.y, p.x, p.y);
			this.ctx.stroke();
		},

		clear: function () {
			this._paintBackground();
			this.empty = true;
		},

		isEmpty: function () {
			return this.empty;
		},

		/** @return PNG data URL, or null when nothing was drawn */
		toDataURL: function () {
			return this.empty ? null : this.canvas.toDataURL('image/png');
		},

		destroy: function () {
			this.canvas.removeEventListener('pointerdown', this._down);
			this.canvas.removeEventListener('pointermove', this._move);
			this.canvas.removeEventListener('pointerup', this._up);
			this.canvas.removeEventListener('pointercancel', this._up);
			if (this.canvas.parentNode)
				this.canvas.parentNode.removeChild(this.canvas);
			$(this.container).removeData('drawpad');
		}
	};

	$.fn.drawpad = function (options) {
		return this.each(function () {
			var $this = $(this);
			if (!$this.data('drawpad'))
				$this.data('drawpad', new DrawPad(this, options));
		});
	};

})(jq);
