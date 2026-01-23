package com.bpi.m5.M5_Activity2;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/training_db";
		String username = "leon";
		String password = "T-virus09";
		
		try (Connection conn = DriverManager.getConnection(url, username, password)) { 
			System.out.println("Connected to PostgreSQL successfully!"); 
			} catch (Exception e) { 
				System.out.println("Connection failed!"); e.printStackTrace();
		}

	}

}
