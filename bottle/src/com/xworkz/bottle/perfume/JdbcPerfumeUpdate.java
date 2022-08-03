package com.xworkz.bottle.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcPerfumeUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DbPropertiesPerfume.NAME.getValue());
		Connection connection = DriverManager.getConnection(DbPropertiesPerfume.URL.getValue(),
				DbPropertiesPerfume.USERNAME.getValue(), DbPropertiesPerfume.PASSWORD.getValue());
		System.out.println(connection);
		String update = "update  perfume.perfume_info set brand='fogg1' where price=1750.00";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(update);
		System.out.println(noOfRowsAffected);

	}

}
