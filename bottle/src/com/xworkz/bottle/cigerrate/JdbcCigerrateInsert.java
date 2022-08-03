package com.xworkz.bottle.cigerrate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCigerrateInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesCigerrate.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesCigerrate.URL.getValue(),
				DbPropertiesCigerrate.USERNAME.getValue(), DbPropertiesCigerrate.PASSWORD.getValue());
		System.out.println(connection);
		String insert="insert into cigerrate.cigerrate_info values(10,'raja',13.00,'mint','goldentobacco')";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(insert);
		System.out.println(noOfRowsAffected);
	}

}
