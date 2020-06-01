package com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.mitigations;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "issue",
    "error"
})
@XmlRootElement(name = "mitigationinfo")
public class MitigationInfo {

    protected List<Issue> issue;
    protected List<ErrorMessage> error;
    @XmlAttribute(name = "mitigationinfo_version")
    protected String mitigationinfoVersion;
    @XmlAttribute(name = "build_id")
    protected Long buildId;

    /**
     * Gets the value of the issue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Issue }
     * 
     * @return List of Issue objects
     */
    public List<Issue> getIssues() {
        if (issue == null) {
            issue = new ArrayList<Issue>();
        }
        return this.issue;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorMessage }
     * 
     * @return Returns a list of Error Messages
     */
    public List<ErrorMessage> getErrors() {
        if (error == null) {
            error = new ArrayList<ErrorMessage>();
        }
        return this.error;
    }

    /**
     * Gets the value of the mitigationinfoVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMitigationinfoVersion() {
        return mitigationinfoVersion;
    }

    /**
     * Sets the value of the mitigationinfoVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMitigationinfoVersion(String value) {
        this.mitigationinfoVersion = value;
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

}
