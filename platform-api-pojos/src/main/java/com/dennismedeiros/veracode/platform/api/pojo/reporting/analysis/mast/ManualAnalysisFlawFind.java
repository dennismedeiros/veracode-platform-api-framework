package com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.mast;

import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.Vulnerability;

public interface ManualAnalysisFlawFind extends Vulnerability {
	
	Appendix getAppendix(); //Appendix for Manual Pen Test
	String getExploitDesc();
}
