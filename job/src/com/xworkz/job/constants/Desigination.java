package com.xworkz.job.constants;

public enum Desigination {
	SYSTEMENGINNER("System_Engineer"), WEBDEVELOPER("Web_Developer"), JUNIORASSOCIATE("Junior_Associate"),
	SENIORASSOCIATE("Senior_Associate"),DEFAULT("No_Technical");
	private String desigination;
	
	private Desigination(String desigination) {
		this.desigination=desigination;
		
	}
public String getDesigination() {
	return desigination;
}
}
