package com.xworkz.job.constants;

public enum Qualification {
	BE("Be"),BCA("Bca"),BSC("Bsc"),DEFAULT("Diploma");
	
	private String qualifification;
	private Qualification(String qualifification) {
		this.qualifification=qualifification;
	}
public String getQualifification() {
	return qualifification;
}
}
