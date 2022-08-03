package com.xworkz.bottle.rolex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRolexRead1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesRolex.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesRolex.URL.getValue(),
				DbPropertiesRolex.USERNAME.getValue(), DbPropertiesRolex.PASSWORD.getValue());
		System.out.println(connection);
		String sql = "SELECT com.* FROM rolex.rolex_info as com where brand='fogg'";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		boolean result = resultSet.next();
		System.out.println(result);
		if (result) {
			int slNo = resultSet.getInt(1);
			System.out.println(slNo);
			String brand = resultSet.getString(2);
			System.out.println(brand);
			double price = resultSet.getDouble(5);
			System.out.println(price);
			String colour = resultSet.getString(3);
			System.out.println(colour);
			String country = resultSet.getString(4);
			System.out.println(country);
		} else
			System.out.println("not found");

	}

}
