package com.dennismedeiros.veracode.platform.api.xml.xml.parsers.tests;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dennismedeiros.veracode.platform.api.pojos.portfolio.analyses.prescan.ModuleFile;
import com.dennismedeiros.veracode.platform.api.pojos.portfolio.analyses.prescan.PrescanResults;
import com.dennismedeiros.veracode.platform.api.pojos.reporting.DetailedReport;
import com.dennismedeiros.veracode.platform.api.xml.parsers.PrescanResultXmlParser;

public class PrescanResultXmlParserTest {

	   String filename = "/xml/prescanresults.xml";
	InputStream stream = null;
	DetailedReport report = null;
	
	/**
	 * @throws java.lang.Exception
	 */
		@Before
		public void setUp() throws Exception {
	        stream = this.getClass().getResourceAsStream(filename);
		}
	  
		/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		if (stream != null)
	        {
	            stream.close();
	        }
	
	        stream = null;
	}
	
	/**
	 * Test method for {@link com.dennismedeiros.veracode.platform.api.xml.parsers.DetailedReportXmlParser#Test()}.
	 */
	//@Test
	public void testParseContent() {
		PrescanResultXmlParser parser = new PrescanResultXmlParser();
		try{
			PrescanResults prescan = parser.parseContent(new InputStreamReader(stream));
				
			assertNotNull(prescan);
			assertEquals(prescan.getApplicationPortfolioId(), Long.valueOf("151633"));
			
			List<ModuleFile> modules = prescan.getParentModules();
			assertTrue(modules.size() > 0);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}