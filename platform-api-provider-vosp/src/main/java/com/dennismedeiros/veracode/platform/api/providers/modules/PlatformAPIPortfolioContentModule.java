package com.dennismedeiros.veracode.platform.api.providers.modules;

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

public interface PlatformAPIPortfolioContentModule {
	ScanInformation getApplicationPortfolioCurrentPolicySastInfo(ApplicationPortfolio app);
	ScanInformation getApplicationPortfolioCurrentSandboxScanInfo(ApplicationPortfolio app, Sandbox sandbox);
	ApplicationInformation getApplicationPortfolioInformation(ApplicationPortfolio appPortfolio);
	ScanInformation getApplicationPortfolioPolicyScanInfo(ApplicationPortfolio app, Scan scan);
	Scans getApplicationPortfolioPolicyScans(ApplicationPortfolio appPortfolio);
	ApplicationPortfolios getApplicationPortfolios(Long accountid);
	Sandboxes getApplicationPortfolioSandboxes(ApplicationPortfolio app);
	Scans getApplicationPortfolioSandboxScans(ApplicationPortfolio appPortfolio, Sandbox sandbox);
	PrescanResults getApplicationPortfolioPrescan(ApplicationPortfolio app, Scan scan);
	DetailedReport getDetailedReport(Scan scan);
}
