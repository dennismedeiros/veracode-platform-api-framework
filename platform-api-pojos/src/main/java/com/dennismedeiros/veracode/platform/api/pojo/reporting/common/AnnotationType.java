//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.30 at 11:12:48 AM EDT 
//


package com.dennismedeiros.veracode.platform.api.pojo.reporting.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import com.dennismedeiros.veracode.platform.api.pojo.analyses.mast.IAnnotationType;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AnnotationType")
public class AnnotationType implements IAnnotationType {

    @XmlAttribute(name = "action", required = true)
    protected String action;
    @XmlAttribute(name = "description", required = true)
    protected String description;
    @XmlAttribute(name = "user", required = true)
    protected String user;
    @XmlAttribute(name = "date", required = true)
    protected String date;

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAppendixType#getAction()
	 */
    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAnnotationType#getAction()
	 */
    @Override
	public String getAction() {
        return action;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAppendixType#setAction(java.lang.String)
	 */
    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAnnotationType#setAction(java.lang.String)
	 */
    @Override
	public void setAction(String value) {
        this.action = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAppendixType#getDescription()
	 */
    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAnnotationType#getDescription()
	 */
    @Override
	public String getDescription() {
        return description;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAppendixType#setDescription(java.lang.String)
	 */
    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAnnotationType#setDescription(java.lang.String)
	 */
    @Override
	public void setDescription(String value) {
        this.description = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAppendixType#getUser()
	 */
    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAnnotationType#getUser()
	 */
    @Override
	public String getUser() {
        return user;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAppendixType#setUser(java.lang.String)
	 */
    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAnnotationType#setUser(java.lang.String)
	 */
    @Override
	public void setUser(String value) {
        this.user = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAppendixType#getDate()
	 */
    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAnnotationType#getDate()
	 */
    @Override
	public String getDate() {
        return date;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAppendixType#setDate(java.lang.String)
	 */
    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IAnnotationType#setDate(java.lang.String)
	 */
    @Override
	public void setDate(String value) {
        this.date = value;
    }

}
