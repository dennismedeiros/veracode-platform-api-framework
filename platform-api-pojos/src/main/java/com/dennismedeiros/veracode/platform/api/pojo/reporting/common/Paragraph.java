package com.dennismedeiros.veracode.platform.api.pojo.reporting.common;

import java.util.List;

public interface Paragraph {


	List<Sentence> getBulletitem();

	/**
	 * Gets the value of the text property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getText();

	/**
	 * Sets the value of the text property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setText(String value);

}