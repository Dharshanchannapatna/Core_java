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
public static Qualification getQualificationById(String qualification) {
	Qualification[] qualifications=Qualification.values();
	for(Qualification qualification2:qualifications) {
	System.out.println(qualification2.qualifification+"comparing");
	if(qualification2.qualifification.equals(qualifications));
	return qualification2;
	}
	
	
	
	
	return null;
	
}
}
