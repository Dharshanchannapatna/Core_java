package com.xworkz.bottle.cigerrate;

public enum DbPropertiesCigerrate {
URL("jdbc:mysql://localhost:3306/cigerrate"),USERNAME("root"),PASSWORD("7411523837"),NAME("com.mysql.cj.jdbc.Driver");
	
	private String value;
	
	
	private DbPropertiesCigerrate(String value) {
		this.value=value;
		
	}
     public String getValue() {
		return value;
	}


}


