package com.xworkz.job.dao;

import static com.xworkz.job.constants.MysqlProperties.SECRETE;
import static com.xworkz.job.constants.MysqlProperties.URL;
import static com.xworkz.job.constants.MysqlProperties.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
				jobDto.setDesigination(Desigination.valueOf("desigination"));
				jobDto.setAnnualPackage(annulPackage);
				jobDto.setQualification(Qualification.valueOf("qualification"));
				jobDto.setPercentage(percentage);
				jobDto.setFresher(fresher);
				return jobDto;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

}
