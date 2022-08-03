package com.xworkz.bottle.cigerrate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCigerrateDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesCigerrate.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesCigerrate.URL.getValue(),
				DbPropertiesCigerrate.USERNAME.getValue(), DbPropertiesCigerrate.PASSWORD.getValue());
		System.out.println(connection);
		String delete="delete from cigerrate.cigerrate_info where price=6.00 ";
		Statement statement=connection.createStatement();
		int noOfRowsAffected=statement.executeUpdate(delete);
		System.out.println(noOfRowsAffected);

	}

}
