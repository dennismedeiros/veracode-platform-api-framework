//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.29 at 10:10:12 AM EDT 
//


package com.dennismedeiros.veracode.platform.api.pojos.portfolio.analyses.prescan;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This class respresents the content uploaded and configurable for the existing scan
 * @author Dennis Medeiros
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "module"
})
@XmlRootElement(name = "prescanresults")
public class PrescanResults {

    protected List<ModuleFile> module;
    @XmlAttribute(name = "prescanresults_version", required = true)
    protected String prescanresultsVersion;
    @XmlAttribute(name = "account_id")
    protected Long accountId;
    @XmlAttribute(name = "app_id")
    protected Long appId;
    @XmlAttribute(name = "sandbox_id")
    protected Long sandboxId;
    @XmlAttribute(name = "build_id")
    protected Long buildId;

    public List<ModuleFile> getParentModules() {
        if (module == null) {
            module = new ArrayList<ModuleFile>();
        }
        return this.module;
    }

    /**
     * Gets the value of the prescanresultsVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreScanResultsVersion() {
        return prescanresultsVersion;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }
    
    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationPortfolioId() {
        return appId;
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
     * Gets the value of the buildId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnalysisId() {
        return buildId;
    }
}