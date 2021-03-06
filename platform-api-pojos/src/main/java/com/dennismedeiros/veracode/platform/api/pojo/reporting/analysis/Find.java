package com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis;

import java.util.List;

import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.mast.Appendix;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.mast.IAnnotationListType;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.findings.Mitigation;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.findings.MitigationList;

public interface Find extends Comparable<Find> {

	int compareTo(Find o);
	IAnnotationListType getAnnotations(); //Internal Comments or Comments
	
	String getDateFirstOccurrence(); //First Occurrence Date of ID
	String getDescription(); //Description of problem
	IExploitAdjustmentListType getExploitabilityAdjustments(); //?
	Integer getId(); //Unique ID for issue
	List<Mitigation> getMitigations(); 
	String getMitigationStatus(); //Flaw Mitigation Status
	String getMitigationStatusDesc(); //Broken
	MitigationList getMitigationTypes(); //?
	String getNote(); //?
	String getRemediationDesc(); //Broken

	//String getType();
	Boolean isPCIrelated();

}