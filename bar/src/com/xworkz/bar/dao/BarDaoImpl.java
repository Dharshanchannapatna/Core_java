package com.xworkz.bar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bar.dto.BarDto;
import static com.xworkz.bar.constants.MysqlProperties.*;

public class BarDaoImpl implements BarDao {

	@Override
	public boolean save(BarDto barDto) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String insert = "insert  into bar.bar_info values(" + barDto.getId() + ",'" + barDto.getName() + "','"
					+ barDto.getLocation() + "','" + barDto.getType().getName() + "'," + barDto.getAvgcollectionPerDay()
					+ "," + barDto.getCollectionPerMonth() + ")";
			Statement statement = connection.createStatement();
			int noOfRowsAffected = statement.executeUpdate(insert);
			if (noOfRowsAffected > 0) {
				System.out.println("Data Saved:" + insert);
			} else
				System.out.println("Data is not saved");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

}
