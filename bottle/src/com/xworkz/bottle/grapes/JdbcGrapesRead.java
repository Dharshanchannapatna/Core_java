package com.xworkz.bottle.grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class JdbcGrapesRead {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(Dbpropertiesgrapes.NAME.getValue());
		Connection connection = DriverManager.getConnection(Dbpropertiesgrapes.URL.getValue(),
				Dbpropertiesgrapes.USERNAME.getValue(), Dbpropertiesgrapes.PASSWORD.getValue());
		System.out.println(connection);
		
		String sql = "SELECT  * FROM grapes.grapes_info ";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		AtomicInteger auto = new AtomicInteger();
		while (resultSet.next()) {
			auto.incrementAndGet();
			int slNo = resultSet.getInt(1);
			String name = resultSet.getString(2);
			double price = resultSet.getDouble(4);
			String colour = resultSet.getString(3);
			String country = resultSet.getString(5);
			System.out.println(slNo + " " + name + " " + colour + " " + country + " " + price);

		}

		System.out.println(auto.get());

		

	}

}
