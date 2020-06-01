package com.dennismedeiros.veracode.platform.api.pojo.reporting.findings;

import java.util.List;

import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.Find;

public interface FlawList {

	List<Find> getFinds();
}