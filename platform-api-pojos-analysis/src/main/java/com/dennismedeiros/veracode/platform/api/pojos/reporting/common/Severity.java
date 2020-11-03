package com.dennismedeiros.veracode.platform.api.pojos.reporting.common;

import java.util.List;

/**
 * 
 * @author Dennis Medeiros
 *
 */
public interface Severity {

	List<Category> getCategories();
	int getLevel();
	void setLevel(int value);

}