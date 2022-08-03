package com.xworkz.bottle.cigerrate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCigerrateUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesCigerrate.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesCigerrate.URL.getValue(),
				DbPropertiesCigerrate.USERNAME.getValue(), DbPropertiesCigerrate.PASSWORD.getValue());
		System.out.println(connection);
		String update = "update  cigerrate.cigerrate_info set brand='flakeextra' where price=20.00";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(update);
		System.out.println(noOfRowsAffected);
		

	}

}
