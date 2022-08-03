package com.xworkz.bottle.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcLipstickDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesLipstick.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesLipstick.URL.getValue(),
				DbPropertiesLipstick.USERNAME.getValue(), DbPropertiesLipstick.PASSWORD.getValue());
		System.out.println(connection);
		
		String delete="delete from lipstick.lipstick_info where price=250.00 ";
		Statement statement=connection.createStatement();
		int noOfRowsAffected=statement.executeUpdate(delete);
		System.out.println(noOfRowsAffected);

	}

}
