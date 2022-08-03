package com.xworkz.bar.constants;

public enum Bartype {
	WINESTORE("Wine_Store"),
	RESORT("Resort"),
	MSIL("msil"), 
	BARANDRESTURENT("Bar_resturent"), 
	DEFAULT("resturent");

	private String name;

	private Bartype(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}
}
