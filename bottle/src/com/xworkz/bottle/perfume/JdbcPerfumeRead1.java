package com.xworkz.bottle.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcPerfumeRead1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesPerfume.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesPerfume.URL.getValue(),
				DbPropertiesPerfume.USERNAME.getValue(), DbPropertiesPerfume.PASSWORD.getValue());
		System.out.println(connection);

		String sql = "SELECT com.* FROM perfume.perfume_info as com where brand='fogg1'";
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
		String type = resultSet.getString(4);
		System.out.println(type);
		String ingredient = resultSet.getString(5);
		System.out.println(ingredient);
		}
		else
			System.out.println("not found");

	}

}
