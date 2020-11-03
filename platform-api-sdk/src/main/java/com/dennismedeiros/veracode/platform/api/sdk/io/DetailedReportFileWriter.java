package com.dennismedeiros.veracode.platform.api.sdk.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dennismedeiros.veracode.platform.api.pojos.reporting.DetailedReport;
import com.dennismedeiros.veracode.platform.api.xml.parsers.DetailedReportXmlParser;


public class DetailedReportFileWriter implements ContentStorageWriter{
	
	private static final Logger logger = LoggerFactory.getLogger(DetailedReportFileWriter.class); 
	
	private DetailedReport _report;
	private String _outputdir;
	private Path _path;

	//Constructors
	public DetailedReportFileWriter(File file) {
		
	}
	
	public DetailedReportFileWriter(Path outputdir, DetailedReport report){
		this._outputdir = outputdir.toString();
		this._report = report;
	}
	
	public DetailedReportFileWriter(String outputdir, DetailedReport report){
		this._report = report;
		this._outputdir = outputdir;
	}
	
	public void setDetailedReport(DetailedReport report) {
		this._report = report;
	}
	
	public DetailedReport getDetailedReport() {
		return this._report;
	}
		
	public void getFileName() {
		
	}
	
	@Override
	public void serialize(){
		
		try{
			String fileName = this.getDetailedReportFileName(_report);
			String encodedName = fileName.replaceAll("[^a-zA-Z0-9.-]", "_");
			
			Path savePath = Paths.get(_outputdir.toString(), encodedName + "_detailedreport.xml");
			File file = savePath.toFile();
			if(!file.exists()){
				this.saveToFile(file);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private String getDetailedReportFileName(DetailedReport report){
		
		StringBuilder rtnName = new StringBuilder();
		rtnName.append(report.getApplicationPortfolioName()).append("_");
		rtnName.append(report.getScanId()).append("_");
		
		StringBuilder publishedDate = new StringBuilder(); 
		if(this._report.getStaticAnalysisSecurityTestingReport() != null) {
			if(this._report.getStaticAnalysisSecurityTestingReport().getName().equals(report.getScanName())) {
				publishedDate.append(this._report.getStaticAnalysisSecurityTestingReport().getPublishedDate());
			}
		}else if(this._report.getDynamicAnalysisSecurityTestingReport() != null){
			if(this._report.getDynamicAnalysisSecurityTestingReport().getName().equals(report.getScanName())) {
				publishedDate.append(this._report.getDynamicAnalysisSecurityTestingReport().getPublishedDate());
			}
		} //else if(this._report.ManualPenetrationTestingAnalysis() != null){
//			if(this._report.ManualPenetrationTestingAnalysis().getVersion().equals(report.getScanName())) {
//				publishedDate.append(this._report.ManualPenetrationTestingAnalysis().getPublishedDate());
//			}
//		}
		
		rtnName.append(publishedDate.toString().replaceAll("[^a-zA-Z0-9]", "")).append("_");
		rtnName.append(report.getScanName());
		
		return rtnName.toString();
	}
	
	private void saveToFile(File file) throws IOException {
		OutputStream outputstream = new FileOutputStream(file);
		try{
			DetailedReportXmlParser parser = new DetailedReportXmlParser();
			//parser.serializeContent((DetailedReport)_report, outputstream);
			logger.info(String.format("Saving analysis: (%d)'%s' - '%s'(%d)", _report.getApplicationPortfolioId(), _report.getApplicationPortfolioName(),
					_report.getScanName(), _report.getScanId()));
			logger.debug(String.format("Saved to File: '%s'", file.getName()));
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(outputstream != null) {
				outputstream.close();
			}
		}
	}
}




//private void getCreateFileName(){
	//String fileName = this.getDetailedReportFileName();
	//String encodedName = fileName.replaceAll("[^a-zA-Z0-9.-]", "_");
	
	//Path savePath = Paths.get(path.toString(), encodedName + "_detailedreport.xml");
	//File file = savePath.toFile();	
//}


//private void extractDetailedReports(String appId){
//	
//	//String buildList = this.m_uploadWrapper.getBuildList(appId);
//	//System.out.println(buildList);
//	
//	try{	
//		//===============Temp Code================
//		StringBuilder sb = new StringBuilder();
//		File file = Paths.get(this.m_outputDir, "BuildList.xml").toFile();
//		try {
//            byte[] bytes = Files.readAllBytes(file.toPath());
//            sb.append(new String(bytes,"UTF-8"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//		//===============Temp Code================
//        System.out.println(sb.toString());
//		 
//		List buildListItems = this.getBuildIds(sb.toString());
//
//		Iterator it = buildListItems.iterator();
//		while(it.hasNext()){
//			
//			String buildId = it.next().toString();
//			String buildDetailReport = this.m_resultWrapper.detailedReport(buildId);
//			this.saveDetailedReport(buildDetailReport);
//		}
//		
//	}catch(Exception e){
//		
//	}
//}	