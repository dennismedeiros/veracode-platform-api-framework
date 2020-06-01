package com.dennismedeiros.veracode.platform.api.pojo;

import java.util.List;

public interface ApplicationInformation {

	List<ApplicationPortfolio> getApplicationPortfolios();

	String getAppinfoVersion();

	void setAppinfoVersion(String value);
	Long getAccountId();

	void setAccountId(Long value);

}