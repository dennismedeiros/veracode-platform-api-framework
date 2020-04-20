package com.dennismedeiros.veracode.platform.api.pojo.portfolio;

import com.dennismedeiros.veracode.platform.api.pojo.accounts.LoginAccountType;

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
	void setLoginAccountType(LoginAccountType value);

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
	void setUsername(String value);

	/**
	 * Gets the value of the createApplicationProfile property.
	 * 
	 */
	boolean isCreateApplicationProfile();

	/**
	 * Sets the value of the createApplicationProfile property.
	 * 
	 */
	void setCreateApplicationProfile(boolean value);

	/**
	 * Gets the value of the createSandbox property.
	 * 
	 */
	boolean isCreateSandbox();

	/**
	 * Sets the value of the createSandbox property.
	 * 
	 */
	void setCreateSandbox(boolean value);

	/**
	 * Gets the value of the createNewBuild property.
	 * 
	 */
	boolean isCreateNewBuild();

	/**
	 * Sets the value of the createNewBuild property.
	 * 
	 */
	void setCreateNewBuild(boolean value);

	/**
	 * Gets the value of the createPolicyScan property.
	 * 
	 */
	boolean isCreatePolicyScan();

	/**
	 * Sets the value of the createPolicyScan property.
	 * 
	 */
	void setCreatePolicyScan(boolean value);

	/**
	 * Gets the value of the createSandboxScan property.
	 * 
	 */
	boolean isCreateSandboxScan();

	/**
	 * Sets the value of the createSandboxScan property.
	 * 
	 */
	void setCreateSandboxScan(boolean value);

	/**
	 * Gets the value of the assignAppToTeam property.
	 * 
	 */
	boolean isAssignAppToTeam();

	/**
	 * Sets the value of the assignAppToTeam property.
	 * 
	 */
	void setAssignAppToTeam(boolean value);

	/**
	 * Gets the value of the assignAppToAnyTeam property.
	 * 
	 */
	boolean isAssignAppToAnyTeam();

	/**
	 * Sets the value of the assignAppToAnyTeam property.
	 * 
	 */
	void setAssignAppToAnyTeam(boolean value);

	/**
	 * Gets the value of the viewSandbox property.
	 * 
	 */
	boolean isViewSandbox();

	/**
	 * Sets the value of the viewSandbox property.
	 * 
	 */
	void setViewSandbox(boolean value);

	/**
	 * Gets the value of the viewResults property.
	 * 
	 */
	boolean isViewResults();

	/**
	 * Sets the value of the viewResults property.
	 * 
	 */
	void setViewResults(boolean value);

	/**
	 * Gets the value of the approveMitigations property.
	 * 
	 */
	boolean isApproveMitigations();

	/**
	 * Sets the value of the approveMitigations property.
	 * 
	 */
	void setApproveMitigations(boolean value);

	/**
	 * Gets the value of the submitStaticScan property.
	 * 
	 */
	boolean isSubmitStaticScan();

	/**
	 * Sets the value of the submitStaticScan property.
	 * 
	 */
	void setSubmitStaticScan(boolean value);

	/**
	 * Gets the value of the submitPolicyStaticScan property.
	 * 
	 */
	boolean isSubmitPolicyStaticScan();

	/**
	 * Sets the value of the submitPolicyStaticScan property.
	 * 
	 */
	void setSubmitPolicyStaticScan(boolean value);

	/**
	 * Gets the value of the submitSandboxStaticScan property.
	 * 
	 */
	boolean isSubmitSandboxStaticScan();

	/**
	 * Sets the value of the submitSandboxStaticScan property.
	 * 
	 */
	void setSubmitSandboxStaticScan(boolean value);

}