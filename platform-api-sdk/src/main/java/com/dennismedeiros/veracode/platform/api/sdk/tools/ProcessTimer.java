package com.dennismedeiros.veracode.platform.api.sdk.tools;

public class ProcessTimer {
	private static final String datetimeformat = "yyyy-MM-dd HH:mm:ss 'UTC'";
	private static final String timezone = "GMT";
	
	private long _starttime;
	
	private void timer() {
		this._starttime = System.nanoTime();
		
		long endtime = System.nanoTime();
		long totalTime = endtime - this._starttime;
	
		//logger.debug(String.format("Process Time: %d milliseconds",(totalTime / 1000000)));
	}

}
