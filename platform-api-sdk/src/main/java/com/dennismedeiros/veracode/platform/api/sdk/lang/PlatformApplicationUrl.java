package com.dennismedeiros.veracode.platform.api.sdk.lang;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 * Notes: AccountID:PortfolioID:AnalysisID(Build):OriginAnalysisID:::SandboxID
 * 
 * 
 * @author Dennis Medeiros
 */

public class PlatformApplicationUrl implements PlatformUrlResource {
	URL url;
	
	private final String validURL = "^https:\\/\\/analysiscenter.veracode.com[a-zA-Z0-9\\\\/]+\\.jsp?((\\?([a-zA-Z0-9=&]+))+)?#[a-zA-Z0-9]+(:([0-9]+)?)+";
	private final String invalidMsg = "URL must contain https://analysiscenter.veracode.com and account, protofilo, and scan ids";
	
	private long accountid;
	private long applicationid;
	private long analysisversionid;
	private long analysisid;
	private long analysisunitid; 
		
	public PlatformApplicationUrl(URL url) throws MalformedURLException {
		
		boolean matches = Pattern.matches(this.validURL,url.toString());
		if(matches == true) {
			this.parseUrl(url.toString());	
		}else {
			throw new MalformedURLException(this.invalidMsg);
		}
		
		this.url = url;
	}
	public PlatformApplicationUrl(String url) throws MalformedURLException {
		
		URL value = new URL(url);
		
		boolean matches = Pattern.matches(validURL,value.toString());
		if(matches == true) {
			this.parseUrl(value.toString());	
		}else {
			throw new MalformedURLException(this.invalidMsg);
		}
		
		this.url = value;
	}
	
	public URL getURL() {
		return this.url;
	}
	@Override
	public Long getAccountId() {
		return this.accountid;
	}
	@Override
	public Long getApplicationId() {
		return this.applicationid;
	}
	@Override
	public Long getAnalysisId() {
		return this.analysisid;
	}
	/**
	 * This method parses from the url the values of the account, application, and scan IDs.
	 *  
	 * @param value The url string to be parsed by method.
	 */
	private void parseUrl(String value) {
		
		String[] content = value.split("#");
		
		String partial = content[1].substring((content[1].indexOf(":") + 1), content[1].length());
		StringTokenizer st = new StringTokenizer(partial, ":");
		
		int index = 1;
		while(st.hasMoreTokens()) {
			String token =  st.nextToken();
			//logger.debug(token);
			
			switch(index) {
				case 1: this.accountid = Long.valueOf(token); index++; break;
				case 2: this.applicationid = Long.valueOf(token); index++; break;
				case 3: this.analysisid = Long.valueOf(token); index++; break;
				default: index++; break;
			}
		}
	}
}
