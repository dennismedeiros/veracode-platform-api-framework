//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.30 at 11:12:48 AM EDT 
//


package com.dennismedeiros.veracode.platform.api.pojos.reporting.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldType")
public class CustomFieldEntity implements CustomField {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "value")
    protected String value;

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.ICustomFieldType#getName()
	 */
    @Override
	public String getName() {
        return name;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.ICustomFieldType#setName(java.lang.String)
	 */
    @Override
	public void setName(String value) {
        this.name = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.ICustomFieldType#getValue()
	 */
    @Override
	public String getValue() {
        return value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.ICustomFieldType#setValue(java.lang.String)
	 */
    @Override
	public void setValue(String value) {
        this.value = value;
    }

}