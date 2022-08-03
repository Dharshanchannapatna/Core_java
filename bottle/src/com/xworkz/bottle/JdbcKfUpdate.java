package com.xworkz.bottle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcKfUpdate {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kingfisher","root", "7411523837");
		System.out.println(connection);

		String update="update  kingfisher.KingFisher_info set brandName='kingFisherStrome' where price=250.00";
		Statement statement=connection.createStatement();
		int noOfRowsAffected=statement.executeUpdate(update);
		System.out.println(noOfRowsAffected);
		}

	}


