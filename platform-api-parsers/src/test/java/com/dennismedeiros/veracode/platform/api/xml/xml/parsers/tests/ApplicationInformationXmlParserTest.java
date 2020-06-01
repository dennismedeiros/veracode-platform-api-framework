/**
 * 
 */
package com.dennismedeiros.veracode.platform.api.xml.xml.parsers.tests;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.InputStreamReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dennismedeiros.veracode.platform.api.pojo.ApplicationPortfolio;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.ApplicationPortfolioInformationEntity;
import com.dennismedeiros.veracode.platform.api.xml.parsers.ApplicationInfoXmlParser;

/**
 * @author dmedeiros
 *
 */
public class ApplicationInformationXmlParserTest {

    String filename = "/xml/appinfo.xml";
    InputStream stream = null;

    @Before
	public void setUp() throws Exception {
        stream = this.getClass().getResourceAsStream(filename);
	}
  
	@After
	public void tearDown() throws Exception {
		if (stream != null)
	        {
	            stream.close();
	        }
	
	        stream = null;
	}

	@Test
	public void testParseContent() {
		ApplicationInfoXmlParser parser = new ApplicationInfoXmlParser();
		try{
			ApplicationPortfolioInformationEntity info = parser.parseContent(new InputStreamReader(stream));
			assertNotNull(info);
				
			assertEquals(info.getAccountId(), Long.valueOf(32818));
			assertEquals(info.getAppinfoVersion(), "1.1");
			
			assertTrue(info.getApplicationPortfolios().size() > 0);
			assertNotNull(info.getApplicationPortfolios().get(0));
			
			ApplicationPortfolio app = info.getApplicationPortfolios().get(0);
			assertEquals(app.getId(), Long.valueOf(112029));
			assertEquals(app.getName(), "WebGoat");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
