package com.xworkz.bottle.grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcGrapesDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(Dbpropertiesgrapes.NAME.getValue());
		Connection connection = DriverManager.getConnection(Dbpropertiesgrapes.URL.getValue(),
				Dbpropertiesgrapes.USERNAME.getValue(), Dbpropertiesgrapes.PASSWORD.getValue());
		System.out.println(connection);
		
		String delete="delete from grapes.grapes_info where price=132.00 ";
		Statement statement=connection.createStatement();
		int noOfRowsAffected=statement.executeUpdate(delete);
		System.out.println(noOfRowsAffected);

	}

}
