package com.dennismedeiros.veracode.platform.api.pojo.reporting.common;

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