//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.20 at 12:34:34 PM EDT 
//


package com.dennismedeiros.veracode.platform.api.pojos.portfolio.analyses.mitigations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MitigationActionType")
public class MitigationEntry implements Mitigation {

    @XmlAttribute(name = "action")
    protected MitigationAction action;
    @XmlAttribute(name = "desc")
    protected String desc;
    @XmlAttribute(name = "reviewer")
    protected String reviewer;
    @XmlAttribute(name = "date")
    protected String date;
    @XmlAttribute(name = "comment")
    protected String comment;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link MitigationAction }
     *     
     */
    @Override
	public MitigationAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link MitigationAction }
     *     
     */
    @Override
	public void setAction(MitigationAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
	public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the reviewer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getReviewer() {
        return reviewer;
    }

    /**
     * Sets the value of the reviewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
	public void setReviewer(String value) {
        this.reviewer = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
	public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
	public void setComment(String value) {
        this.comment = value;
    }

}