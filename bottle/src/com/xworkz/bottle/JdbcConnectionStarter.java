package com.xworkz.bottle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionStarter {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "7411523837");
System.out.println(connection);

String insert="insert into kingfisher.KingFisher_info values(3,'kingfisherBreeza',500.00,'750ml','15%') ";
Statement statement=connection.createStatement();
int noOfRowsAffected=statement.executeUpdate(insert);
System.out.println(noOfRowsAffected);
}

}
