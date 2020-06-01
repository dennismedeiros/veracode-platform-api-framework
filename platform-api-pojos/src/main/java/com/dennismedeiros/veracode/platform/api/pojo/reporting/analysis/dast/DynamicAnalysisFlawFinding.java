package com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.dast;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.ExploitAdjustmentListType;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.Finding;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.IExploitAdjustmentListType;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.mast.Appendix;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.mast.AppendixType;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.mast.IAnnotationListType;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.AnnotationListType;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.findings.MitigationList;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.findings.MitigationListType;

//@XmlAccessorType(XmlAccessType.NONE)
//@XmlType(name = "FlawType", namespace = "default", propOrder = { "mitigations", "exploitabilityAdjustments",
//		"annotations", "exploitDesc", "severityDesc", "remediationDesc", "appendix" })
public class DynamicAnalysisFlawFinding extends Finding implements DynamicAnalysisFlawFind {

	@XmlElement(name = "mitigations", type = MitigationListType.class)
	protected MitigationList mitigations;
	@XmlElement(name = "exploitability_adjustments", type = ExploitAdjustmentListType.class)
	protected IExploitAdjustmentListType exploitabilityAdjustments;
	@XmlElement(name = "annotations", type = AnnotationListType.class)
	protected IAnnotationListType annotations;
	@XmlElement(name = "exploit_desc")
	protected String exploitDesc;
	@XmlElement(name = "severity_desc")
	protected String severityDesc;
	@XmlElement(name = "remediation_desc")
	protected String remediationDesc;
	@XmlElement(name = "appendix", type = AppendixType.class)
	protected Appendix appendix;
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
	@XmlAttribute(name = "type", required = true)
	protected String type;
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
	@XmlAttribute(name = "date_first_occurrence", required = true)
	protected String dateFirstOccurrence;
	@XmlAttribute(name = "remediation_status", required = true)
	protected String remediationStatus;
	@XmlAttribute(name = "sourcefile")
	protected String sourcefile;
	@XmlAttribute(name = "line")
	protected BigInteger line;
	@XmlAttribute(name = "sourcefilepath")
	protected String sourcefilepath;
	@XmlAttribute(name = "scope")
	protected String scope;
	@XmlAttribute(name = "functionprototype")
	protected String functionprototype;
	@XmlAttribute(name = "functionrelativelocation")
	protected BigInteger functionrelativelocation;
	@XmlAttribute(name = "url")
	protected String url;
	@XmlAttribute(name = "vuln_parameter")
	protected String vulnParameter;
	@XmlAttribute(name = "procedure_name")
	protected String procedureName;
	@XmlAttribute(name = "procedure_hash")
	protected String procedureHash;
	@XmlAttribute(name = "prototype_hash")
	protected String prototypeHash;
	@XmlAttribute(name = "statement_hash")
	protected String statementHash;
	@XmlAttribute(name = "statement_hash_count")
	protected BigInteger statementHashCount;
	@XmlAttribute(name = "statement_hash_ordinal")
	protected BigInteger statementHashOrdinal;
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
	public BigInteger getCategoryId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCategoryName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigInteger getCweid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSeverityId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getSeverityDesc() {
		// TODO Auto-generated method stub
		return null;
	}

}
