package com.xworkz.bottle.perfume;

public enum DbPropertiesPerfume {
URL("jdbc:mysql://localhost:3306/perfume"),USERNAME("root"),PASSWORD("7411523837"),NAME("com.mysql.cj.jdbc.Driver");
	
	private String value;
	
	
	private DbPropertiesPerfume(String value) {
		this.value=value;
		
	}
     public String getValue() {
		return value;
	}


}
