//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.03 at 10:56:01 AM EST 
//


package com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.sast.datapath;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "callstack"
})
@XmlRootElement(name = "callstacks")
public class DataPaths {

    protected List<CallStackType> callstack;
    @XmlAttribute(name = "callstacks_version")
    protected String callstacksVersion;
    @XmlAttribute(name = "build_id")
    protected Long buildId;
    @XmlAttribute(name = "flaw_id")
    protected Long flawId;

    /**
     * Gets the value of the callstack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callstack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallstack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallStackType }
     * 
     * @return Returns a list of objects
     */
    public List<CallStackType> getCallstacks() {
        if (callstack == null) {
            callstack = new ArrayList<CallStackType>();
        }
        return this.callstack;
    }

    /**
     * Gets the value of the callstacksVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallstacksVersion() {
        return callstacksVersion;
    }

    /**
     * Sets the value of the callstacksVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallstacksVersion(String value) {
        this.callstacksVersion = value;
    }

    /**
     * Gets the value of the buildId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBuildId() {
        return buildId;
    }

    /**
     * Sets the value of the buildId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBuildId(Long value) {
        this.buildId = value;
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

}
