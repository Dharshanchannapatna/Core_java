package com.xworkz.job;

import com.xworkz.job.constants.Desigination;
import com.xworkz.job.constants.Qualification;
import com.xworkz.job.dao.JobDao;
import com.xworkz.job.dao.JobDaoImpl;
import com.xworkz.job.dto.JobDto;

public class JobRunner {

	public static void main(String[] args) {
		JobDto jobDto = new JobDto(1, Desigination.JUNIORASSOCIATE, 350000.00D, Qualification.BE, 75.25D, "yes");
	JobDao jobDao=new JobDaoImpl();
	jobDao.save(jobDto);
	jobDao.findById(1);
	
	}

}
