package com.dennismedeiros.veracode.platform.api.pojos.analyses.dast;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.dennismedeiros.veracode.platform.api.pojos.analyses.Analysis;

@XmlAccessorType(XmlAccessType.NONE)
public interface DynamicAnalysis extends Analysis {

	DynamicScanType getDynamicScanType();
	void setDynamicScanType(DynamicScanType value);
}
