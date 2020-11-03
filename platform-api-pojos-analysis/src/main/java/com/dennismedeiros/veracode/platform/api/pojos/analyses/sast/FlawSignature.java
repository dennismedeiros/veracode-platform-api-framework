package com.dennismedeiros.veracode.platform.api.pojos.analyses.sast;

import java.util.Date;

import com.dennismedeiros.veracode.platform.api.pojos.analyses.Find;

public class FlawSignature implements Comparable<FlawSignature>{
	
	private static String bytesToHex(byte[] hash) {
		
	    StringBuffer hexString = new StringBuffer();
	    for (int i = 0; i < hash.length; i++) {
	    	String hex = Integer.toHexString(0xff & hash[i]);
		    if(hex.length() == 1) hexString.append('0');
			        hexString.append(hex);
	    }
	    
	    return hexString.toString();
	}
	
	//Hashed Signature array
	private static String[] generateHashedSignature() {
		return null;
	}
	
	private String attackVector; //type

	private String classObject; //scope
	private Integer cwe;
	
	//private String scope;
	private int dataPathCount;
	private Date firstDateOfOccurance;
	
	//Internal Signatures
	private String functionPrototype;
	private String functionPrototypeHash;
	
	private Integer functionRelativeLocation;
	private Integer id;
	
	private Integer lineNumber;

	//Module/sourceFilePath
	private String matchPattern;

	private String mitigationStatus;
	
	private String module;
	
	private String remediationStatus;
	
	private String severity;

	private String sourceFile;

	private String sourceFilePath;

	//TODO: Add to Flaw Type and Add Instance
	public FlawSignature(Find finding){
		
		this.id = finding.getId();
//		
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss z", Locale.ENGLISH);
//		formatter.setTimeZone(TimeZone.getTimeZone("UTC"));//.getTimeZone("America/New_York"));
//		try {
//		//this.firstDateOfOccurance =  formatter.parse(flaw.getDateFirstOccurrence());		
//		this.dataPathCount = finding.getCount();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		this.cwe = finding.getCweid().intValue();
//		this.remediationStatus = finding.getRemediationStatus();
//		this.mitigationStatus = finding.getMitigationStatus();
//		
//		//Internal Signature
//		this.module = finding.getModule();
//		this.sourceFile = finding.getSourceFile();
//		this.sourceFilePath = finding.getSourceFilePath();
//		this.functionPrototype = finding.getFunctionPrototype();
//		this.attackVector = finding.getType();
//		this.lineNumber = finding.getLine().intValue();
//		
//		this.functionRelativeLocation = finding.getFunctionRelativeLocation().intValue();
//		
//		this.matchPattern = generateMatchPattern(this.module, 
//				this.sourceFilePath, 
//				this.sourceFile,
//				this.classObject, 
//				this.functionPrototype, 
//				this.attackVector);
	}

	public FlawSignature(int id){
		this.id = id;
	}

	@Override
	public int compareTo(FlawSignature sig) {
		int result = -1;
		
		if((result = this.cwe.compareTo(sig.cwe)) == 0) {
			//Compare matching Pattern
			if(this.getMatchPattern().compareTo(sig.getMatchPattern()) == 0) {
				result = 0;
			}	
		}
		return result;
	}

	public String getAttackVector() {
		return attackVector;
	}

	public String getClassObject() {
		return classObject;
	}

	public int getCwe() {
		return cwe;
	}

	public int getDataPathCount() {
		return dataPathCount;
	}

	public Date getFirstDateOfOccurance() {
		return firstDateOfOccurance;
	}

	public String getFunctionPrototype() {
		return functionPrototype;
	}

	public String getFunctionPrototypeHash() {
		return functionPrototypeHash;
	}

	public int getFunctionRelativeLocation() {
		return functionRelativeLocation;
	}

	public int getId() {
		return id;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public String getMatchPattern() {
		
		this.matchPattern = generateMatchPattern(this.module, 
				this.sourceFilePath, 
				this.sourceFile,
				this.classObject, 
				this.functionPrototype, 
				this.attackVector);
		return matchPattern;
	}
	
	public String getMatchPatternWithLineNumber() {
		return this.getMatchPattern() + "|" + this.lineNumber.toString();
	}
	public String getMatchPatternComplete() {
		return this.getMatchPattern() + "|" + this.lineNumber.toString() + "|" + this.functionRelativeLocation;
	}
	
	public String getMitigationStatus() {
		return mitigationStatus;
	}

	public String getModule() {
		return module;
	}
	
	public String getRemediationStatus() {
		return remediationStatus;
	}

	public String getSeverity() {
		return severity;
	}

	public String getSignature() {
		return null;
	}

	public String getSourceFile() {
		return sourceFile;
	}

	public String getSourceFilePath() {
		return sourceFilePath;
	}

	public void setAttackVector(String attackVector) {
		this.attackVector = attackVector;
	}

	public void setClassObject(String classObject) {
		this.classObject = classObject;
	}

	public void setCwe(int cwe) {
		this.cwe = cwe;
	}

	public void setDataPathCount(int dataPathCount) {
		this.dataPathCount = dataPathCount;
	}

	public void setFirstDateOfOccurance(Date firstDateOfOccurance) {
		this.firstDateOfOccurance = firstDateOfOccurance;
	}

	public void setFunctionPrototype(String functionPrototype) {
		this.functionPrototype = functionPrototype;
	}

	public void setFunctionPrototypeHash(String functionPrototypeHash) {
		this.functionPrototypeHash = functionPrototypeHash;
	}

	public void setFunctionRelativeLocation(int functionRelativeLocation) {
		this.functionRelativeLocation = functionRelativeLocation;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void setMitigationStatus(String mitigationStatus) {
		this.mitigationStatus = mitigationStatus;
	}
	
	public void setModule(String module) {
		this.module = module;
	}
	
	
	public void setRemediationStatus(String remediationStatus) {
		this.remediationStatus = remediationStatus;
	}
	
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	
	public void setSourceFile(String sourceFile) {
		this.sourceFile = sourceFile;
	}
	
	public void setSourceFilePath(String sourceFilePath) {
		this.sourceFilePath = sourceFilePath;
	}

	
	
	@Override
    public boolean equals(Object o) { 
		boolean result = false;
		
        // If the object is compared with itself then return true   
        if (this != o) { 
        	if (o instanceof FlawSignature) { 
        		FlawSignature f = (FlawSignature) o; 
                  
                result = this.cwe.equals(f.cwe) &&
                		//this.matchPattern.equals(f.matchPattern);
                		this.getMatchPatternComplete().equals(f.getMatchPatternComplete());
            } 
        } else {
        	result = true;
        }
  
        return result;
    } 
	public String getObjectPattern() {
		return generateObjectPattern(sourceFilePath, sourceFile, classObject, functionPrototype, attackVector);
	}
	public String getObjectPatternWithLinNumber() {
		return generateObjectPattern(sourceFilePath, sourceFile, classObject, functionPrototype, attackVector)
				+ "|" + this.lineNumber.toString() + "|" + this.functionRelativeLocation;
	}	
	private static String generateObjectPattern(String sourceFilePath, 
			String sourceFile, String classObject, String functionPrototype, String attackVector) {
		
			//sourcepath|sourcefile|Class|Method|AttackVectorObject|(line)
			StringBuilder sb = new StringBuilder();
			sb.append(sourceFilePath.toLowerCase());
			sb.append(sourceFile.toLowerCase());
			return String.join("|", sb.toString(), classObject, functionPrototype, attackVector);
	}
	
	private static String generateMatchPattern(String module, String sourceFilePath, 
			String sourceFile, String classObject, String functionPrototype, String attackVector) {
		//Module|sourcepath|sourcefile|Class|Method|AttackVectorObject|(line)
		StringBuilder sb = new StringBuilder();
		sb.append(sourceFilePath.toLowerCase());
		sb.append(sourceFile.toLowerCase());
		return String.join("|", module.toLowerCase(), sb.toString(), classObject, functionPrototype, attackVector);
	}
	
}
