package com.xworkz.bottle.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class JdbcPerfumeRead {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesPerfume.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesPerfume.URL.getValue(),
				DbPropertiesPerfume.USERNAME.getValue(), DbPropertiesPerfume.PASSWORD.getValue());
		System.out.println(connection);

		String sql = "SELECT  * FROM perfume.perfume_info ";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		AtomicInteger auto = new AtomicInteger();
		while (resultSet.next()) {
			auto.incrementAndGet();
			int slNo = resultSet.getInt(1);
			String brand = resultSet.getString(2);
			double price = resultSet.getDouble(3);
			String type = resultSet.getString(4);
			String ingredient= resultSet.getString(5);
			System.out.println(slNo + " " + brand+ " " + price + " " + ingredient + " " + type);

		}

		System.out.println(auto.get());


	}

}
