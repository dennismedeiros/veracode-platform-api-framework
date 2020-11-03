package com.dennismedeiros.veracode.platform.api.sdk.export;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dennismedeiros.veracode.platform.api.pojos.ApplicationPortfolio;
import com.dennismedeiros.veracode.platform.api.pojos.Sandbox;
import com.dennismedeiros.veracode.platform.api.pojos.Sandboxes;
import com.dennismedeiros.veracode.platform.api.pojos.Scan;
import com.dennismedeiros.veracode.platform.api.pojos.ScanInformation;
import com.dennismedeiros.veracode.platform.api.pojos.Scans;
import com.dennismedeiros.veracode.platform.api.pojos.portfolio.ApplicationPortfolios;
import com.dennismedeiros.veracode.platform.api.pojos.reporting.DetailedReport;
import com.dennismedeiros.veracode.platform.api.providers.PlatformPortfolioContentProvider;
import com.dennismedeiros.veracode.platform.api.sdk.io.PlatformContentStorage;

public class PlatformContentExtractor {
	
	final static Logger logger = LoggerFactory.getLogger(PlatformContentExtractor.class);
	
	//	private void getCreateFileName(){
//		//String fileName = this.getDetailedReportFileName();
//		//String encodedName = fileName.replaceAll("[^a-zA-Z0-9.-]", "_");
//		
//		//Path savePath = Paths.get(path.toString(), encodedName + "_detailedreport.xml");
//		//File file = savePath.toFile();	
//	}
//	private void saveContentToFile(File file, String content){
//		try{
//			if(!file.exists()){
//				this.saveToFile(file, content);
//			}
//		}catch(InvalidPathException e){
//			System.out.println(e.getMessage());
//		}
//	}
//	private void saveToFile(File file, String output) {
//		try{
//			FileWriter fw = new FileWriter(file);
//			BufferedWriter bw = new BufferedWriter(fw);
//			try{
//				bw.write(output);
//				
//			}catch(Exception e){
//				e.printStackTrace();
//			}finally{
//				if(bw != null){
//					bw.close();
//				}
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}
	private static void verifyLocationExists(Path path) throws Exception {
		
		File dir = path.toFile();
		if (!dir.exists()) {
			dir.mkdir();
		} else {
			if(!dir.isDirectory()) {
				throw new IllegalStateException("Output location must be path to a valid directory.");
			}
		}
	}
	private Long accountid = Long.valueOf(0);
	private Long applicationid = Long.valueOf(0);	
	//TODO: functionality to add to allow for preview of result
	private boolean coldrun = true;  
	private PlatformPortfolioContentProvider content = null;
	private boolean includeSandboxes = true;
	//TODO: Remove outDirectory
	private Path outputDirectory = Paths.get("C:\\Users\\dmedeiros\\Desktop\\Infor-Gov\\Output");	
	private PlatformContentStorage storage = null;
	
	public PlatformContentExtractor(PlatformPortfolioContentProvider platformcontent) {
		this.content = platformcontent;
	}
	public PlatformContentExtractor(PlatformPortfolioContentProvider platformcontent, 
			PlatformContentStorage storage) {
		
		this.content = platformcontent;
		this.storage = storage;
	}
	public void extractAllPortfoliosData(Long accountid) {
	
		logger.info(String.format("Extract account data from account: (%d).", accountid));
		try {
			if(this.verifyStorage() == false)
				logger.info("Unable to access storage provider.");
			
			ApplicationPortfolios applications = content.getApplicationPortfolios(accountid);
			if(applications != null) {
				this.processApplications(applications.getApplicationPortfolios(), this.outputDirectory);	
			}
			
		}catch(Throwable e){
			e.printStackTrace();
		}
		
		logger.info("Content Extractor Completed.");
	}
	
	public void extractPortfolioData(Long accountid, Long[] portfolioids, boolean includeSandboxes) {
		
		logger.info(String.format("Extract account data from account: (%d).", accountid));
		try {
			ApplicationPortfolios applicationlist = content.getApplicationPortfolios(accountid);
			 
			List<ApplicationPortfolio> apps = applicationlist.getApplicationPortfolios();
			List<Long> matchids = Arrays.asList(portfolioids);
			
			List<ApplicationPortfolio> applications = new ArrayList<ApplicationPortfolio>();
			
			apps.forEach(app -> {
				if(matchids.contains(app.getId())) {
					applications.add(app);
				}
			});
			
			this.processApplications(applications, this.outputDirectory);
			
		}catch(Throwable e){
			e.printStackTrace();
		}
		
		logger.info("Content Extractor Completed.");
	}	
	public void extractPortfolioSandboxData(Long accountid, Long portfolioid, Long[] sandboxids) {

		
		logger.info(String.format("Extract account data from account: (%d).", accountid));
		try {
			ApplicationPortfolios applicationlist = content.getApplicationPortfolios(accountid);
			 
			List<ApplicationPortfolio> apps = applicationlist.getApplicationPortfolios();
			apps.forEach(app -> {
				if(portfolioid.equals(app.getId())) {
					this.processSandboxes(app, Arrays.asList(sandboxids), this.outputDirectory);		
				}
			});
			
		}catch(Throwable e){
			e.printStackTrace();
		}
		
		logger.info("Content Extractor Completed.");
	}
	public Long getApplicationid() {
		return applicationid;
	}
	public boolean isIncludeSandboxes() {
		return includeSandboxes;
	}
	public void setApplicationid(Long applicationid) {
		this.applicationid = applicationid;
	}
	public void setIncludeSandboxes(boolean includeSandboxes) {
		this.includeSandboxes = includeSandboxes;
	}
	public boolean verifyStorage() {
		return this.storage.verifyStorageAccessable();
	}
	
	private void extractAnalysesData(ApplicationPortfolio app,  List<Scan> scans, Path outputDirectory ) {
		try {
			PlatformContentExtractor.verifyLocationExists(outputDirectory);
			Iterator<Scan> scanit= scans.iterator();
			while(scanit.hasNext()){
				Scan scan = scanit.next();
				ScanInformation info = content.getApplicationPortfolioPolicyAnalysisInfo(app, scan);
				
				
				if(info.getScan().isResultsReady() == true) {
					this.extractDetailedReport(app, scan, outputDirectory);
				} else {
					logger.info(String.format("Analysis results not ready for '%s' (%d)",info.getScan().getName(), info.getScanId()));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void extractDetailedReport(ApplicationPortfolio app,  Scan scan, Path outputDirectory) {
		try {
//			PlatformContentExtractor.verifyLocationExists(outputDirectory);
			DetailedReport report = content.getDetailedReport(scan);
			
			this.storage.saveDetailedReportContent(report);
			logger.debug(String.format("Analysis Report '%s' (%d) Saved.",scan.getName(), scan.getId()));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void processApplications(List<ApplicationPortfolio> apps, Path outputDirectory) {
		
		Iterator<ApplicationPortfolio> appsItr = apps.iterator();
		while(appsItr.hasNext()){
			
			ApplicationPortfolio app = appsItr.next();
			logger.info(String.format("Extract Application: (%d)%s",app.getId(), app.getName()));
			
			Path path = Paths.get(outputDirectory.toString(), app.getName());
			this.processPolicy(app, path);
			
			if(this.includeSandboxes == true) {
				this.processSandboxes(app, path);	
			}
		}
	}
	private void processPolicy(ApplicationPortfolio app, Path outputDirectory) {
		logger.debug(String.format("Processing (%d)%s policy analyses.",app.getId(), app.getName()));
		Scans scanlist = content.getApplicationPortfolioPolicyAnalyses(app); 
		
		List<Scan> scans = scanlist.getScans();
		this.extractAnalysesData(app, scans, outputDirectory);
	
		logger.debug(String.format("Total number of policy scans found: %d", scans.size()));
	}
	private void processSandboxes(ApplicationPortfolio app, List<Long> sandboxids, Path outputDirectory) {
		logger.debug(String.format("Processing (%d)%s sandboxes.",app.getId(), app.getName()));
		Sandboxes sandboxlist = content.getApplicationPortfolioSandboxes(app);
		
		List<Sandbox> sandboxes = sandboxlist.getSandboxes();
		List<Sandbox> filtered = sandboxes.stream()
				.filter(s -> {
					return sandboxids.contains(s.getSandboxId());
		}).collect(Collectors.toList());
		
		logger.debug(String.format("Total number of sandboxes: %d", filtered.size()));
		
		filtered.forEach(sandbox -> {
			logger.info(String.format("-- Extract Sandbox: (%d)%s", sandbox.getSandboxId(), sandbox.getSandboxName()));	
			Scans scanlist = content.getApplicationPortfolioSandboxScans(app, sandbox);
			List<Scan> scans = scanlist.getScans();
			this.extractAnalysesData(app, scans, outputDirectory);
		});
	}
	private void processSandboxes(ApplicationPortfolio app, Path outputDirectory) {
		logger.debug(String.format("Processing (%d)%s sandboxes.",app.getId(), app.getName()));
		Sandboxes sandboxlist = content.getApplicationPortfolioSandboxes(app);
		
		List<Sandbox> sandboxes = sandboxlist.getSandboxes();
		logger.debug(String.format("Total number of sandboxes: %d", sandboxes.size()));
		
		sandboxes.forEach(sandbox -> {
			logger.info(String.format("-- Extract Sandbox: (%d)%s", sandbox.getSandboxId(), sandbox.getSandboxName()));	
			Scans scanlist = content.getApplicationPortfolioSandboxScans(app, sandbox);
			List<Scan> scans = scanlist.getScans();
			this.extractAnalysesData(app, scans, outputDirectory);
		});
	}
}
