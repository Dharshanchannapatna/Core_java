package com.xworkz.bottle.rolex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRolexDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesRolex.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesRolex.URL.getValue(),
				DbPropertiesRolex.USERNAME.getValue(), DbPropertiesRolex.PASSWORD.getValue());
		System.out.println(connection);
		String delete="delete from rolex.rolex_info where price=200000.00 ";
		Statement statement=connection.createStatement();
		int noOfRowsAffected=statement.executeUpdate(delete);
		System.out.println(noOfRowsAffected);

	}

}
