package com.dennismedeiros.veracode.platform.api.pojos.reporting.common;

import java.math.BigInteger;
import java.util.List;

public interface Category {

	ParagraphList getDesc();

	/**
	 * Gets the value of the recommendations property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ParagraphSequence }
	 *     
	 */
	ParagraphList getRecommendations();


	/**
	 * Gets the value of the cwe property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the cwe property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getCwe().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CweCategory }
	 * 
	 * @return list of CweCategory objects
	 */
	List<CweCategory> getCWEs();

	/**
	 * Gets the value of the categoryid property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getCategoryid();

	/**
	 * Gets the value of the categoryname property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getName();

	/**
	 * Gets the value of the pcirelated property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Boolean }
	 *     
	 */
	Boolean isPcirelated();
}