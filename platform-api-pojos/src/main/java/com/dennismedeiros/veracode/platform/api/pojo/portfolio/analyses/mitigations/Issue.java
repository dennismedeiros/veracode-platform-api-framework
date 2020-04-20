//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.20 at 12:34:34 PM EDT 
//


package com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.mitigations;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueType", propOrder = {
    "mitigationAction"
})
public class Issue {

	
    @XmlElement(name = "mitigation_action",  type = MitigationEntry.class)
    protected List<Mitigation> mitigationAction;
    @XmlAttribute(name = "flaw_id")
    protected Long flawId;
    @XmlAttribute(name = "category")
    protected String category;

    /**
     * Gets the value of the mitigationAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mitigationAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMitigationAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MitigationEntry }
     * 
     * 
     */
    public List<Mitigation> getMitigationActions() {
        if (mitigationAction == null) {
            mitigationAction = new ArrayList<Mitigation>();
        }
        return this.mitigationAction;
    }

    /**
     * Gets the value of the flawId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFlawId() {
        return flawId;
    }

    /**
     * Sets the value of the flawId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFlawId(Long value) {
        this.flawId = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

}
