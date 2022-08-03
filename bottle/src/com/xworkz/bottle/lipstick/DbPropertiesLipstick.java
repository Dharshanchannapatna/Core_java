package com.xworkz.bottle.lipstick;

public enum DbPropertiesLipstick {
	URL("jdbc:mysql://localhost:3306/lipstick"),USERNAME("root"),PASSWORD("7411523837"),NAME("com.mysql.cj.jdbc.Driver");
	
	private String value;
	
	
	private DbPropertiesLipstick(String value) {
		this.value=value;
		
	}
     public String getValue() {
		return value;
	}

}

