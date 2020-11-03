package com.dennismedeiros.veracode.platform.api.pojos.portfolio.analyses.mitigations;

public interface Mitigation {

	/**
	 * Gets the value of the action property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link MitigationAction }
	 *     
	 */
	MitigationAction getAction();

	/**
	 * Sets the value of the action property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link MitigationAction }
	 *     
	 */
	void setAction(MitigationAction value);

	/**
	 * Gets the value of the desc property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getDesc();

	/**
	 * Sets the value of the desc property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setDesc(String value);

	/**
	 * Gets the value of the reviewer property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getReviewer();

	/**
	 * Sets the value of the reviewer property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setReviewer(String value);

	/**
	 * Gets the value of the date property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getDate();

	/**
	 * Sets the value of the date property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setDate(String value);

	/**
	 * Gets the value of the comment property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getComment();

	/**
	 * Sets the value of the comment property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setComment(String value);

}