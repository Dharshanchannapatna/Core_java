package com.xworkz.bottle.cigerrate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class JdbcCigerrateRead {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesCigerrate.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesCigerrate.URL.getValue(),
				DbPropertiesCigerrate.USERNAME.getValue(), DbPropertiesCigerrate.PASSWORD.getValue());
		System.out.println(connection);
		

		String sql = "SELECT  * FROM cigerrate.cigerrate_info ";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		AtomicInteger auto = new AtomicInteger();
		while (resultSet.next()) {
			auto.incrementAndGet();
			int slNo = resultSet.getInt(1);
			String brand = resultSet.getString(2);
			double price = resultSet.getDouble(3);
			String flavour = resultSet.getString(4);
			String comp= resultSet.getString(5);
			System.out.println(slNo + " " + brand+ " " + price + " " + comp + " " + flavour);

		}

		System.out.println(auto.get());



	}

}
