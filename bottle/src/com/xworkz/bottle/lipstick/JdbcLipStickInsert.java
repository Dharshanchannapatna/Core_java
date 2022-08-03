package com.xworkz.bottle.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcLipStickInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesLipstick.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesLipstick.URL.getValue(),
				DbPropertiesLipstick.USERNAME.getValue(), DbPropertiesLipstick.PASSWORD.getValue());
		System.out.println(connection);
		
		String insert="insert into lipstick.lipstick_info values(10,'nasar',1550.00,'skyblue','moist')";
		Statement statement=connection.createStatement();
		int noOfRowsAffected=statement.executeUpdate(insert);
		System.out.println(noOfRowsAffected);

	}

}
