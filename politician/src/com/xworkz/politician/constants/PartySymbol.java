package com.xworkz.politician.constants;

public enum PartySymbol {
	LOTUS("Lotus"), CYCLE("Cycle"), GROOM("Groom"), FORMER("Former"), PEN("Pen"), TV("Tv"), ELEPHANT("Elephant"),
	BIKE("Bike"), FAN("Fan"), PALM("Palm");

	private String partySymbol;

	private PartySymbol(String partySymbol) {
		this.partySymbol = partySymbol;

	}

	public String getPartySymbol() {
		return partySymbol;
	}

	public static PartySymbol getPartySymbolById(String partySymbol) {
		PartySymbol[] partySymbols= PartySymbol.values();
		for (PartySymbol partySymbol2 : partySymbols) {
			System.out.println(partySymbol2.partySymbol + "comparing");
			if (partySymbol2.getPartySymbol().equals(partySymbol)) {
				

			return partySymbol2;
			}
		}

		return null;
	}
}
