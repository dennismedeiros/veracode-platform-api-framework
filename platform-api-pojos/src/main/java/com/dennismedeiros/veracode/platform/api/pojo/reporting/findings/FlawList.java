package com.dennismedeiros.veracode.platform.api.pojo.reporting.findings;

import java.util.List;

import com.dennismedeiros.veracode.platform.api.pojo.analyses.Find;

public interface FlawList {

	List<Find> getFinds();
}