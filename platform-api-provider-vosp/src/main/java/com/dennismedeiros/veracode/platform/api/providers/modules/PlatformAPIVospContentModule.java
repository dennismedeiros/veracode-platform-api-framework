package com.dennismedeiros.veracode.platform.api.providers.modules;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dennismedeiros.veracode.platform.api.credentials.Credential;
import com.dennismedeiros.veracode.platform.api.credentials.TokenKeyCredential;
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
import com.dennismedeiros.veracode.platform.api.xml.parsers.ApplicationInfoXmlParser;
import com.dennismedeiros.veracode.platform.api.xml.parsers.ApplicationListXmlParser;
import com.dennismedeiros.veracode.platform.api.xml.parsers.DetailedReportXmlParser;
import com.dennismedeiros.veracode.platform.api.xml.parsers.PrescanResultXmlParser;
import com.dennismedeiros.veracode.platform.api.xml.parsers.SandboxListXmlParser;
import com.dennismedeiros.veracode.platform.api.xml.parsers.ScanInfoXmlParser;
import com.dennismedeiros.veracode.platform.api.xml.parsers.ScanListXmlParser;
import com.veracode.apiwrapper.wrappers.ResultsAPIWrapper;
import com.veracode.apiwrapper.wrappers.SandboxAPIWrapper;
import com.veracode.apiwrapper.wrappers.UploadAPIWrapper;

public class PlatformAPIVospContentModule implements PlatformAPIContentModule {

	private static final Logger logger = LoggerFactory.getLogger(PlatformAPIVospContentModule.class);
	
	ResultsAPIWrapper m_resultWrapper = null;
	SandboxAPIWrapper m_sandboxWrapper = null;
	UploadAPIWrapper m_uploadWrapper = null;
	
	public PlatformAPIVospContentModule(Credential credential) throws Throwable {
		this.m_resultWrapper = new ResultsAPIWrapper();
		this.m_uploadWrapper = new UploadAPIWrapper();
		this.m_sandboxWrapper = new SandboxAPIWrapper();
		
		this.setCredential(credential);
	}

	@Override
	public ScanInformation getApplicationPortfolioCurrentPolicySastInfo(ApplicationPortfolio app) {
		ScanInformation scaninfo = null;
		
		ScanInfoXmlParser parser = new ScanInfoXmlParser();
		try {
			String rtn = this.m_uploadWrapper.getBuildInfo(app.getId().toString());
			scaninfo = parser.parseContent(rtn); 
			
		} catch (IOException e) {
			logger.debug(e.getMessage());
		}
		
		return scaninfo;
	}

	@Override
	public ScanInformation getApplicationPortfolioCurrentSandboxScanInfo(ApplicationPortfolio app, Sandbox sandbox) {
		ScanInformation scaninfo = null;
		
		ScanInfoXmlParser parser = new ScanInfoXmlParser();
		try {
			String rtn = this.m_uploadWrapper.getBuildInfo(app.getId().toString(), null, sandbox.getId().toString());
			scaninfo = parser.parseContent(rtn); 
			
		} catch (IOException e) {
			logger.debug(e.getMessage());
		}
		
		return scaninfo;
	}
	@Override
	public ApplicationInformation getApplicationPortfolioInformation(ApplicationPortfolio appPortfolio) {
		ApplicationInformation app = null;
		
		ApplicationInfoXmlParser parser = new ApplicationInfoXmlParser();
		try {
			String rtn = this.m_uploadWrapper.getAppInfo(appPortfolio.getId().toString());
			app = parser.parseContent(rtn);
		} catch (IOException e) {
			logger.debug(e.getMessage());
		}
		
		return app;
	}
	
	@Override
	public ScanInformation getApplicationPortfolioPolicyScanInfo(ApplicationPortfolio app, Scan scan) {
		ScanInformation scaninfo = null;
		
		ScanInfoXmlParser parser = new ScanInfoXmlParser();
		try {
			String rtn = this.m_uploadWrapper.getBuildInfo(app.getId().toString(), scan.getId().toString());
			scaninfo = parser.parseContent(rtn); 
			
		} catch (IOException e) {
			logger.debug(e.getMessage());
		}
		
		return scaninfo;
	}
	
	@Override
	public Scans getApplicationPortfolioPolicyScans(ApplicationPortfolio appPortfolio) {
		Scans scans = null;
		
		ScanListXmlParser parser = new ScanListXmlParser();
		try {
			String rtn = this.m_uploadWrapper.getBuildList(appPortfolio.getId().toString());
			scans = parser.parseContent(rtn); 
			
		} catch (IOException e) {
			logger.debug(e.getMessage());
		}
		
		return scans;
	}
	
	@Override
	public PrescanResults getApplicationPortfolioPrescan(ApplicationPortfolio app, Scan scan) {
		PrescanResults result = null;
		
		PrescanResultXmlParser parser = new PrescanResultXmlParser();
		try {
			StringBuilder sb = new StringBuilder();
			sb.append(this.m_uploadWrapper.getPreScanResults(String.valueOf(app.getId()), String.valueOf(scan.getId())));
			result = parser.parseContent(sb.toString());
		} catch (IOException e) {
			logger.debug(e.getMessage());
		}
		
		return result;
	}
	@Override
	public ApplicationPortfolios getApplicationPortfolios(Long accountid) {
		ApplicationPortfolios apps = null;
		
		ApplicationListXmlParser parser = new ApplicationListXmlParser();
		try {
			StringBuilder sb = new StringBuilder();
			if(accountid == null) {
				sb.append(this.m_uploadWrapper.getAppList());
			} else {
				sb.append(this.m_uploadWrapper.getAppList());
			}
				
			apps = parser.parseContent(sb.toString());
		} catch (IOException e) {
			logger.debug(e.getMessage());
		}
		
		return apps;
	}
	@Override
	public Sandboxes getApplicationPortfolioSandboxes(ApplicationPortfolio app) {
		Sandboxes sandboxes = null;
		
		SandboxListXmlParser parser = new SandboxListXmlParser();
		try {
			StringBuilder sb = new StringBuilder();
			
			sb.append(this.m_sandboxWrapper.getSandboxList(app.getId().toString()));
			sandboxes = parser.parseContent(sb.toString());
		} catch (IOException e) {
			logger.debug(e.getMessage());
		}
		
		return sandboxes;
	}

	@Override
	public Scans getApplicationPortfolioSandboxScans(ApplicationPortfolio appPortfolio, Sandbox sandbox) {
		
		Scans scans = null;
		
		ScanListXmlParser parser = new ScanListXmlParser();
		try {
			String rtn = this.m_uploadWrapper.getBuildList(appPortfolio.getId().toString(), sandbox.getId().toString());
			scans = parser.parseContent(rtn); 
			
		} catch (IOException e) {
			logger.debug(e.getMessage());
		}
		
		return scans;
		
	}

	@Override
	public DetailedReport getDetailedReport(Scan scan) {
		DetailedReport report = null;
		
		DetailedReportXmlParser parser = new DetailedReportXmlParser();
		try {
			StringBuilder sb = new StringBuilder();
			sb.append(this.m_resultWrapper.detailedReport(scan.getId().toString()));
			report = parser.parseContent(sb.toString());
		} catch (IOException e) {
			logger.debug(e.getMessage());
		}
		
		return report;
	}

	protected void setCredential(Credential credential) throws Throwable {
	
		if(credential instanceof TokenKeyCredential ){
			if(logger.isDebugEnabled()) {
				logger.debug("TokenKey Credential object detected.");
			}
			
			String apiID = ((TokenKeyCredential)credential).getID();
			String apiKey = ((TokenKeyCredential)credential).getKey();
			
			this.m_resultWrapper.setUpApiCredentials(apiID, apiKey);
			this.m_uploadWrapper.setUpApiCredentials(apiID, apiKey);
			this.m_sandboxWrapper.setUpApiCredentials(apiID, apiKey);
		
		}else {
			throw new Exception("Credential type passed in is not recognized.");
		}
		
	}
}
