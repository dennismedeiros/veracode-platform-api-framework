package com.dennismedeiros.veracode.platform.api.pojo.analyses.mast;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;

import com.dennismedeiros.veracode.platform.api.pojo.analyses.Finding;

//@XmlAccessorType(XmlAccessType.NONE)
//@XmlType(name = "FlawType", namespace = "default", propOrder = { "mitigations", "exploitabilityAdjustments",
//		"annotations", "exploitDesc", "severityDesc", "remediationDesc", "appendix" })
public class ManualAnalysisFlawFinding extends Finding implements ManualAnalysisFlawFind {
	
	@XmlElement(name = "exploit_desc") //Manual Exploit Description
	protected String exploitDesc;
	@XmlElement(name = "severity_desc")
	protected String severityDesc;
    @XmlElement(name = "appendix", type = AppendixType.class)
	protected Appendix appendix;
	
	@XmlElement(name = "remediation_desc")
	protected String remediationDesc;

	@XmlAttribute(name = "severity", required = true)
	protected int severity;
	@XmlAttribute(name = "categoryname", required = true)
	protected String categoryname;
	@XmlAttribute(name = "count")
	protected Integer count;
	
	@XmlAttribute(name = "issueid", required = true)
	@XmlSchemaType(name = "positiveInteger")
	protected Integer issueid;
	@XmlAttribute(name = "module", required = true)
	protected String module;
	@XmlAttribute(name = "description", required = true)
	protected String description;
	@XmlAttribute(name = "note", required = true)
	protected String note;
	@XmlAttribute(name = "cweid", required = true)
	protected BigInteger cweid;
	@XmlAttribute(name = "remediationeffort", required = true)
	protected int remediationeffort;
	@XmlAttribute(name = "exploitLevel")
	protected Integer exploitLevel;
	@XmlAttribute(name = "categoryid", required = true)
	protected BigInteger categoryid;
	@XmlAttribute(name = "pcirelated")
	protected Boolean pcirelated;
	
	@XmlAttribute(name = "remediation_status", required = true)
	protected String remediationStatus;
	@XmlAttribute(name = "location")
	protected String location;
	@XmlAttribute(name = "cvss")
	protected BigDecimal cvss;
	@XmlAttribute(name = "capecid")
	protected Integer capecid;
	@XmlAttribute(name = "exploitdifficulty")
	protected Integer exploitdifficulty;
	@XmlAttribute(name = "inputvector")
	protected String inputvector;
	@XmlAttribute(name = "cia_impact", required = true)
	protected String ciaImpact;
	@XmlAttribute(name = "grace_period_expires", required = true)
	protected String gracePeriodExpires;
	@XmlAttribute(name = "affects_policy_compliance", required = true)
	protected boolean affectsPolicyCompliance;
	@XmlAttribute(name = "mitigation_status")
	protected String mitigationStatus;
	@XmlAttribute(name = "mitigation_status_desc")
	protected String mitigationStatusDesc;
	
	@Override
	public Appendix getAppendix() {
		return this.appendix;
	}

	@Override
	public String getExploitDesc() {
		return this.exploitDesc;
	}
	
	@Override
	public Double getCVSS() {
		return this.cvss.doubleValue();
	}

}
