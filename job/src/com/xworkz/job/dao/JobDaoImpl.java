package com.xworkz.job.dao;

import static com.xworkz.job.constants.MysqlProperties.SECRETE;
import static com.xworkz.job.constants.MysqlProperties.URL;
import static com.xworkz.job.constants.MysqlProperties.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.job.constants.Desigination;
import com.xworkz.job.constants.Qualification;
import com.xworkz.job.dto.JobDto;

public class JobDaoImpl implements JobDao {
	@Override
	public Boolean save(JobDto jobDto) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
					SECRETE.getValue());
			String insert = "insert into job.job_info values(?,?,?,?,?,?)";
			PreparedStatement sql = connection.prepareStatement(insert);
			sql.setInt(1, jobDto.getId());
			sql.setString(2, jobDto.getDesigination().getDesigination());
			sql.setDouble(3, jobDto.getAnnualPackage());
			sql.setString(4, jobDto.getQualification().getQualifification());
			sql.setDouble(5, jobDto.getPercentage());
			sql.setString(6, jobDto.getFresher());
			int noOfRowsAffected = sql.executeUpdate();
			if (noOfRowsAffected > 0) {
				System.out.println("The value Inserted are:" + insert);
			} else {
				System.out.println("unable to insert");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public JobDto findById(Integer id) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
					SECRETE.getValue());
			String select = "SELECT * FROM job.job_info where id=?";
			PreparedStatement preparedStatement = connection.prepareCall(select);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println(resultSet);
			while (resultSet.next()) {
				Integer id1 = resultSet.getInt(1);
				String desigination = resultSet.getString(2);
				Double annulPackage = resultSet.getDouble(3);
				String qualification = resultSet.getString(4);
				Double percentage = resultSet.getDouble(5);
				String fresher = resultSet.getString(6);
				JobDto jobDto = new JobDto();
				jobDto.setId(id1);
				jobDto.setDesigination(Desigination.getByDesigination(desigination));
				jobDto.setAnnualPackage(annulPackage);
				jobDto.setQualification(Qualification.getQualificationById(qualification));
				jobDto.setPercentage(percentage);
				jobDto.setFresher(fresher);
				return jobDto;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public JobDto findByIdAndDesigination(Integer id, String designation) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
					SECRETE.getValue());
			String select1 = " SELECT * FROM job.job_info  where id=? and desigination=?";
			PreparedStatement preparedStatement1 = connection.prepareCall(select1);
			preparedStatement1.setInt(1, id);
			preparedStatement1.setString(2, designation);
			ResultSet resultSet1 = preparedStatement1.executeQuery();
			System.out.println(resultSet1);
			while (resultSet1.next()) {
				Integer id2 = resultSet1.getInt(1);
				String desigination1 = resultSet1.getString(2);
				Double Annulpackage1 = resultSet1.getDouble(3);
				String qualification1 = resultSet1.getString(4);
				Double percentage1 = resultSet1.getDouble(5);
				String fresher1 = resultSet1.getString(6);
				JobDto jobDto1 = new JobDto();
				jobDto1.setId(id2);
				jobDto1.setDesigination(Desigination.getByDesigination(desigination1));
				jobDto1.setAnnualPackage(Annulpackage1);
				jobDto1.setQualification(Qualification.getQualificationById(qualification1));
				jobDto1.setPercentage(percentage1);
				jobDto1.setFresher(fresher1);
				return jobDto1;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public JobDto findByIdAndDesiginationAndQualification(Integer id, String designation, String qualification) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
					SECRETE.getValue());
			String select1 = "SELECT * FROM job.job_info where id=? and desigination=? and qualification=?";
			PreparedStatement preparedStatement2 = connection.prepareCall(select1);

			preparedStatement2.setInt(1, id);
			preparedStatement2.setString(2, designation);
			preparedStatement2.setString(3, qualification);

			ResultSet resultSet2 = preparedStatement2.executeQuery();
			System.out.println(resultSet2);
			while (resultSet2.next()) {
				Integer id3 = resultSet2.getInt(1);
				String desigination2 = resultSet2.getString(2);
				Double annualPackage2 = resultSet2.getDouble(3);
				String qualification2 = resultSet2.getString(4);
				Double percentage2 = resultSet2.getDouble(5);
				String fresher2 = resultSet2.getString(6);

				JobDto jobDto2 = new JobDto();
				jobDto2.setId(id3);
				jobDto2.setDesigination(Desigination.getByDesigination(desigination2));
				jobDto2.setAnnualPackage(annualPackage2);
				jobDto2.setPercentage(percentage2);
				jobDto2.setQualification(Qualification.getQualificationById(qualification2));
				jobDto2.setFresher(fresher2);
				return jobDto2;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer getTotal() {
		AtomicInteger atomicInteger = new AtomicInteger();

		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
					SECRETE.getValue());
			String select2 = "SELECT * FROM job.job_info ";
			PreparedStatement preparedStatement3 = connection.prepareStatement(select2);
			ResultSet resultSet = preparedStatement3.executeQuery();

			while (resultSet.next()) {
				atomicInteger.getAndIncrement();
			}
			System.out.println(atomicInteger);

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Boolean isFresherById(Integer id) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
					SECRETE.getValue());
			String select = "SELECT * FROM job.job_info where id=?";
			PreparedStatement preparedStatement4 = connection.prepareStatement(select);
			preparedStatement4.setInt(1, id);
			ResultSet resultSet = preparedStatement4.executeQuery();

			while (resultSet.next()) {
				Integer id5 = resultSet.getInt(1);
				String fresher5 = resultSet.getString(6);

				JobDto jobDto5 = new JobDto();
				jobDto5.setId(id5);
				jobDto5.setFresher(fresher5);
				if (jobDto5.getFresher().equals("yes")) {
					return true;
				} else {
					return false;

				}

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Double getMaxPercentage() {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
					SECRETE.getValue());
			String select = "SELECT   MAX(percentage) AS HighestPercentage FROM job.job_info ";
			PreparedStatement preparedStatement = connection.prepareStatement(select);
			ResultSet resultSet = preparedStatement.executeQuery();
			Double max=0.00;
			while(resultSet.next()) {
				 Double percentage=resultSet.getDouble(1);
				 if(percentage>max) {
					 max=percentage;
					 
				 }
				 return max;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

}
