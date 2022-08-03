package com.xworkz.bar.dto;

import com.xworkz.bar.constants.Bartype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class BarDto {
	private Integer id;
	private String name;
	private String location;
	private Bartype type = Bartype.DEFAULT;
	private Double avgcollectionPerDay;
	private Double CollectionPerMonth;

}
