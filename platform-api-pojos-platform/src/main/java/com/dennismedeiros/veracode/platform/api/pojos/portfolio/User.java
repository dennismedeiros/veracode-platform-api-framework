package com.dennismedeiros.veracode.platform.api.pojos.portfolio;

import com.dennismedeiros.veracode.platform.api.pojos.accounts.LoginAccountType;

/**
 * Interface for accessing User Account type objects
 * 
 * @author Dennis Medeiros
 *
 */
public interface User {

	/**
	 * Gets the value of the loginAccountType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link LoginAccountType }
	 *     
	 */
	LoginAccountType getLoginAccountType();

	/**
	 * Sets the value of the loginAccountType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link LoginAccountType }
	 *     
	 */
	//void setLoginAccountType(LoginAccountType value);

	/**
	 * Gets the value of the username property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getUsername();

	/**
	 * Sets the value of the username property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	//void setUsername(String value);

	/**
	 * Gets the value of the createApplicationProfile property.
	 * @return Returns true if 
	 */
	boolean isCreateApplicationProfile();

	/**
	 * Sets the value of the createApplicationProfile property.
	 * @param value
	 *     allowed object is
	 *     {@link boolean } 
	 */
	//void setCreateApplicationProfile(boolean value);

	/**
	 * Gets the value of the createSandbox property.
	 * @return Returns true if
	 */
	boolean isCreateSandbox();

	/**
	 * Sets the value of the createSandbox property.
	 * 
	 */
	//void setCreateSandbox(boolean value);

	/**
	 * Gets the value of the createNewBuild property.
	 * @return Return true if
	 */
	boolean isCreateNewBuild();

	/**
	 * Sets the value of the createNewBuild property.
	 * 
	 */
	//void setCreateNewBuild(boolean value);

	/**
	 * Gets the value of the createPolicyScan property.
	 * @return Returns true if
	 */
	boolean isCreatePolicyScan();

	/**
	 * Sets the value of the createPolicyScan property.
	  * @param value
	 *     allowed object is
	 *     {@link String }
	 */
	//void setCreatePolicyScan(boolean value);

	/**
	 * Gets the value of the createSandboxScan property.
	 * @return Returns true if
	 */
	boolean isCreateSandboxScan();

	/**
	 * Sets the value of the createSandboxScan property.
	  * @param value
	 *     allowed object is
	 *     {@link String } 
	 */
	//void setCreateSandboxScan(boolean value);

	/**
	 * Gets the value of the assignAppToTeam property.
	 * @return Returns true if
	 */
	boolean isAssignAppToTeam();

	/**
	 * Sets the value of the assignAppToTeam property.
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 */
	//void setAssignAppToTeam(boolean value);

	/**
	 * Gets the value of the assignAppToAnyTeam property.
	 * @return Returns true if
	 */
	boolean isAssignAppToAnyTeam();

	/**
	 * Sets the value of the assignAppToAnyTeam property.
	 * @param value
	 *     allowed object is
	 *     {@link boolean }
	 */
	//void setAssignAppToAnyTeam(boolean value);

	/**
	 * Gets the value of the viewSandbox property.
	 * @return Returns true if
	 */
	boolean isViewSandbox();

	/**
	 * Sets the value of the viewSandbox property.
	 * @param value
	 *     allowed object is
	 *     {@link boolean }
	 */
	//void setViewSandbox(boolean value);

	/**
	 * Gets the value of the viewResults property.
	 * @return Returns true if 
	 */
	boolean isViewResults();

	/**
	 * Sets the value of the viewResults property.
	 * @param value
	 *     allowed object is
	 *     {@link boolean }
	 */
	//void setViewResults(boolean value);

	/**
	 * Gets the value of the approveMitigations property.
	 * @return Returns true if
	 */
	boolean isApproveMitigations();

	/**
	 * Sets the value of the approveMitigations property.
	 * @param value
	 *     allowed object is
	 *     {@link boolean } 
	 */
	//void setApproveMitigations(boolean value);

	/**
	 * Gets the value of the submitStaticScan property.
	 * @return Return true if
	 */
	boolean isSubmitStaticScan();

	/**
	 * Sets the value of the submitStaticScan property.
	 * @param value
	 *     allowed object is
	 *     {@link String } 
	 */
	//void setSubmitStaticScan(boolean value);

	/**
	 * Gets the value of the submitPolicyStaticScan property.
	 * @return Returns true if
	 */
	boolean isSubmitPolicyStaticScan();

	/**
	 * Sets the value of the submitPolicyStaticScan property.
	 * @param value
	 *     allowed object is
	 *     {@link boolean }
	 */
	//void setSubmitPolicyStaticScan(boolean value);

	/**
	 * Gets the value of the submitSandboxStaticScan property.
	 * @return Returns a boolean if SubmitSandboxStaticScan
	 */
	boolean isSubmitSandboxStaticScan();

	/**
	 * Sets the value of the submitSandboxStaticScan property.
	 * @param value
	 *     allowed object is
	 *     {@link boolean } 
	 */
	//void setSubmitSandboxStaticScan(boolean value);

}