package com.dennismedeiros.veracode.platform.api.pojo.reporting.common;

import java.math.BigInteger;

public interface FlawStatus {

	/**
	 * Gets the value of the new property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getNew();

	/**
	 * Sets the value of the new property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setNew(BigInteger value);

	/**
	 * Gets the value of the reopen property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getReopen();

	/**
	 * Sets the value of the reopen property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setReopen(BigInteger value);

	/**
	 * Gets the value of the open property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getOpen();

	/**
	 * Sets the value of the open property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setOpen(BigInteger value);

	/**
	 * Gets the value of the cannotReproduce property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getCannotReproduce();

	/**
	 * Sets the value of the cannotReproduce property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setCannotReproduce(BigInteger value);

	/**
	 * Gets the value of the fixed property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getFixed();

	/**
	 * Sets the value of the fixed property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setFixed(BigInteger value);

	/**
	 * Gets the value of the total property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getTotal();

	/**
	 * Sets the value of the total property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setTotal(BigInteger value);

	/**
	 * Gets the value of the notMitigated property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getNotMitigated();

	/**
	 * Sets the value of the notMitigated property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setNotMitigated(BigInteger value);

	/**
	 * Gets the value of the sev1Change property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getSev1Change();

	/**
	 * Sets the value of the sev1Change property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setSev1Change(BigInteger value);

	/**
	 * Gets the value of the sev2Change property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getSev2Change();

	/**
	 * Sets the value of the sev2Change property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setSev2Change(BigInteger value);

	/**
	 * Gets the value of the sev3Change property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getSev3Change();

	/**
	 * Sets the value of the sev3Change property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setSev3Change(BigInteger value);

	/**
	 * Gets the value of the sev4Change property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getSev4Change();

	/**
	 * Sets the value of the sev4Change property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setSev4Change(BigInteger value);

	/**
	 * Gets the value of the sev5Change property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getSev5Change();

	/**
	 * Sets the value of the sev5Change property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setSev5Change(BigInteger value);

	/**
	 * Gets the value of the conformsToGuidelines property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getConformsToGuidelines();

	/**
	 * Sets the value of the conformsToGuidelines property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setConformsToGuidelines(BigInteger value);

	/**
	 * Gets the value of the deviatesFromGuidelines property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getDeviatesFromGuidelines();

	/**
	 * Sets the value of the deviatesFromGuidelines property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setDeviatesFromGuidelines(BigInteger value);

	/**
	 * Gets the value of the totalReviewedMitigations property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getTotalReviewedMitigations();

	/**
	 * Sets the value of the totalReviewedMitigations property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setTotalReviewedMitigations(BigInteger value);

}