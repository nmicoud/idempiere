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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for AD_SchedulerRecipient
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
public interface I_AD_SchedulerRecipient 
{

    /** TableName=AD_SchedulerRecipient */
    public static final String Table_Name = "AD_SchedulerRecipient";

    /** AD_Table_ID=704 */
    public static final int Table_ID = 704;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AD_AuthorizationAccount_ID */
    public static final String COLUMNNAME_AD_AuthorizationAccount_ID = "AD_AuthorizationAccount_ID";

	/** Set Authorization Account	  */
	public void setAD_AuthorizationAccount_ID (int AD_AuthorizationAccount_ID);

	/** Get Authorization Account	  */
	public int getAD_AuthorizationAccount_ID();

	public org.compiere.model.I_AD_AuthorizationAccount getAD_AuthorizationAccount() throws RuntimeException;

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name AD_Role_ID */
    public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";

	/** Set Role.
	  * Responsibility Role
	  */
	public void setAD_Role_ID (int AD_Role_ID);

	/** Get Role.
	  * Responsibility Role
	  */
	public int getAD_Role_ID();

	public org.compiere.model.I_AD_Role getAD_Role() throws RuntimeException;

    /** Column name AD_SchedulerRecipient_ID */
    public static final String COLUMNNAME_AD_SchedulerRecipient_ID = "AD_SchedulerRecipient_ID";

	/** Set Scheduler Recipient.
	  * Recipient of the Scheduler Notification
	  */
	public void setAD_SchedulerRecipient_ID (int AD_SchedulerRecipient_ID);

	/** Get Scheduler Recipient.
	  * Recipient of the Scheduler Notification
	  */
	public int getAD_SchedulerRecipient_ID();

    /** Column name AD_SchedulerRecipient_UU */
    public static final String COLUMNNAME_AD_SchedulerRecipient_UU = "AD_SchedulerRecipient_UU";

	/** Set AD_SchedulerRecipient_UU	  */
	public void setAD_SchedulerRecipient_UU (String AD_SchedulerRecipient_UU);

	/** Get AD_SchedulerRecipient_UU	  */
	public String getAD_SchedulerRecipient_UU();

    /** Column name AD_Scheduler_ID */
    public static final String COLUMNNAME_AD_Scheduler_ID = "AD_Scheduler_ID";

	/** Set Scheduler.
	  * Schedule Processes
	  */
	public void setAD_Scheduler_ID (int AD_Scheduler_ID);

	/** Get Scheduler.
	  * Schedule Processes
	  */
	public int getAD_Scheduler_ID();

	public org.compiere.model.I_AD_Scheduler getAD_Scheduler() throws RuntimeException;

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name FileName */
    public static final String COLUMNNAME_FileName = "FileName";

	/** Set File Name.
	  * Name of the local file or URL
	  */
	public void setFileName (String FileName);

	/** Get File Name.
	  * Name of the local file or URL
	  */
	public String getFileName();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsUpload */
    public static final String COLUMNNAME_IsUpload = "IsUpload";

	/** Set Upload	  */
	public void setIsUpload (boolean IsUpload);

	/** Get Upload	  */
	public boolean isUpload();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
