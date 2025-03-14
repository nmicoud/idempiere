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

/** Generated Model for AD_Table
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_Table")
public class X_AD_Table extends PO implements I_AD_Table, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_Table (Properties ctx, int AD_Table_ID, String trxName)
    {
      super (ctx, AD_Table_ID, trxName);
      /** if (AD_Table_ID == 0)
        {
			setAD_Table_ID (0);
			setAccessLevel (null);
// 4
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsChangeLog (true);
// Y
			setIsDeleteable (true);
// Y
			setIsHighVolume (false);
			setIsPartition (false);
// N
			setIsSecurityEnabled (false);
			setIsView (false);
// N
			setName (null);
			setReplicationType (null);
// L
			setTableName (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_Table (Properties ctx, int AD_Table_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Table_ID, trxName, virtualColumns);
      /** if (AD_Table_ID == 0)
        {
			setAD_Table_ID (0);
			setAccessLevel (null);
// 4
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsChangeLog (true);
// Y
			setIsDeleteable (true);
// Y
			setIsHighVolume (false);
			setIsPartition (false);
// N
			setIsSecurityEnabled (false);
			setIsView (false);
// N
			setName (null);
			setReplicationType (null);
// L
			setTableName (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_Table (Properties ctx, String AD_Table_UU, String trxName)
    {
      super (ctx, AD_Table_UU, trxName);
      /** if (AD_Table_UU == null)
        {
			setAD_Table_ID (0);
			setAccessLevel (null);
// 4
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsChangeLog (true);
// Y
			setIsDeleteable (true);
// Y
			setIsHighVolume (false);
			setIsPartition (false);
// N
			setIsSecurityEnabled (false);
			setIsView (false);
// N
			setName (null);
			setReplicationType (null);
// L
			setTableName (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_Table (Properties ctx, String AD_Table_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Table_UU, trxName, virtualColumns);
      /** if (AD_Table_UU == null)
        {
			setAD_Table_ID (0);
			setAccessLevel (null);
// 4
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsChangeLog (true);
// Y
			setIsDeleteable (true);
// Y
			setIsHighVolume (false);
			setIsPartition (false);
// N
			setIsSecurityEnabled (false);
			setIsView (false);
// N
			setName (null);
			setReplicationType (null);
// L
			setTableName (null);
        } */
    }

    /** Load Constructor */
    public X_AD_Table (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System
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
      StringBuilder sb = new StringBuilder ("X_AD_Table[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Table.
		@param AD_Table_ID Database Table information
	*/
	public void setAD_Table_ID (int AD_Table_ID)
	{
		if (AD_Table_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_Table_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
	}

	/** Get Table.
		@return Database Table information
	  */
	public int getAD_Table_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_Table_UU.
		@param AD_Table_UU AD_Table_UU
	*/
	public void setAD_Table_UU (String AD_Table_UU)
	{
		set_Value (COLUMNNAME_AD_Table_UU, AD_Table_UU);
	}

	/** Get AD_Table_UU.
		@return AD_Table_UU	  */
	public String getAD_Table_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_Table_UU);
	}

	public org.compiere.model.I_AD_Val_Rule getAD_Val_Rule() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Val_Rule)MTable.get(getCtx(), org.compiere.model.I_AD_Val_Rule.Table_ID)
			.getPO(getAD_Val_Rule_ID(), get_TrxName());
	}

	/** Set Dynamic Validation.
		@param AD_Val_Rule_ID Dynamic Validation Rule
	*/
	public void setAD_Val_Rule_ID (int AD_Val_Rule_ID)
	{
		if (AD_Val_Rule_ID < 1)
			set_Value (COLUMNNAME_AD_Val_Rule_ID, null);
		else
			set_Value (COLUMNNAME_AD_Val_Rule_ID, Integer.valueOf(AD_Val_Rule_ID));
	}

	/** Get Dynamic Validation.
		@return Dynamic Validation Rule
	  */
	public int getAD_Val_Rule_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Val_Rule_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_Window getAD_Window() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Window)MTable.get(getCtx(), org.compiere.model.I_AD_Window.Table_ID)
			.getPO(getAD_Window_ID(), get_TrxName());
	}

	/** Set Window.
		@param AD_Window_ID Data entry or display window
	*/
	public void setAD_Window_ID (int AD_Window_ID)
	{
		if (AD_Window_ID < 1)
			set_Value (COLUMNNAME_AD_Window_ID, null);
		else
			set_Value (COLUMNNAME_AD_Window_ID, Integer.valueOf(AD_Window_ID));
	}

	/** Get Window.
		@return Data entry or display window
	  */
	public int getAD_Window_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Window_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** AccessLevel AD_Reference_ID=5 */
	public static final int ACCESSLEVEL_AD_Reference_ID=5;
	/** Organization = 1 */
	public static final String ACCESSLEVEL_Organization = "1";
	/** Client only = 2 */
	public static final String ACCESSLEVEL_ClientOnly = "2";
	/** Client+Organization = 3 */
	public static final String ACCESSLEVEL_ClientPlusOrganization = "3";
	/** System only = 4 */
	public static final String ACCESSLEVEL_SystemOnly = "4";
	/** System+Client = 6 */
	public static final String ACCESSLEVEL_SystemPlusClient = "6";
	/** All = 7 */
	public static final String ACCESSLEVEL_All = "7";
	/** Set Data Access Level.
		@param AccessLevel Access Level required
	*/
	public void setAccessLevel (String AccessLevel)
	{

		set_Value (COLUMNNAME_AccessLevel, AccessLevel);
	}

	/** Get Data Access Level.
		@return Access Level required
	  */
	public String getAccessLevel()
	{
		return (String)get_Value(COLUMNNAME_AccessLevel);
	}

	/** Set Copy Columns From Table.
		@param CopyColumnsFromTable Copy Columns From Table
	*/
	public void setCopyColumnsFromTable (String CopyColumnsFromTable)
	{
		set_Value (COLUMNNAME_CopyColumnsFromTable, CopyColumnsFromTable);
	}

	/** Get Copy Columns From Table.
		@return Copy Columns From Table	  */
	public String getCopyColumnsFromTable()
	{
		return (String)get_Value(COLUMNNAME_CopyColumnsFromTable);
	}

	/** Set Copy Components From View.
		@param CopyComponentsFromView Copy Components From View
	*/
	public void setCopyComponentsFromView (String CopyComponentsFromView)
	{
		set_Value (COLUMNNAME_CopyComponentsFromView, CopyComponentsFromView);
	}

	/** Get Copy Components From View.
		@return Copy Components From View	  */
	public String getCopyComponentsFromView()
	{
		return (String)get_Value(COLUMNNAME_CopyComponentsFromView);
	}

	/** Set Create/update partition.
		@param CreatePartition Process which create or update table partitions based on the table and column records
	*/
	public void setCreatePartition (String CreatePartition)
	{
		set_Value (COLUMNNAME_CreatePartition, CreatePartition);
	}

	/** Get Create/update partition.
		@return Process which create or update table partitions based on the table and column records
	  */
	public String getCreatePartition()
	{
		return (String)get_Value(COLUMNNAME_CreatePartition);
	}

	/** Set Create Window From Table.
		@param CreateWindowFromTable Create Window From Table
	*/
	public void setCreateWindowFromTable (String CreateWindowFromTable)
	{
		set_Value (COLUMNNAME_CreateWindowFromTable, CreateWindowFromTable);
	}

	/** Get Create Window From Table.
		@return Create Window From Table	  */
	public String getCreateWindowFromTable()
	{
		return (String)get_Value(COLUMNNAME_CreateWindowFromTable);
	}

	/** Set Drop view.
		@param DatabaseViewDrop Drop view
	*/
	public void setDatabaseViewDrop (String DatabaseViewDrop)
	{
		set_Value (COLUMNNAME_DatabaseViewDrop, DatabaseViewDrop);
	}

	/** Get Drop view.
		@return Drop view	  */
	public String getDatabaseViewDrop()
	{
		return (String)get_Value(COLUMNNAME_DatabaseViewDrop);
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

	/** Set Import Table.
		@param ImportTable Import Table Columns from Database
	*/
	public void setImportTable (String ImportTable)
	{
		set_Value (COLUMNNAME_ImportTable, ImportTable);
	}

	/** Get Import Table.
		@return Import Table Columns from Database
	  */
	public String getImportTable()
	{
		return (String)get_Value(COLUMNNAME_ImportTable);
	}

	/** Set Centrally maintained.
		@param IsCentrallyMaintained Information maintained in System Element table
	*/
	public void setIsCentrallyMaintained (boolean IsCentrallyMaintained)
	{
		set_Value (COLUMNNAME_IsCentrallyMaintained, Boolean.valueOf(IsCentrallyMaintained));
	}

	/** Get Centrally maintained.
		@return Information maintained in System Element table
	  */
	public boolean isCentrallyMaintained()
	{
		Object oo = get_Value(COLUMNNAME_IsCentrallyMaintained);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Maintain Change Log.
		@param IsChangeLog Maintain a log of changes
	*/
	public void setIsChangeLog (boolean IsChangeLog)
	{
		set_Value (COLUMNNAME_IsChangeLog, Boolean.valueOf(IsChangeLog));
	}

	/** Get Maintain Change Log.
		@return Maintain a log of changes
	  */
	public boolean isChangeLog()
	{
		Object oo = get_Value(COLUMNNAME_IsChangeLog);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Records deletable.
		@param IsDeleteable Indicates if records can be deleted from the database
	*/
	public void setIsDeleteable (boolean IsDeleteable)
	{
		set_Value (COLUMNNAME_IsDeleteable, Boolean.valueOf(IsDeleteable));
	}

	/** Get Records deletable.
		@return Indicates if records can be deleted from the database
	  */
	public boolean isDeleteable()
	{
		Object oo = get_Value(COLUMNNAME_IsDeleteable);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set High Volume.
		@param IsHighVolume Use Search instead of Pick list
	*/
	public void setIsHighVolume (boolean IsHighVolume)
	{
		set_Value (COLUMNNAME_IsHighVolume, Boolean.valueOf(IsHighVolume));
	}

	/** Get High Volume.
		@return Use Search instead of Pick list
	  */
	public boolean isHighVolume()
	{
		Object oo = get_Value(COLUMNNAME_IsHighVolume);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Partition.
		@param IsPartition This is a partitioned table
	*/
	public void setIsPartition (boolean IsPartition)
	{
		set_Value (COLUMNNAME_IsPartition, Boolean.valueOf(IsPartition));
	}

	/** Get Partition.
		@return This is a partitioned table
	  */
	public boolean isPartition()
	{
		Object oo = get_Value(COLUMNNAME_IsPartition);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Security enabled.
		@param IsSecurityEnabled If security is enabled, user access to data can be restricted via Roles
	*/
	public void setIsSecurityEnabled (boolean IsSecurityEnabled)
	{
		set_Value (COLUMNNAME_IsSecurityEnabled, Boolean.valueOf(IsSecurityEnabled));
	}

	/** Get Security enabled.
		@return If security is enabled, user access to data can be restricted via Roles
	  */
	public boolean isSecurityEnabled()
	{
		Object oo = get_Value(COLUMNNAME_IsSecurityEnabled);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Show In Drill Options.
		@param IsShowInDrillOptions This parameter enables the table to be displayed in Drill Assistant - Table tab
	*/
	public void setIsShowInDrillOptions (boolean IsShowInDrillOptions)
	{
		set_Value (COLUMNNAME_IsShowInDrillOptions, Boolean.valueOf(IsShowInDrillOptions));
	}

	/** Get Show In Drill Options.
		@return This parameter enables the table to be displayed in Drill Assistant - Table tab
	  */
	public boolean isShowInDrillOptions()
	{
		Object oo = get_Value(COLUMNNAME_IsShowInDrillOptions);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set View.
		@param IsView This is a view
	*/
	public void setIsView (boolean IsView)
	{
		set_Value (COLUMNNAME_IsView, Boolean.valueOf(IsView));
	}

	/** Get View.
		@return This is a view
	  */
	public boolean isView()
	{
		Object oo = get_Value(COLUMNNAME_IsView);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Sequence.
		@param LoadSeq Sequence
	*/
	public void setLoadSeq (int LoadSeq)
	{
		set_ValueNoCheck (COLUMNNAME_LoadSeq, Integer.valueOf(LoadSeq));
	}

	/** Get Sequence.
		@return Sequence	  */
	public int getLoadSeq()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LoadSeq);
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

	public org.compiere.model.I_AD_Window getPO_Window() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Window)MTable.get(getCtx(), org.compiere.model.I_AD_Window.Table_ID)
			.getPO(getPO_Window_ID(), get_TrxName());
	}

	/** Set PO Window.
		@param PO_Window_ID Purchase Order Window
	*/
	public void setPO_Window_ID (int PO_Window_ID)
	{
		if (PO_Window_ID < 1)
			set_Value (COLUMNNAME_PO_Window_ID, null);
		else
			set_Value (COLUMNNAME_PO_Window_ID, Integer.valueOf(PO_Window_ID));
	}

	/** Get PO Window.
		@return Purchase Order Window
	  */
	public int getPO_Window_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PO_Window_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** ReplicationType AD_Reference_ID=126 */
	public static final int REPLICATIONTYPE_AD_Reference_ID=126;
	/** Broadcast = B */
	public static final String REPLICATIONTYPE_Broadcast = "B";
	/** Local = L */
	public static final String REPLICATIONTYPE_Local = "L";
	/** Merge = M */
	public static final String REPLICATIONTYPE_Merge = "M";
	/** Reference = R */
	public static final String REPLICATIONTYPE_Reference = "R";
	/** Set Replication Type.
		@param ReplicationType Type of Data Replication
	*/
	public void setReplicationType (String ReplicationType)
	{

		set_Value (COLUMNNAME_ReplicationType, ReplicationType);
	}

	/** Get Replication Type.
		@return Type of Data Replication
	  */
	public String getReplicationType()
	{
		return (String)get_Value(COLUMNNAME_ReplicationType);
	}

	/** Set DB Table Name.
		@param TableName Name of the table in the database
	*/
	public void setTableName (String TableName)
	{
		set_Value (COLUMNNAME_TableName, TableName);
	}

	/** Get DB Table Name.
		@return Name of the table in the database
	  */
	public String getTableName()
	{
		return (String)get_Value(COLUMNNAME_TableName);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getTableName());
    }
}