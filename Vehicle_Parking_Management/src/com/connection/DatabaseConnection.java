package com.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	static Connection con = null;

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vpmsdb", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return con;
	}
}

