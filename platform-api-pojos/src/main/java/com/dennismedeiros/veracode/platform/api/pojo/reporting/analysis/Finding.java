package com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;

import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.mast.Appendix;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.mast.AppendixType;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.mast.IAnnotationListType;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.AnnotationListType;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.findings.Mitigation;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.findings.MitigationList;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.findings.MitigationListType;

//@XmlAccessorType(XmlAccessType.NONE)
//@XmlType(name = "FlawType", namespace = "default", propOrder = { "mitigations", "exploitabilityAdjustments",
//		"annotations", "exploitDesc", "severityDesc", "remediationDesc", "appendix" })
public abstract class Finding implements Find {

	@XmlElement(name = "annotations", type = AnnotationListType.class)
	protected IAnnotationListType annotations;
	@XmlElement(name = "appendix", type = AppendixType.class)
	protected Appendix appendix;
	@XmlAttribute(name = "date_first_occurrence", required = true)
	protected String dateFirstOccurrence;
	@XmlAttribute(name = "description", required = true)
	protected String description;
	@XmlElement(name = "exploitability_adjustments", type = ExploitAdjustmentListType.class)
	protected IExploitAdjustmentListType exploitabilityAdjustments;
	@XmlAttribute(name = "issueid", required = true)
	@XmlSchemaType(name = "positiveInteger")
	protected Integer issueid;
	@XmlElement(name = "mitigations", type = MitigationListType.class)
	protected MitigationList mitigations;
	@XmlAttribute(name = "mitigation_status")
	protected String mitigationStatus;
	@XmlAttribute(name = "mitigation_status_desc")
	protected String mitigationStatusDesc;
	@XmlAttribute(name = "note", required = true)
	protected String note;
	@XmlAttribute(name = "pcirelated")
	protected Boolean pcirelated;
	@XmlElement(name = "remediation_desc")
	protected String remediationDesc;
	
	@XmlTransient
	protected List<Mitigation> _mitigations;
	
	@Override
	public int compareTo(Find o) {
		return this.getId().compareTo(o.getId());
	}

	@Override
	public IAnnotationListType getAnnotations() {
		return this.annotations;
	}

	@Override
	public String getDateFirstOccurrence() {
		return this.dateFirstOccurrence;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public IExploitAdjustmentListType getExploitabilityAdjustments() {
		return this.exploitabilityAdjustments;
	}

	@Override
	public Integer getId() {
		return this.issueid;
	}

	@Override
	public List<Mitigation> getMitigations() {
		if (this.mitigations == null) {
			this.mitigations = new MitigationListType();
		}

		return this.mitigations.getMitigations();
	}
	
	@Override
	public String getMitigationStatus() {
		return this.mitigationStatus;
	}

	@Override
	public String getMitigationStatusDesc() {
		return this.getMitigationStatusDesc();
	}

	@Override
	public MitigationList getMitigationTypes() {
		return this.mitigations;
	}

	@Override
	public String getNote() {
		return this.note;
	}

	@Override
	public String getRemediationDesc() {
		return this.remediationDesc;
	}

	@Override
	public Boolean isPCIrelated() {
		return this.pcirelated;
	}
}
