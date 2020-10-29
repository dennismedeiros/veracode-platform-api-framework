package com.dennismedeiros.veracode.platform.api.pojo.analyses.mast;

import com.dennismedeiros.veracode.platform.api.pojo.analyses.Vulnerability;

public interface ManualAnalysisFlawFind extends Vulnerability {
	
	Appendix getAppendix(); //Appendix for Manual Pen Test
	String getExploitDesc();
}
