package com.dennismedeiros.veracode.platform.api.pojo.analyses.sast;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.dennismedeiros.veracode.platform.api.pojo.analyses.Find;
import com.dennismedeiros.veracode.platform.api.pojo.analyses.Weakness;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.findings.FlawList;

@XmlRootElement(name = "staticflaws")
@XmlType(propOrder = {
    "flaw"
})
@XmlAccessorType(XmlAccessType.NONE)
public class StaticAnalysisFlaws implements FlawList {

	@XmlElement(name="flaw", type=StaticAnalysisFlawFinding.class)
    protected List<StaticAnalysisFlaw> flaw;

	public List<StaticAnalysisFlaw> getFlawFindings(){
		if (flaw == null) {
            flaw = new ArrayList<StaticAnalysisFlaw>();
        }
        return this.flaw;
	}
	
	public List<Weakness> getWeaknesses(){
		if (flaw == null) {
           flaw = new ArrayList<StaticAnalysisFlaw>();
        }
        return null;
	}

	@Override
	public List<Find> getFinds() {
		if (flaw == null) {
			flaw = new ArrayList<StaticAnalysisFlaw>();
		}
		return null;
	}
}