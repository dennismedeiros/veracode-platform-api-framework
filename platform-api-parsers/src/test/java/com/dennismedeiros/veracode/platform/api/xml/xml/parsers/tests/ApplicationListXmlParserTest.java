/**
 * 
 */
package com.dennismedeiros.veracode.platform.api.xml.xml.parsers.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

//import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.InputStreamReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dennismedeiros.veracode.platform.api.pojos.portfolio.ApplicationPortfolioList;
import com.dennismedeiros.veracode.platform.api.xml.parsers.ApplicationListXmlParser;

/**
 * @author dmedeiros
 *
 */
public class ApplicationListXmlParserTest {

    String filename = "/xml/applicationlist.xml";
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
		ApplicationListXmlParser parser = new ApplicationListXmlParser();
		try{	
			ApplicationPortfolioList applist = parser.parseContent(new InputStreamReader(stream));
			
			assertNotNull(applist);
			assertEquals(applist.getAccountId(), Long.valueOf(32818));
			//assertEquals(applist.getApp();)
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
