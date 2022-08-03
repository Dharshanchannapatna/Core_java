package com.xworkz.bottle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class JdbcKfRead {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DbProperties.URL.getValue(), DbProperties.PASSWORD.getValue(),DbProperties.USERNAME.getValue());
		System.out.println(connection);

		String sql = "SELECT  * FROM kingfisher.KingFisher_info ";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		AtomicInteger auto = new AtomicInteger();
		while (resultSet.next()) {
			 auto.incrementAndGet();
			int id = resultSet.getInt(1);
			String brandName = resultSet.getString(2);
			String quantity = resultSet.getString(4);
			double price = resultSet.getDouble(3);
			String alchoalPer = resultSet.getString(5);
			System.out.println(id + " " + brandName + " " + quantity + " " + price + " " + alchoalPer);
			
		}

		System.out.println(auto.get());
	}

}
