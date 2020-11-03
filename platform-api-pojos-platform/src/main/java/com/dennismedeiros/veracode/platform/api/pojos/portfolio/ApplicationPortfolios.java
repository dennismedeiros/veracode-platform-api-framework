package com.dennismedeiros.veracode.platform.api.pojos.portfolio;

import java.util.List;

import com.dennismedeiros.veracode.platform.api.pojos.ApplicationPortfolio;

/**
 * Interface for accessing the list of application portfolios available to the user within the account.
 * @author Dennis Medeiros
 *
 */
public interface ApplicationPortfolios {

	List<ApplicationPortfolio> getApplicationPortfolios();

	User getUser();
	String getListContainerVersion();
	Long getAccountId();

}