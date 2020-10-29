package com.dennismedeiros.veracode.platform.api.pojo.analyses.dast;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.dennismedeiros.veracode.platform.api.pojo.analyses.Analysis;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.scaninfo.DynamicScanType;

@XmlAccessorType(XmlAccessType.NONE)
public interface DynamicAnalysis extends Analysis {

	DynamicScanType getDynamicScanType();
	void setDynamicScanType(DynamicScanType value);
}
