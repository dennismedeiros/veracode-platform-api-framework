package com.dennismedeiros.veracode.platform.api.pojos.analyses.sca;

import java.math.BigInteger;

public interface SoftwareCompositionAnalysis {

	/**
	 * Gets the value of the vulnerableComponents property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link VulnerableComponentList }
	 *     
	 */
	IVulnerableComponentList getVulnerableComponents();

	/**
	 * Sets the value of the vulnerableComponents property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link VulnerableComponentList }
	 *     
	 */
	void setVulnerableComponents(IVulnerableComponentList value);

	/**
	 * Gets the value of the thirdPartyComponents property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getThirdPartyComponents();

	/**
	 * Sets the value of the thirdPartyComponents property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setThirdPartyComponents(BigInteger value);

	/**
	 * Gets the value of the violatePolicy property.
	 * @return
	 *     possible object is
	 *     {@link BigInteger } 
	 */
	boolean isViolatePolicy();

	/**
	 * Sets the value of the violatePolicy property.
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 */
	void setViolatePolicy(boolean value);

	/**
	 * Gets the value of the componentsViolatedPolicy property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getComponentsViolatedPolicy();

	/**
	 * Sets the value of the componentsViolatedPolicy property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setComponentsViolatedPolicy(BigInteger value);

}