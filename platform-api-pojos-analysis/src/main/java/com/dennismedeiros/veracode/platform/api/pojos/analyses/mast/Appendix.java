package com.dennismedeiros.veracode.platform.api.pojos.analyses.mast;

import java.util.List;

public interface Appendix {

	/**
	 * Gets the value of the description property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getDescription();

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setDescription(String value);

	List<ScreenshotType> getScreenshot();

	List<String> getCode();

	/**
	 * Gets the value of the user property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */

}