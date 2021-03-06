//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.22 at 04:52:16 PM EDT 
//


package com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.scanlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import com.dennismedeiros.veracode.platform.api.pojo.Scan;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.scaninfo.DynamicScanType;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BuildType")
public class ScanEntity implements Scan {

    @XmlAttribute(name = "build_id")
    protected Long buildId;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "policy_updated_date")
    protected String policyUpdatedDate;
    @XmlAttribute(name = "dynamic_scan_type")
    protected DynamicScanType dynamicScanType;

    @Override
    public Long getId() {
        return buildId;
    }
    @Override
	public String getName() {
        return version;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.scanlist.IScan#getPolicyUpdatedDate()
	 */
    public String getPolicyUpdatedDate() {
        return policyUpdatedDate;
    }

    public DynamicScanType getDynamicScanType() {
        return dynamicScanType;
    }

	@Override
	public void setId(Long scanid) {
		this.buildId = scanid;
	}

	@Override
	public void setName(String name) {
		this.version = name;
	}
}
