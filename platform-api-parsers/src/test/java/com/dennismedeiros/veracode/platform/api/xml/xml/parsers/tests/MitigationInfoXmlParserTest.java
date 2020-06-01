/**
 * 
 */
package com.dennismedeiros.veracode.platform.api.xml.xml.parsers.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.mitigations.Issue;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.mitigations.Mitigation;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.mitigations.MitigationInfo;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.DetailedReport;
import com.dennismedeiros.veracode.platform.api.xml.parsers.MitigationInfoXmlParser;

/**
 * @author dmedeiros
 *
 */
public class MitigationInfoXmlParserTest {
	
    String filename = "/xml/mitigationinfo.xml";
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
		MitigationInfoXmlParser parser = new MitigationInfoXmlParser();
		try{
			MitigationInfo mitigationinfo = parser.parseContent(new InputStreamReader(stream));
				
			assertNotNull(mitigationinfo);
			assertEquals(mitigationinfo.getBuildId(), Long.valueOf(2726817));
			
			List<Issue> issues = mitigationinfo.getIssues();
			assertTrue(issues.size() > 0);
			
			for(Issue issue : issues) {
				List<Mitigation> mitigations = issue.getMitigationActions();
				assertTrue(mitigations.size() > 0);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
