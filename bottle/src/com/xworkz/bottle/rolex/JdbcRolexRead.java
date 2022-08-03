package com.xworkz.bottle.rolex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class JdbcRolexRead {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesRolex.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesRolex.URL.getValue(),
				DbPropertiesRolex.USERNAME.getValue(), DbPropertiesRolex.PASSWORD.getValue());
		System.out.println(connection);
		String sql = "SELECT  * FROM rolex.rolex_info ";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		AtomicInteger auto = new AtomicInteger();
		while (resultSet.next()) {
			auto.incrementAndGet();
			int slNo = resultSet.getInt(1);
			String brand = resultSet.getString(2);
			double price = resultSet.getDouble(5);
			String country = resultSet.getString(4);
			String colour = resultSet.getString(5);
			System.out.println(slNo + " " + brand + " " + country + " " + colour + " " + price);

		}

		System.out.println(auto.get());

	}

}
