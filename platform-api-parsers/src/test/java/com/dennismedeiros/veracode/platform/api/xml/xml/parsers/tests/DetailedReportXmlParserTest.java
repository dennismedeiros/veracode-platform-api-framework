/**
 * 
 */
package com.dennismedeiros.veracode.platform.api.xml.xml.parsers.tests;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dennismedeiros.veracode.platform.api.pojo.analyses.sast.Module;
import com.dennismedeiros.veracode.platform.api.pojo.analyses.sast.StaticAnalysis;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.DetailedReport;
import com.dennismedeiros.veracode.platform.api.xml.parsers.DetailedReportXmlParser;

/**
 * @author dmedeiros
 *
 */
public class DetailedReportXmlParserTest {
	
    String filename = "/xml/detailedreport.xml";
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
	@Test
	public void testParseContent() {
		DetailedReportXmlParser detailedreportparser = new DetailedReportXmlParser();
		try{
			DetailedReport detailedreport = detailedreportparser.parseContent(new InputStreamReader(stream));
				
			assertNotNull(detailedreport);
			assertEquals(detailedreport.getApplicationPortfolioId(), Long.valueOf(205537));
			
			StaticAnalysis scan = (StaticAnalysis) detailedreport.getStaticAnalysisSecurityTestingReport();
			List<Module> modules = scan.getModules();
			
			assertTrue(modules.size() > 0);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
