package com.xworkz.job.constants;

public enum MysqlProperties {
	URL("jdbc:mysql://localhost:3306/job"),
	USERNAME("root"),
	SECRETE("7411523837");
	
	private String value;
	private MysqlProperties(String value) {
		this.value=value;
	}
	public String getValue() {
		return value;
	}

}
