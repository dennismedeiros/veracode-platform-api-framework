package com.dennismedeiros.veracode.platform.api.pojo.analyses.sast;

import java.math.BigInteger;

import com.dennismedeiros.veracode.platform.api.pojo.analyses.Weakness;

public interface StaticAnalysisFlaw extends Weakness {
	
	String getAttackVector(); //Attack Vector for Static Find
	String getCiaImpact();
	Integer getModulePathCount(); //Data Path Count

	Integer getExploitdifficulty();
	Integer getExploitLevel();
	FlawSignature getFlawSignature();
	String getFunctionPrototype(); //Function Prototype
	BigInteger getFunctionRelativeLocation(); //Function Relative Location
	String getGracePeriodExpires();
	String getInputvector(); //Dynamic??
	BigInteger getLineNumber(); //Line Number
	String getLocation();
	String getModule();
	String getProcedureHash();
	String getProcedureName();
	String getPrototypeHash();
	int getRemediationEffort();
	String getScope();
	String getSeverityDesc();
	String getSourceFile();
	String getSourceFilePath();
	String getStatementHash();
	BigInteger getStatementHashCount();
	BigInteger getStatementHashOrdinal();
	boolean isAffectsPolicyCompliance();
	
}
