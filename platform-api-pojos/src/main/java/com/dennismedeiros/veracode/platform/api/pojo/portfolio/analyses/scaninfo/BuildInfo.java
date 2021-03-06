//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.29 at 10:08:25 AM EDT 
//


package com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.scaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "build"
})
@XmlRootElement(name = "buildinfo")
public class BuildInfo {

    @XmlElement(required = true)
    protected BuildType build;
    @XmlAttribute(name = "buildinfo_version", required = true)
    protected String buildinfoVersion;
    @XmlAttribute(name = "account_id", required = true)
    protected long accountId;
    @XmlAttribute(name = "app_id", required = true)
    protected long appId;
    @XmlAttribute(name = "sandbox_id")
    protected Long sandboxId;
    @XmlAttribute(name = "build_id", required = true)
    protected long buildId;
    @XmlAttribute(name = "dynamic_scan_type")
    protected DynamicScanType dynamicScanType;

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link BuildType }
     *     
     */
    public BuildType getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildType }
     *     
     */
    public void setBuild(BuildType value) {
        this.build = value;
    }

    /**
     * Gets the value of the buildinfoVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildinfoVersion() {
        return buildinfoVersion;
    }

    /**
     * Sets the value of the buildinfoVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildinfoVersion(String value) {
        this.buildinfoVersion = value;
    }

    /**
     * Gets the value of the accountId property.
     * @return account identifier
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * @param value  value of the Account identifier
     */
    public void setAccountId(long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the appId property.
     * @return application identifier
     */
    public long getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * @param value  value of the application portfolio identifier
     */
    public void setAppId(long value) {
        this.appId = value;
    }

    /**
     * Gets the value of the sandboxId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSandboxId() {
        return sandboxId;
    }

    /**
     * Sets the value of the sandboxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSandboxId(Long value) {
        this.sandboxId = value;
    }

    /**
     * Gets the value of the buildId property.
     * @return value representing the build identifier.
     */
    public long getBuildId() {
        return buildId;
    }

    /**
     * Sets the value of the buildId property.
     * @param value {@link Long} value to set for the build identifier
     * 		
     */
    public void setBuildId(long value) {
        this.buildId = value;
    }

    /**
     * Gets the value of the dynamicScanType property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicScanType }
     *     
     */
    public DynamicScanType getDynamicScanType() {
        return dynamicScanType;
    }

    /**
     * Sets the value of the dynamicScanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicScanType }
     *     
     */
    public void setDynamicScanType(DynamicScanType value) {
        this.dynamicScanType = value;
    }

}
