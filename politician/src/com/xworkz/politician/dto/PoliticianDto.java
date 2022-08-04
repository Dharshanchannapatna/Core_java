package com.xworkz.politician.dto;

import com.xworkz.politician.constants.PartyName;
import com.xworkz.politician.constants.PartySymbol;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class PoliticianDto {
	private Integer id;
	private String name;
	private PartyName partyName;
	private String partyOfficeLocation;
	private Integer totalMembers;
	private Double partyBudject;
	private String president;
	private String headQuatress;
	private PartySymbol partySymbol;

}
