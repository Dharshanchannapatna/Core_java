package com.xworkz.bottle.cigerrate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCigerrateRead1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesCigerrate.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesCigerrate.URL.getValue(),
				DbPropertiesCigerrate.USERNAME.getValue(), DbPropertiesCigerrate.PASSWORD.getValue());
		System.out.println(connection);
		String sql = "SELECT com.* FROM perfume.perfume_info as com where brand='fogg2'";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		boolean result = resultSet.next();
		System.out.println(result);
		if(result) {
		int slNo = resultSet.getInt(1);
		System.out.println(slNo);
		String brand = resultSet.getString(2);
		System.out.println(brand);
		double price = resultSet.getDouble(3);
		System.out.println(price);
		String flavour = resultSet.getString(4);
		System.out.println(flavour);
		String company = resultSet.getString(5);
		System.out.println(company);
		}
		else
			System.out.println("not found");

	}

}
