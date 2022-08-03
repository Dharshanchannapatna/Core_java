package com.xworkz.bottle.grapes;

public enum Dbpropertiesgrapes {
URL("jdbc:mysql://localhost:3306/grapes"),USERNAME("root"),PASSWORD("7411523837"),NAME("com.mysql.cj.jdbc.Driver");
	
	private String value;
	
	
	private Dbpropertiesgrapes(String value) {
		this.value=value;
		
	}
     public String getValue() {
		return value;
	}

}



