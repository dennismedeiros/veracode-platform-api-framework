package com.dennismedeiros.veracode.platform.api.sdk.io;

import com.dennismedeiros.veracode.platform.api.pojo.reporting.DetailedReport;

public interface ISerializer {

	DetailedReport deserialize();

	void serialize();

}