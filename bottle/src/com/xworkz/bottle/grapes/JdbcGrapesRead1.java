package com.xworkz.bottle.grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcGrapesRead1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(Dbpropertiesgrapes.NAME.getValue());
		Connection connection = DriverManager.getConnection(Dbpropertiesgrapes.URL.getValue(),
				Dbpropertiesgrapes.USERNAME.getValue(), Dbpropertiesgrapes.PASSWORD.getValue());
		System.out.println(connection);
		
		String sql = "SELECT grp.* FROM grapes.grapes_info as grp where  price=130";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		boolean result = resultSet.next();
		System.out.println(result);
		if(result) {
		int slNo = resultSet.getInt(1);
		System.out.println(slNo);
		String name = resultSet.getString(2);
		System.out.println(name);
		double price = resultSet.getDouble(4);
		System.out.println(price);
		String colour = resultSet.getString(3);
		System.out.println(colour);
		String country = resultSet.getString(5);
		System.out.println(country);
		}
		else
			System.out.println("not found");
	}


}
