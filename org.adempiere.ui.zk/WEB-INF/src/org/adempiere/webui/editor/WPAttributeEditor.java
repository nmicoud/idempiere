/******************************************************************************
 * Copyright (C) 2008 Low Heng Sin  All Rights Reserved.                      *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/

package org.adempiere.webui.editor;



import static org.compiere.model.SystemIDs.COLUMN_M_PRODUCT_M_ATTRIBUTESETINSTANCE_ID;

import java.util.logging.Level;

import org.adempiere.webui.apps.AEnv;
import org.adempiere.webui.component.PAttributebox;
import org.adempiere.webui.event.ContextMenuEvent;
import org.adempiere.webui.event.ContextMenuListener;
import org.adempiere.webui.event.DialogEvents;
import org.adempiere.webui.event.ValueChangeEvent;
import org.adempiere.webui.theme.ThemeManager;
import org.adempiere.webui.util.Icon;
import org.adempiere.webui.window.WFieldRecordInfo;
import org.adempiere.webui.window.WPAttributeDialog;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.Lookup;
import org.compiere.model.MPAttributeLookup;
import org.compiere.util.CLogger;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;

/**
 * Default editor for {@link DisplayType#PAttribute}.<br/>
 * Implemented with {@link PAttributebox} component and {@link WPAttributeDialog} dialog.
 * @author Low Heng Sin
 *
 */
public class WPAttributeEditor extends WEditor implements ContextMenuListener
{
	private static final String[] LISTENER_EVENTS = {Events.ON_CLICK, Events.ON_CHANGE, Events.ON_OK};

	private static final CLogger log = CLogger.getCLogger(WPAttributeEditor.class);

	protected int m_WindowNo;

	/** {@link MPAttributeLookup} */
	protected Lookup m_mPAttribute;

	protected int m_C_BPartner_ID;
	
	/** M_AttributeSetInstance_ID */
	protected Object m_value;

	/**	No Instance Key					*/
	private static Integer		NO_INSTANCE = Integer.valueOf(0);

	/**
	 * 
	 * @param gridTab
	 * @param gridField
	 */
	public WPAttributeEditor(GridTab gridTab, GridField gridField)
	{
		this(gridTab, gridField, false, null);
	}
	
	/**
	 * 
	 * @param gridTab
	 * @param gridField
	 * @param tableEditor
	 * @param editorConfiguration
	 */
	public WPAttributeEditor(GridTab gridTab, GridField gridField, boolean tableEditor, IEditorConfiguration editorConfiguration)
	{
		super(new PAttributebox(), gridField, tableEditor, editorConfiguration);
		setGridTab(gridTab);
		initComponents();
	}

	/**
	 * Init component and context menu
	 */
	private void initComponents() {
		if (ThemeManager.isUseFontIconForImage())
			getComponent().getButton().setIconSclass(Icon.getIconSclass(Icon.PATTRIBUTE));
		else
			getComponent().setButtonImage(ThemeManager.getThemeResource("images/PAttribute16.png"));

		m_WindowNo = gridField.getWindowNo();
		m_mPAttribute = gridField.getLookup();
		m_C_BPartner_ID = Env.getContextAsInt(Env.getCtx(), m_WindowNo, "C_BPartner_ID");

		//	Popup
		popupMenu = new WEditorPopupMenu(true, false, false);
		addChangeLogMenu(popupMenu);
		
		getComponent().getTextbox().setReadonly(true);

		if (gridField != null)
			getComponent().getTextbox().setPlaceholder(gridField.getPlaceholder());
	}

	@Override
	public PAttributebox getComponent()
	{
		return (PAttributebox) component;
	}

	@Override
	public void setValue(Object value)
	{
		if (value == null || NO_INSTANCE.equals(value))
		{
			getComponent().setText("");
			m_value = value;
			return;
		}

		//	The same
		if (value.equals(m_value))
			return;
		//	new value
		if (log.isLoggable(Level.FINE)) log.fine("Value=" + value);
		m_value = value;
		getComponent().setText(m_mPAttribute.getDisplay(value));	//	loads value
	}

	@Override
	public Object getValue()
	{
		return m_value;
	}

	@Override
	public String getDisplay()
	{
		return getComponent().getText();
	}

	@Override
	public void onEvent(Event event)
	{
		if (Events.ON_CHANGE.equals(event.getName()) || Events.ON_OK.equals(event.getName()))
		{
			String newText = getComponent().getText();
			String oldText = null;
			if (m_value != null)
			{
				oldText = m_mPAttribute.getDisplay(m_value);
			}
			if (oldText != null && newText != null && oldText.equals(newText))
			{
	    	    return;
	    	}
	        if (oldText == null && newText == null)
	        {
	        	return;
	        }
			ValueChangeEvent changeEvent = new ValueChangeEvent(this, this.getColumnName(), oldText, newText);
			fireValueChange(changeEvent);
		}
		else if (Events.ON_CLICK.equals(event.getName()))
		{
			cmd_dialog();
		}
	}

	/**
	 *  Open {@link WPAttributeDialog}
	 */
	private void cmd_dialog()
	{
		Integer oldValue = (Integer)getValue ();
		final int oldValueInt = oldValue == null ? 0 : oldValue.intValue ();
		int M_AttributeSetInstance_ID = oldValueInt;
		int M_Product_ID = 0;
		int M_ProductBOM_ID = 0;
		if (gridTab != null) {
			M_Product_ID = Env.getContextAsInt (Env.getCtx (), m_WindowNo, gridTab.getTabNo(), "M_Product_ID");
			M_ProductBOM_ID = Env.getContextAsInt (Env.getCtx (), m_WindowNo, gridTab.getTabNo(), "M_ProductBOM_ID");
			//For third level tab (e.g, LineMA), should take M_Product_ID from Line instead of from Header
			if (gridTab.getTabLevel() > 1 && gridTab.getParentTab() != null && gridTab.getField("M_Product_ID")==null) {
				int tmp = Env.getContextAsInt (Env.getCtx (), m_WindowNo, gridTab.getParentTab().getTabNo(), "M_Product_ID");
				if (tmp > 0)
					M_Product_ID = tmp;
			}
		} else {
			M_Product_ID = Env.getContextAsInt (Env.getCtx (), m_WindowNo, "M_Product_ID");
			M_ProductBOM_ID = Env.getContextAsInt (Env.getCtx (), m_WindowNo, "M_ProductBOM_ID");
		}

		if (log.isLoggable(Level.CONFIG)) log.config("M_Product_ID=" + M_Product_ID + "/" + M_ProductBOM_ID
			+ ",M_AttributeSetInstance_ID=" + M_AttributeSetInstance_ID
			+ ", AD_Column_ID=" + gridField.getAD_Column_ID());

		//	M_Product.M_AttributeSetInstance_ID = 8418
		final boolean productWindow = (gridField.getAD_Column_ID() == COLUMN_M_PRODUCT_M_ATTRIBUTESETINSTANCE_ID);		//	HARDCODED

		if (M_ProductBOM_ID != 0)	//	Use BOM Component
			M_Product_ID = M_ProductBOM_ID;
		//
		if (!productWindow && (M_Product_ID == 0))
		{
			getComponent().setText(null);
			M_AttributeSetInstance_ID = 0;
			
			processChanges(oldValueInt, M_AttributeSetInstance_ID);
		}
		else
		{
			final WPAttributeDialog vad = new WPAttributeDialog (
				M_AttributeSetInstance_ID, M_Product_ID, m_C_BPartner_ID,
				productWindow, gridField.getAD_Column_ID(), m_WindowNo);
			vad.addEventListener(DialogEvents.ON_WINDOW_CLOSE, new EventListener<Event>() {

				@Override
				public void onEvent(Event event) throws Exception {
					boolean changed = false;
					int M_AttributeSetInstance_ID = 0;
					if (vad.isChanged())
					{
						getComponent().setText(vad.getM_AttributeSetInstanceName());
						M_AttributeSetInstance_ID = vad.getM_AttributeSetInstance_ID();
						if (gridTab != null && !productWindow && vad.getM_Locator_ID() > 0)
						{
							if (gridField.getColumnName().equals("M_AttributeSetInstanceTo_ID"))
								gridTab.setValue("M_LocatorTo_ID", vad.getM_Locator_ID());
							else
								gridTab.setValue("M_Locator_ID", vad.getM_Locator_ID());
							
						}
						changed = true;
					}
					
					//	Set Value
					if (changed)
					{
						processChanges(oldValueInt, M_AttributeSetInstance_ID);
					}	//	change
				}
			});
			
		}
	}   //  cmd_dialog

	/**
	 * Process new M_AttributeSetInstance_ID from {@link WPAttributeDialog}.
	 * @param oldValueInt
	 * @param M_AttributeSetInstance_ID
	 */
	private void processChanges(int oldValueInt, int M_AttributeSetInstance_ID) {
		if (log.isLoggable(Level.FINEST)) log.finest("Changed M_AttributeSetInstance_ID=" + M_AttributeSetInstance_ID);
		m_value = new Object();				//	force re-query display
		if (M_AttributeSetInstance_ID == 0)
			setValue(null);
		else
			setValue(Integer.valueOf(M_AttributeSetInstance_ID));

		ValueChangeEvent vce = new ValueChangeEvent(this, gridField.getColumnName(), new Object(), getValue());
		fireValueChange(vce);
		if (M_AttributeSetInstance_ID == oldValueInt && gridTab != null && gridField != null)
		{
			//  force Change - user does not realize that embedded object is already saved.
			gridTab.processFieldChange(gridField);
		}
	}

	@Override
	public String[] getEvents()
    {
        return LISTENER_EVENTS;
    }

	@Override
	public void onMenu(ContextMenuEvent evt)
	{
		if (WEditorPopupMenu.ZOOM_EVENT.equals(evt.getContextEvent()))
		{
			actionZoom();
		}
		else if (WEditorPopupMenu.CHANGE_LOG_EVENT.equals(evt.getContextEvent()))
		{
			WFieldRecordInfo.start(gridField);
		}
	}

	/**
	 * Zoom to record of {@link #getValue()}.
	 */
	public void actionZoom()
	{
	   	AEnv.actionZoom(m_mPAttribute, getValue());
	}

	@Override
	public boolean isReadWrite() {
		return getComponent().getButton().isEnabled();
	}

	@Override
	public void setReadWrite(boolean readWrite) {
		getComponent().setEnabled(readWrite);
		
		getComponent().getTextbox().setReadonly(true);
	}

	@Override
	public void setTableEditor(boolean b) {
		super.setTableEditor(b);
		getComponent().setTableEditorMode(b);
	}
}
