package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private final static String url = "jdbc:postgresql://localhost:5432/training_db";
	private final static String username = "GSTJAlim";
	private final static String password = "postgres";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

}
