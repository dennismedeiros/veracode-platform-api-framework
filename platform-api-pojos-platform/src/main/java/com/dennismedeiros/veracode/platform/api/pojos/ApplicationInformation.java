package com.dennismedeiros.veracode.platform.api.pojos;

import java.util.List;

public interface ApplicationInformation {

	List<ApplicationPortfolio> getApplicationPortfolios();

	String getAppinfoVersion();

	void setAppinfoVersion(String value);
	Long getAccountId();

	void setAccountId(Long value);

}