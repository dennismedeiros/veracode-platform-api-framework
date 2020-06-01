package com.dennismedeiros.veracode.platform.api.providers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dennismedeiros.veracode.platform.api.credentials.Credential;
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
import com.dennismedeiros.veracode.platform.api.providers.PlatformPortfolioContentProvider;
import com.dennismedeiros.veracode.platform.api.providers.modules.PlatformAPIContentModule;
import com.dennismedeiros.veracode.platform.api.providers.modules.PlatformAPIVospContentModule;

public class PlatformAPIVospPortfolioContentProvider implements PlatformPortfolioContentProvider{

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(PlatformAPIVospPortfolioContentProvider.class);
	
	public static PlatformAPIVospPortfolioContentProvider createInstance(Credential credential) throws Throwable {
		return new PlatformAPIVospPortfolioContentProvider(new PlatformAPIVospContentModule(credential));
	}
	
	public static PlatformAPIVospPortfolioContentProvider createInstance(PlatformAPIContentModule module) {
		return new PlatformAPIVospPortfolioContentProvider(module);
	}
	
	PlatformAPIContentModule module = null;
	
	protected PlatformAPIVospPortfolioContentProvider(PlatformAPIContentModule module) {
		this.module = module;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScanInformation getApplicationPortfolioPolicyCurrentSastInfo(ApplicationPortfolio app) {
		return module.getApplicationPortfolioCurrentPolicySastInfo(app);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScanInformation getApplicationPortfolioCurrentSandboxScanInfo(ApplicationPortfolio app, Sandbox sandbox) {
		return module.getApplicationPortfolioCurrentSandboxScanInfo(app, sandbox);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public ApplicationInformation getApplicationPortfolioInformation(ApplicationPortfolio app) {
		return module.getApplicationPortfolioInformation(app);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Scans getApplicationPortfolioPolicyAnalyses(ApplicationPortfolio appPortfolio) {
		return module.getApplicationPortfolioPolicyScans(appPortfolio);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScanInformation getApplicationPortfolioPolicyAnalysisInfo(ApplicationPortfolio app, Scan scan) {
		return module.getApplicationPortfolioPolicyScanInfo(app, scan);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrescanResults getApplicationPortfolioSastPreScan(ApplicationPortfolio app, Scan scan) {
		return module.getApplicationPortfolioPrescan(app, scan);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public ApplicationPortfolios getApplicationPortfolios(Long accountid) {
		return module.getApplicationPortfolios(accountid);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Sandboxes getApplicationPortfolioSandboxes(ApplicationPortfolio app) {
		return module.getApplicationPortfolioSandboxes(app);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScanInformation getApplicationPortfolioSandboxScanInfo(ApplicationPortfolio app, Sandbox sandbox, Scan scan) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Scans getApplicationPortfolioSandboxScans(ApplicationPortfolio appPortfolio, Sandbox sandbox) {
		return module.getApplicationPortfolioSandboxScans(appPortfolio, sandbox);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public DetailedReport getDetailedReport(Scan scan) {
		return module.getDetailedReport(scan);
	}
}
