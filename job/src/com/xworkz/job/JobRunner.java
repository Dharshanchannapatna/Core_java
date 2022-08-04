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
	
	JobDto  jobDto1=jobDao.findById(1);
	System.out.println(jobDto1);
	System.out.println("================");
	
	JobDto    jobDto2=jobDao.findByIdAndDesigination(2, "Senior_Associate");
	System.out.println(jobDto2);
	
	System.out.println("================");
	JobDto jobDto3=jobDao.findByIdAndDesiginationAndQualification(2, "Senior_Associate", "Bca");
	System.out.println(jobDto3);
	
	System.out.println("================");
	jobDao.getTotal();
	
	 System.out.println("================");
	 Boolean    y=jobDao.isFresherById(2);
	 System.out.println(y);
	
	 System.out.println("================");
	   Double u=jobDao.getMaxPercentage();
	   System.out.println(u);
	}

}
