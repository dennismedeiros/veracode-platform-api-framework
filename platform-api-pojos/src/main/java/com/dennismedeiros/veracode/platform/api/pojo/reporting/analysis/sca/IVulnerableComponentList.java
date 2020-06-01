package com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.sca;

import java.util.List;

public interface IVulnerableComponentList {

	/**
	 * Gets the value of the component property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the component property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ComponentFile }
	 * 
	 * @return Return list of Component objects
	 */
	List<Component> getComponent();

}