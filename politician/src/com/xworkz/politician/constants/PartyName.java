package com.xworkz.politician.constants;

public enum PartyName {
	BJP("Bjp"), CONGRESS("Congress"), KJP("Kjp"), JDS("Jds"), KRS("Krs"), PRAJAKEEYA("Prajakeeya"), AAP("App"),
	SP("Sp"), RSS("Rss"), TDP("Tdp");

	private String partyName;

	private PartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPartyName() {
		return partyName;
	}
	public static PartyName  getByPartyName(String partyName) {
		PartyName[] partyNames=PartyName.values();
   	 for(PartyName partyName2:partyNames) {
   		 System.out.println(partyName2.partyName+"comparing");
   		 if(partyName2.getPartyName().equals(partyName)) {
   		 return partyName2;
   		 }
   	 }
		return null;
   	 
    }

}
