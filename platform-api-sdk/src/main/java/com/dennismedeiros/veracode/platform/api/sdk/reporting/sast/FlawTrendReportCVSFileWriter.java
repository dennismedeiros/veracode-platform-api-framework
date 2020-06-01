package com.dennismedeiros.veracode.platform.api.sdk.reporting.sast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlawTrendReportCVSFileWriter extends FileWriter{
	final static Logger logger = LoggerFactory.getLogger(FlawTrendReportCVSFileWriter.class);
	
	private Path outputDirectory;// = "C:\\Users\\dmedeiros\\Desktop\\Infor-Gov\\TrendReport Output";
	
	public FlawTrendReportCVSFileWriter(File file) throws IOException {
		super(file);
	}
	
	public void write(Writer write) {
		
	}
	
	public void setOutputDirectory(Path outputDirectory) {
		
		if(outputDirectory.toFile().isDirectory()) {
			this.outputDirectory = outputDirectory;	
		}
		
	}
	public String getOutputDirectory() {
		return this.outputDirectory.toString();
	}
	
	
	private String generateFileName(Long appid) {
		return String.format("AppId_%d_Flaw_Trend_Report.csv", appid);
	}
}
