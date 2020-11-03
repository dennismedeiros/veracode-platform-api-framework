package com.dennismedeiros.veracode.platform.api.providers;

import com.dennismedeiros.veracode.platform.api.pojos.ApplicationInformation;
import com.dennismedeiros.veracode.platform.api.pojos.ApplicationPortfolio;
import com.dennismedeiros.veracode.platform.api.pojos.Sandbox;
import com.dennismedeiros.veracode.platform.api.pojos.Sandboxes;
import com.dennismedeiros.veracode.platform.api.pojos.Scan;
import com.dennismedeiros.veracode.platform.api.pojos.ScanInformation;
import com.dennismedeiros.veracode.platform.api.pojos.Scans;
import com.dennismedeiros.veracode.platform.api.pojos.portfolio.ApplicationPortfolios;
import com.dennismedeiros.veracode.platform.api.pojos.portfolio.analyses.prescan.PrescanResults;
import com.dennismedeiros.veracode.platform.api.pojos.reporting.DetailedReport;

public interface PlatformPortfolioContentProvider {
	
	/**
	 * Get the most current policy level SAST analysis report information
	 * @param app {@link ApplicationPortifolio}
	 * @return Returns the scan information related to the application portfoio
	 */
	ScanInformation getApplicationPortfolioPolicyCurrentSastInfo(ApplicationPortfolio app);
	/**
	 * Get the most current sandbox SAST analysis report information
	 * @param app
	 * @param sandbox
	 * @return
	 */
	ScanInformation getApplicationPortfolioCurrentSandboxScanInfo(ApplicationPortfolio app, Sandbox sandbox);
	/**
	 * Returns the Application Portfolio Information
	 * @param app
	 * @return
	 */
	ApplicationInformation getApplicationPortfolioInformation(ApplicationPortfolio app);
	/**
	 * Returns the Application Portfolio's more current Analyses performed
	 * @param appPortfolio
	 * @return Returns a list of scans that are the most current Analyses from SAST, SCA, DAST, MAST
	 */
	Scans getApplicationPortfolioPolicyAnalyses(ApplicationPortfolio appPortfolio);
	/**
	 * Gets the specified policy analysis report for the application portfolio
	 * @param app
	 * @param scan
	 * @return Returns a list of Analyses objects
	 */
	ScanInformation getApplicationPortfolioPolicyAnalysisInfo(ApplicationPortfolio app, Scan scan);
	/**
	 * Returns the Presecan Results
	 * @param app
	 * @param scan
	 * @return
	 */
	PrescanResults getApplicationPortfolioSastPreScan(ApplicationPortfolio app, Scan scan);
	/**
	 * Gets the list of application Portfolios for a specified account
	 * @param accountid
	 * @return
	 */
	ApplicationPortfolios getApplicationPortfolios(Long accountid);
	/**
	 * Gets Sandbox List for Application Portfolio
	 * @param app
	 * @return
	 */
	Sandboxes getApplicationPortfolioSandboxes(ApplicationPortfolio app);
	/**
	 * Gets the scan info
	 * @param app
	 * @param sandbox
	 * @param scan
	 * @return
	 */
	ScanInformation getApplicationPortfolioSandboxScanInfo(ApplicationPortfolio app, Sandbox sandbox, Scan scan);
	/**
	 * Gest the Sanbox scans list
	 * @param app
	 * @param sandbox
	 * @return
	 */
	Scans getApplicationPortfolioSandboxScans(ApplicationPortfolio app, Sandbox sandbox);
	/**
	 * Gets the Detailed report for the scan object passed
	 * @param scan
	 * @return Returns a Detailed Report if one exists for passed in scan. Else will return null if analysis report does not exist.
	 */
	DetailedReport getDetailedReport(Scan scan);
}
