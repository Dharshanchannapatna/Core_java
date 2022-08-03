package com.xworkz.bottle.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcPerfumeInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesPerfume.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesPerfume.URL.getValue(),
				DbPropertiesPerfume.USERNAME.getValue(), DbPropertiesPerfume.PASSWORD.getValue());
		System.out.println(connection);
		String insert = "insert into perfume.perfume_info values(10,'man',2600.00,'spicy','benzaldehyde')";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(insert);
		System.out.println(noOfRowsAffected);

	}
	}


