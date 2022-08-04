package com.xworkz.politician.dao;

import com.xworkz.politician.dto.PoliticianDto;

public interface PoliticianDao {
	public Boolean save(PoliticianDto politicianDto);

	PoliticianDto findById(Integer id);

	PoliticianDto findByIdAndPresident(Integer id, String president);

	PoliticianDto findByIdAndNameAndPresident(Integer id, String name, String president);

	PoliticianDto findByIdAndName(Integer id, String name);
	
	String findNameById(Integer id);

}
