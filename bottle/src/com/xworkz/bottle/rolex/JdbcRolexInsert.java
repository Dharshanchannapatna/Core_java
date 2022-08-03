package com.xworkz.bottle.rolex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRolexInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesRolex.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesRolex.URL.getValue(),
				DbPropertiesRolex.USERNAME.getValue(), DbPropertiesRolex.PASSWORD.getValue());
		System.out.println(connection);
		String insert = "insert into rolex.rolex_info values(10,'dweller','yellow','us',150000.00) ";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(insert);
		System.out.println(noOfRowsAffected);
	}

}
