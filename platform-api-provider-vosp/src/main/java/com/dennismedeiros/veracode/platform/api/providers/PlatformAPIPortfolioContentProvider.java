package com.dennismedeiros.veracode.platform.api.providers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dennismedeiros.veracode.platform.api.credentials.Credentials;
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
import com.dennismedeiros.veracode.platform.api.providers.modules.PlatformAPIPortfolioContentModule;
import com.dennismedeiros.veracode.platform.api.providers.modules.PlatformAPIXmlPortfolioContentModule;

public class PlatformAPIPortfolioContentProvider implements PlatformPortfolioContentProvider{

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(PlatformAPIPortfolioContentProvider.class);
	
	public static PlatformAPIPortfolioContentProvider createInstance(Credentials credentials) throws Throwable {
		return new PlatformAPIPortfolioContentProvider(new PlatformAPIXmlPortfolioContentModule(credentials));
	}
	
	public static PlatformAPIPortfolioContentProvider createInstance(PlatformAPIPortfolioContentModule module) {
		return new PlatformAPIPortfolioContentProvider(module);
	}
	
	PlatformAPIPortfolioContentModule module = null;
	
	protected PlatformAPIPortfolioContentProvider(PlatformAPIPortfolioContentModule module) {
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
