/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for C_RevenueRecognition_Run
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_RevenueRecognition_Run")
public class X_C_RevenueRecognition_Run extends PO implements I_C_RevenueRecognition_Run, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_C_RevenueRecognition_Run (Properties ctx, int C_RevenueRecognition_Run_ID, String trxName)
    {
      super (ctx, C_RevenueRecognition_Run_ID, trxName);
      /** if (C_RevenueRecognition_Run_ID == 0)
        {
			setC_RevenueRecognition_Plan_ID (0);
			setC_RevenueRecognition_Run_ID (0);
			setRecognizedAmt (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_C_RevenueRecognition_Run (Properties ctx, int C_RevenueRecognition_Run_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_RevenueRecognition_Run_ID, trxName, virtualColumns);
      /** if (C_RevenueRecognition_Run_ID == 0)
        {
			setC_RevenueRecognition_Plan_ID (0);
			setC_RevenueRecognition_Run_ID (0);
			setRecognizedAmt (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_C_RevenueRecognition_Run (Properties ctx, String C_RevenueRecognition_Run_UU, String trxName)
    {
      super (ctx, C_RevenueRecognition_Run_UU, trxName);
      /** if (C_RevenueRecognition_Run_UU == null)
        {
			setC_RevenueRecognition_Plan_ID (0);
			setC_RevenueRecognition_Run_ID (0);
			setRecognizedAmt (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_C_RevenueRecognition_Run (Properties ctx, String C_RevenueRecognition_Run_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_RevenueRecognition_Run_UU, trxName, virtualColumns);
      /** if (C_RevenueRecognition_Run_UU == null)
        {
			setC_RevenueRecognition_Plan_ID (0);
			setC_RevenueRecognition_Run_ID (0);
			setRecognizedAmt (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_C_RevenueRecognition_Run (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 1 - Org
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_C_RevenueRecognition_Run[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_RevenueRecog_Service getC_RevenueRecog_Service() throws RuntimeException
	{
		return (org.compiere.model.I_C_RevenueRecog_Service)MTable.get(getCtx(), org.compiere.model.I_C_RevenueRecog_Service.Table_ID)
			.getPO(getC_RevenueRecog_Service_ID(), get_TrxName());
	}

	/** Set Revenue Recognition Service.
		@param C_RevenueRecog_Service_ID Revenue Recognition Service
	*/
	public void setC_RevenueRecog_Service_ID (int C_RevenueRecog_Service_ID)
	{
		if (C_RevenueRecog_Service_ID < 1)
			set_Value (COLUMNNAME_C_RevenueRecog_Service_ID, null);
		else
			set_Value (COLUMNNAME_C_RevenueRecog_Service_ID, Integer.valueOf(C_RevenueRecog_Service_ID));
	}

	/** Get Revenue Recognition Service.
		@return Revenue Recognition Service	  */
	public int getC_RevenueRecog_Service_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_RevenueRecog_Service_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_RevenueRecognition_Plan getC_RevenueRecognition_Plan() throws RuntimeException
	{
		return (org.compiere.model.I_C_RevenueRecognition_Plan)MTable.get(getCtx(), org.compiere.model.I_C_RevenueRecognition_Plan.Table_ID)
			.getPO(getC_RevenueRecognition_Plan_ID(), get_TrxName());
	}

	/** Set Revenue Recognition Plan.
		@param C_RevenueRecognition_Plan_ID Plan for recognizing or recording revenue
	*/
	public void setC_RevenueRecognition_Plan_ID (int C_RevenueRecognition_Plan_ID)
	{
		if (C_RevenueRecognition_Plan_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_RevenueRecognition_Plan_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_RevenueRecognition_Plan_ID, Integer.valueOf(C_RevenueRecognition_Plan_ID));
	}

	/** Get Revenue Recognition Plan.
		@return Plan for recognizing or recording revenue
	  */
	public int getC_RevenueRecognition_Plan_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_RevenueRecognition_Plan_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), String.valueOf(getC_RevenueRecognition_Plan_ID()));
    }

	/** Set Revenue Recognition Run.
		@param C_RevenueRecognition_Run_ID Revenue Recognition Run or Process
	*/
	public void setC_RevenueRecognition_Run_ID (int C_RevenueRecognition_Run_ID)
	{
		if (C_RevenueRecognition_Run_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_RevenueRecognition_Run_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_RevenueRecognition_Run_ID, Integer.valueOf(C_RevenueRecognition_Run_ID));
	}

	/** Get Revenue Recognition Run.
		@return Revenue Recognition Run or Process
	  */
	public int getC_RevenueRecognition_Run_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_RevenueRecognition_Run_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_RevenueRecognition_Run_UU.
		@param C_RevenueRecognition_Run_UU C_RevenueRecognition_Run_UU
	*/
	public void setC_RevenueRecognition_Run_UU (String C_RevenueRecognition_Run_UU)
	{
		set_Value (COLUMNNAME_C_RevenueRecognition_Run_UU, C_RevenueRecognition_Run_UU);
	}

	/** Get C_RevenueRecognition_Run_UU.
		@return C_RevenueRecognition_Run_UU	  */
	public String getC_RevenueRecognition_Run_UU()
	{
		return (String)get_Value(COLUMNNAME_C_RevenueRecognition_Run_UU);
	}

	/** Set Recognition Date.
		@param DateRecognized Recognition Date
	*/
	public void setDateRecognized (Timestamp DateRecognized)
	{
		set_Value (COLUMNNAME_DateRecognized, DateRecognized);
	}

	/** Get Recognition Date.
		@return Recognition Date	  */
	public Timestamp getDateRecognized()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateRecognized);
	}

	public org.compiere.model.I_GL_Journal getGL_Journal() throws RuntimeException
	{
		return (org.compiere.model.I_GL_Journal)MTable.get(getCtx(), org.compiere.model.I_GL_Journal.Table_ID)
			.getPO(getGL_Journal_ID(), get_TrxName());
	}

	/** Set Journal.
		@param GL_Journal_ID General Ledger Journal
	*/
	public void setGL_Journal_ID (int GL_Journal_ID)
	{
		if (GL_Journal_ID < 1)
			set_ValueNoCheck (COLUMNNAME_GL_Journal_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_GL_Journal_ID, Integer.valueOf(GL_Journal_ID));
	}

	/** Get Journal.
		@return General Ledger Journal
	  */
	public int getGL_Journal_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_Journal_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Recognized Amount.
		@param RecognizedAmt Recognized Amount
	*/
	public void setRecognizedAmt (BigDecimal RecognizedAmt)
	{
		set_ValueNoCheck (COLUMNNAME_RecognizedAmt, RecognizedAmt);
	}

	/** Get Recognized Amount.
		@return Recognized Amount	  */
	public BigDecimal getRecognizedAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RecognizedAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}