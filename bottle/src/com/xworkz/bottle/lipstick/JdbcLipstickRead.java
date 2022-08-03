package com.xworkz.bottle.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class JdbcLipstickRead {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesLipstick.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesLipstick.URL.getValue(),
				DbPropertiesLipstick.USERNAME.getValue(), DbPropertiesLipstick.PASSWORD.getValue());
		System.out.println(connection);

		String sql = "SELECT  * FROM lipstick.lipstick_info ";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		AtomicInteger auto = new AtomicInteger();
		while (resultSet.next()) {
			auto.incrementAndGet();
			int slNo = resultSet.getInt(1);
			String brandName = resultSet.getString(2);
			double price = resultSet.getDouble(3);
			String colour = resultSet.getString(4);
			String type = resultSet.getString(5);
			System.out.println(slNo + " " + brandName + " " + colour + " " + price + " " + type);

		}

		System.out.println(auto.get());

	}

}
