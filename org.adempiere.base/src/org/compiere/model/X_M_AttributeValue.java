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

/** Generated Model for M_AttributeValue
 *  @author iDempiere (generated)
 *  @version Release 13 - $Id$ */
@org.adempiere.base.Model(table="M_AttributeValue")
public class X_M_AttributeValue extends PO implements I_M_AttributeValue, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250301L;

    /** Standard Constructor */
    public X_M_AttributeValue (Properties ctx, int M_AttributeValue_ID, String trxName)
    {
      super (ctx, M_AttributeValue_ID, trxName);
      /** if (M_AttributeValue_ID == 0)
        {
			setM_AttributeValue_ID (0);
			setM_Attribute_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_M_AttributeValue (Properties ctx, int M_AttributeValue_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, M_AttributeValue_ID, trxName, virtualColumns);
      /** if (M_AttributeValue_ID == 0)
        {
			setM_AttributeValue_ID (0);
			setM_Attribute_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_M_AttributeValue (Properties ctx, String M_AttributeValue_UU, String trxName)
    {
      super (ctx, M_AttributeValue_UU, trxName);
      /** if (M_AttributeValue_UU == null)
        {
			setM_AttributeValue_ID (0);
			setM_Attribute_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_M_AttributeValue (Properties ctx, String M_AttributeValue_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, M_AttributeValue_UU, trxName, virtualColumns);
      /** if (M_AttributeValue_UU == null)
        {
			setM_AttributeValue_ID (0);
			setM_Attribute_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_M_AttributeValue (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client
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
      StringBuilder sb = new StringBuilder ("X_M_AttributeValue[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
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

	/** EntityType AD_Reference_ID=389 */
	public static final int ENTITYTYPE_AD_Reference_ID=389;
	/** Set Entity Type.
		@param EntityType Dictionary Entity Type; Determines ownership and synchronization
	*/
	public void setEntityType (String EntityType)
	{

		set_Value (COLUMNNAME_EntityType, EntityType);
	}

	/** Get Entity Type.
		@return Dictionary Entity Type; Determines ownership and synchronization
	  */
	public String getEntityType()
	{
		return (String)get_Value(COLUMNNAME_EntityType);
	}

	/** Set Attribute Value.
		@param M_AttributeValue_ID Product Attribute Value
	*/
	public void setM_AttributeValue_ID (int M_AttributeValue_ID)
	{
		if (M_AttributeValue_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_AttributeValue_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_AttributeValue_ID, Integer.valueOf(M_AttributeValue_ID));
	}

	/** Get Attribute Value.
		@return Product Attribute Value
	  */
	public int getM_AttributeValue_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeValue_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set M_AttributeValue_UU.
		@param M_AttributeValue_UU M_AttributeValue_UU
	*/
	public void setM_AttributeValue_UU (String M_AttributeValue_UU)
	{
		set_Value (COLUMNNAME_M_AttributeValue_UU, M_AttributeValue_UU);
	}

	/** Get M_AttributeValue_UU.
		@return M_AttributeValue_UU	  */
	public String getM_AttributeValue_UU()
	{
		return (String)get_Value(COLUMNNAME_M_AttributeValue_UU);
	}

	public org.compiere.model.I_M_Attribute getM_Attribute() throws RuntimeException
	{
		return (org.compiere.model.I_M_Attribute)MTable.get(getCtx(), org.compiere.model.I_M_Attribute.Table_ID)
			.getPO(getM_Attribute_ID(), get_TrxName());
	}

	/** Set Attribute.
		@param M_Attribute_ID Product Attribute
	*/
	public void setM_Attribute_ID (int M_Attribute_ID)
	{
		if (M_Attribute_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_Attribute_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_Attribute_ID, Integer.valueOf(M_Attribute_ID));
	}

	/** Get Attribute.
		@return Product Attribute
	  */
	public int getM_Attribute_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Attribute_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}