package com.xworkz.job.dto;

import com.xworkz.job.constants.Desigination;
import com.xworkz.job.constants.Qualification;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor

@NoArgsConstructor
@ToString

public class JobDto {
	private Integer id;
	private Desigination desigination=Desigination.DEFAULT;
	private Double annualPackage;
	private Qualification qualification=Qualification.DEFAULT;
	private Double percentage;
	private String fresher;
	

}
