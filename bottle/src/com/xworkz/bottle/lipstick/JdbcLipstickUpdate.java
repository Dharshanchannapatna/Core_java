package com.xworkz.bottle.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcLipstickUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesLipstick.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesLipstick.URL.getValue(),
				DbPropertiesLipstick.USERNAME.getValue(), DbPropertiesLipstick.PASSWORD.getValue());
		System.out.println(connection);
		String update = "update  lipstick.lipstick_info set brandName='mac' where price=200.00";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(update);
		System.out.println(noOfRowsAffected);

	}

}
