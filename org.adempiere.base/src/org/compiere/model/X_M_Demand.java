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

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.KeyNamePair;

/** Generated Model for M_Demand
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="M_Demand")
public class X_M_Demand extends PO implements I_M_Demand, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_M_Demand (Properties ctx, int M_Demand_ID, String trxName)
    {
      super (ctx, M_Demand_ID, trxName);
      /** if (M_Demand_ID == 0)
        {
			setC_Calendar_ID (0);
			setC_Year_ID (0);
			setIsDefault (false);
			setM_Demand_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_M_Demand (Properties ctx, int M_Demand_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, M_Demand_ID, trxName, virtualColumns);
      /** if (M_Demand_ID == 0)
        {
			setC_Calendar_ID (0);
			setC_Year_ID (0);
			setIsDefault (false);
			setM_Demand_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_M_Demand (Properties ctx, String M_Demand_UU, String trxName)
    {
      super (ctx, M_Demand_UU, trxName);
      /** if (M_Demand_UU == null)
        {
			setC_Calendar_ID (0);
			setC_Year_ID (0);
			setIsDefault (false);
			setM_Demand_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_M_Demand (Properties ctx, String M_Demand_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, M_Demand_UU, trxName, virtualColumns);
      /** if (M_Demand_UU == null)
        {
			setC_Calendar_ID (0);
			setC_Year_ID (0);
			setIsDefault (false);
			setM_Demand_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_M_Demand (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 2 - Client
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
      StringBuilder sb = new StringBuilder ("X_M_Demand[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_Calendar getC_Calendar() throws RuntimeException
	{
		return (org.compiere.model.I_C_Calendar)MTable.get(getCtx(), org.compiere.model.I_C_Calendar.Table_ID)
			.getPO(getC_Calendar_ID(), get_TrxName());
	}

	/** Set Calendar.
		@param C_Calendar_ID Accounting Calendar Name
	*/
	public void setC_Calendar_ID (int C_Calendar_ID)
	{
		if (C_Calendar_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Calendar_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Calendar_ID, Integer.valueOf(C_Calendar_ID));
	}

	/** Get Calendar.
		@return Accounting Calendar Name
	  */
	public int getC_Calendar_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Calendar_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Year getC_Year() throws RuntimeException
	{
		return (org.compiere.model.I_C_Year)MTable.get(getCtx(), org.compiere.model.I_C_Year.Table_ID)
			.getPO(getC_Year_ID(), get_TrxName());
	}

	/** Set Year.
		@param C_Year_ID Calendar Year
	*/
	public void setC_Year_ID (int C_Year_ID)
	{
		if (C_Year_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Year_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Year_ID, Integer.valueOf(C_Year_ID));
	}

	/** Get Year.
		@return Calendar Year
	  */
	public int getC_Year_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Year_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Comment/Help.
		@param Help Comment or Hint
	*/
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp()
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	/** Set Default.
		@param IsDefault Default value
	*/
	public void setIsDefault (boolean IsDefault)
	{
		set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
	}

	/** Get Default.
		@return Default value
	  */
	public boolean isDefault()
	{
		Object oo = get_Value(COLUMNNAME_IsDefault);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Demand.
		@param M_Demand_ID Material Demand
	*/
	public void setM_Demand_ID (int M_Demand_ID)
	{
		if (M_Demand_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_Demand_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_Demand_ID, Integer.valueOf(M_Demand_ID));
	}

	/** Get Demand.
		@return Material Demand
	  */
	public int getM_Demand_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Demand_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set M_Demand_UU.
		@param M_Demand_UU M_Demand_UU
	*/
	public void setM_Demand_UU (String M_Demand_UU)
	{
		set_Value (COLUMNNAME_M_Demand_UU, M_Demand_UU);
	}

	/** Get M_Demand_UU.
		@return M_Demand_UU	  */
	public String getM_Demand_UU()
	{
		return (String)get_Value(COLUMNNAME_M_Demand_UU);
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Process Now.
		@param Processing Process Now
	*/
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing()
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}
}