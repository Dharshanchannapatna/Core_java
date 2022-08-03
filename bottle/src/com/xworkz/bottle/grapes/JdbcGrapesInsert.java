package com.xworkz.bottle.grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcGrapesInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(Dbpropertiesgrapes.NAME.getValue());
		Connection connection = DriverManager.getConnection(Dbpropertiesgrapes.URL.getValue(),
				Dbpropertiesgrapes.USERNAME.getValue(), Dbpropertiesgrapes.PASSWORD.getValue());
		System.out.println(connection);
		String insert = "insert into grapes.grapes_info values(10,'cottoncandy','green',130,'japan')";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(insert);
		System.out.println(noOfRowsAffected);
	}

}
