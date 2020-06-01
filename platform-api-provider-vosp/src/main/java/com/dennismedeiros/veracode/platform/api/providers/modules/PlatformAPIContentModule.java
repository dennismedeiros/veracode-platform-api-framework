package com.dennismedeiros.veracode.platform.api.providers.modules;

import com.dennismedeiros.veracode.platform.api.pojo.ApplicationInformation;
import com.dennismedeiros.veracode.platform.api.pojo.ApplicationPortfolio;
import com.dennismedeiros.veracode.platform.api.pojo.Sandbox;
import com.dennismedeiros.veracode.platform.api.pojo.Sandboxes;
import com.dennismedeiros.veracode.platform.api.pojo.Scan;
import com.dennismedeiros.veracode.platform.api.pojo.ScanInformation;
import com.dennismedeiros.veracode.platform.api.pojo.Scans;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.ApplicationPortfolios;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.prescan.PrescanResults;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.DetailedReport;

public interface PlatformAPIContentModule {
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
