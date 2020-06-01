package com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis;

import java.math.BigInteger;

public interface Weakness extends Find {
	
	BigInteger getCategoryId();
	String getCategoryName();
	BigInteger getCweid();;
	int getSeverityId();
	String getSeverityDesc();	
}
