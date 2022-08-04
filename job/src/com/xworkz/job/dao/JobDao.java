package com.xworkz.job.dao;

import com.xworkz.job.dto.JobDto;

public interface JobDao {
	Boolean save(JobDto jobDto);

	JobDto findById(Integer id);

	JobDto findByIdAndDesigination(Integer id, String designation);

	JobDto findByIdAndDesiginationAndQualification(Integer id, String designation, String qualification);

	Integer getTotal();

	Boolean isFresherById(Integer id);

	Double getMaxPercentage();

}
