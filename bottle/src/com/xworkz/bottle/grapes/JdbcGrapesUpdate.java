package com.xworkz.bottle.grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcGrapesUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(Dbpropertiesgrapes.NAME.getValue());
		Connection connection = DriverManager.getConnection(Dbpropertiesgrapes.URL.getValue(),
				Dbpropertiesgrapes.USERNAME.getValue(), Dbpropertiesgrapes.PASSWORD.getValue());
		System.out.println(connection);
		String update = "update  grapes.grapes_info set name='moondrops1' where price=100.00";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(update);
		System.out.println(noOfRowsAffected);
	}

}
