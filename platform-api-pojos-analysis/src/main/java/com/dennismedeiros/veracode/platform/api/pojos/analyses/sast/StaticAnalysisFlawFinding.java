package com.dennismedeiros.veracode.platform.api.pojos.analyses.sast;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.dennismedeiros.veracode.platform.api.pojos.analyses.Finding;
import com.dennismedeiros.veracode.platform.api.pojos.analyses.mast.Appendix;
import com.dennismedeiros.veracode.platform.api.pojos.analyses.mast.AppendixType;


//@XmlRootElement(name="flaw")
//@XmlAccessorType(XmlAccessType.NONE)
//@XmlType(propOrder = { "mitigations", "exploitabilityAdjustments", "annotations",
//		"exploitDesc", "severityDesc", "remediationDesc", "appendix" })
public class StaticAnalysisFlawFinding extends Finding implements StaticAnalysisFlaw {
	
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

	@XmlAttribute(name = "module", required = true)
	protected String module;
	@XmlAttribute(name = "type", required = true)
	protected String attackVectorType;
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

	@XmlAttribute(name = "exploitdifficulty")
	protected Integer exploitdifficulty;
//	@XmlAttribute(name = "inputvector")
//	protected String inputvector;
	@XmlAttribute(name = "cia_impact", required = true)
	protected String ciaImpact;
	@XmlAttribute(name = "grace_period_expires", required = true)
	protected String gracePeriodExpires;
	@XmlAttribute(name = "affects_policy_compliance", required = true)
	protected boolean affectsPolicyCompliance;
	
	@Override
	public String getAttackVector() {
		return this.attackVectorType;
	}
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
	public String getCiaImpact() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BigInteger getCweid() {
		return this.cweid;
	}
	@Override
	public Integer getExploitdifficulty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getExploitLevel() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public FlawSignature getFlawSignature() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getFunctionPrototype() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BigInteger getFunctionRelativeLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getGracePeriodExpires() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getInputvector() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BigInteger getLineNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getModule() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Integer getModulePathCount() {
		return this.count;
	}
	@Override
	public String getProcedureHash() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getProcedureName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getPrototypeHash() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getRemediationEffort() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getScope() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getSeverityDesc() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getSeverityId() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getSourceFile() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getSourceFilePath() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getStatementHash() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BigInteger getStatementHashCount() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BigInteger getStatementHashOrdinal() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isAffectsPolicyCompliance() {
		// TODO Auto-generated method stub
		return false;
	}
}
