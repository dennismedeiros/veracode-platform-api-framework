package com.dennismedeiros.veracode.platform.api.pojos.reporting.findings;

import java.util.List;

import com.dennismedeiros.veracode.platform.api.pojos.analyses.Find;

public interface FlawList {

	List<Find> getFinds();
}