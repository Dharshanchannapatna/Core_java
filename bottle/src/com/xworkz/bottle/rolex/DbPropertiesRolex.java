package com.xworkz.bottle.rolex;

public enum DbPropertiesRolex {
URL("jdbc:mysql://localhost:3306/rolex"),USERNAME("root"),PASSWORD("7411523837"),NAME("com.mysql.cj.jdbc.Driver");
	
	private String value;
	
	
	private DbPropertiesRolex(String value) {
		this.value=value;
		
	}
     public String getValue() {
		return value;
	}



}
