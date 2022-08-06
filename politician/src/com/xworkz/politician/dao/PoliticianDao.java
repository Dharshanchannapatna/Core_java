package com.xworkz.politician.dao;

import java.util.Collections;
import java.util.List;

import com.xworkz.politician.dto.PoliticianDto;

public interface PoliticianDao {
	public Boolean save(PoliticianDto politicianDto);

	PoliticianDto findById(Integer id);

	PoliticianDto findByIdAndPresident(Integer id, String president);

	PoliticianDto findByIdAndNameAndPresident(Integer id, String name, String president);

	PoliticianDto findByIdAndName(Integer id, String name);

	String findNameById(Integer id);

	public String findPresidentByIdAndName(Integer id, String name);

	Integer getTotal();

	default List<PoliticianDto> findAll() {
		return Collections.EMPTY_LIST;
	}

	default List<String> findAllPartyName() {
		return Collections.EMPTY_LIST;
	}

	default List<Integer> findAllInteger() {
		return Collections.EMPTY_LIST;

	}

	default List<Object> findAllNoOfMembersAndFundAndPartyName() {
		return Collections.EMPTY_LIST;
	}

}
