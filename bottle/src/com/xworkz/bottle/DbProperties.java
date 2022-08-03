package com.xworkz.bottle;

public enum DbProperties {
	URL("jdbc:mysql://localhost:3306"),USERNAME("root"),PASSWORD("7411523837");
		
	private String value;
	
	private DbProperties(String value){
		this.value=value;
	}
public String getValue() {
	return value;
}

}
