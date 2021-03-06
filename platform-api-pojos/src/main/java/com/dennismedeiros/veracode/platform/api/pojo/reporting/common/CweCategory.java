package com.dennismedeiros.veracode.platform.api.pojo.reporting.common;

import java.math.BigInteger;
import java.util.List;

import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.dast.DynamicAnalysisFlawFind;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.mast.ManualAnalysisFlawFind;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.sast.StaticAnalysisFlaw;

/**
 * 
 * @author Dennis Medeiros
 *
 */
public interface CweCategory {

	Integer getId();
	String getName();
	String getDescription();
	
	List<StaticAnalysisFlaw> getStaticAnalysisFlaws();
	List<DynamicAnalysisFlawFind> getDynamicAnalysisFlaws();
	List<ManualAnalysisFlawFind> getManualAnalysisFlaws();
	
	Boolean isPcirelated();
	BigInteger getOwasp();
	BigInteger getSans();
	BigInteger getCertc();
	BigInteger getCertcpp();
	BigInteger getCertjava();

	static interface CweDescription {
         List<CweCategory.CweDescription.IText> getText();

         static interface IText {
            String getText();
            void setText(String value);
        }
    }
}