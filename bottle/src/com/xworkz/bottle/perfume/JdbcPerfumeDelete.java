package com.xworkz.bottle.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcPerfumeDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesPerfume.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesPerfume.URL.getValue(),
				DbPropertiesPerfume.USERNAME.getValue(), DbPropertiesPerfume.PASSWORD.getValue());
		System.out.println(connection);
		
		String delete="delete from perfume.perfume_info where price=2000.00 ";
		Statement statement=connection.createStatement();
		int noOfRowsAffected=statement.executeUpdate(delete);
		System.out.println(noOfRowsAffected);


	}

}
