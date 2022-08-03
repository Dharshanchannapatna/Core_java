package com.xworkz.bottle.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcLipstickRead1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesLipstick.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesLipstick.URL.getValue(),
				DbPropertiesLipstick.USERNAME.getValue(), DbPropertiesLipstick.PASSWORD.getValue());
		System.out.println(connection);

		String sql = "SELECT com.* FROM lipstick.lipstick_info as com where brandName='mac'";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		boolean result = resultSet.next();
		System.out.println(result);
		if(result) {
		int slNo = resultSet.getInt(1);
		System.out.println(slNo);
		String brandName = resultSet.getString(2);
		System.out.println(brandName);
		double price = resultSet.getDouble(3);
		System.out.println(price);
		String colour = resultSet.getString(4);
		System.out.println(colour);
		String type = resultSet.getString(5);
		System.out.println(type);
		}
		else
			System.out.println("not found");
	}

}
