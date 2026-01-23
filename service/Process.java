package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dao.DBConnection;

public class Process {
	private static String name;
	private static int age;
	private static String email;
	private static int studentId;
	private static String courseName;
	private static double grade;
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;

	
	public Process() {
		
	}
	
	public static void addStudent(Scanner sc) {
		String sql = "INSERT INTO students (name, age, email) VALUES (?, ?, ?)";
		
		System.out.print("\nEnter Name: ");
		name = sc.nextLine();
		System.out.print("Enter Age: ");
		age = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Email: ");
		email = sc.nextLine();
		
		try {
			validateStudent(name, age, email);
			
			conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//Placeholder
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, email);
			
			//Insert (name, age, email)
			pstmt.executeUpdate();
			System.out.print("Student added successfully!");
			
		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQL Error: " + e.getMessage());
		}
		
	}
	
	public static void addCourse(Scanner sc) {
		String sql = "INSERT INTO courses (student_id, course_name, grade) VALUES (?, ?, ?)";
		
		System.out.print("\nEnter Student ID: ");
		studentId = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Course Name: ");
		courseName = sc.nextLine();
		System.out.print("Enter Grade: ");
		grade = Double.parseDouble(sc.nextLine());
		
		try {
			validateCourse(studentId, courseName, grade);
			
			conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//Placeholder
			pstmt.setInt(1, studentId);
			pstmt.setString(2, courseName);
			pstmt.setDouble(3, grade);
			
			//Insert (student_id, course_name, grade)
			pstmt.executeUpdate();
			System.out.print("Course added successfully!");
			
		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	public static void showStudents() {
		System.out.print("\n------------------------------------------------------");
		System.out.printf("\n%-5s | %-20s | %-30s%n", "ID", "NAME", "AGE");
		System.out.println("------------------------------------------------------");
		try {
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select id, name, age from students");
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				System.out.printf("%-5d | %-20s | %-30s%n", id, name, age);
			}
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void showCourses() {
		System.out.print("\n------------------------------------------------------");
		System.out.printf("\n%-5s | %-20s | %-30s%n", "STUDENT_ID", "COURSE_NAME", "GRADE");
		System.out.println("------------------------------------------------------");
		try {
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select student_id, course_name, grade from courses");
			
			while (rs.next()) {
				int student_id = rs.getInt("student_id");
				String course_name = rs.getString("course_name");
				double grade = rs.getDouble("grade");
				
				System.out.printf("%-10d | %-20s | %-30s%n", student_id, course_name, grade);
			}
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	// Method for throws
	public static void validateStudent(String name, Integer age, String email) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty.");
		}
		
		if (!name.matches(".*[a-zA-Z].*")) {
			throw new IllegalArgumentException("Name must contains only letters.");
		}
		
		if (email == null || email.trim().isEmpty()) {
			throw new NumberFormatException("Email cannot be empty.");
		}
	}
	
	public static void validateCourse(int studentId, String courseName, double grade) {
		if (studentId <= 0) {
			throw new NumberFormatException("Error: Student ID not accept 0 or below");
		}
		
		if (courseName == null || courseName.trim().isEmpty()) {
			throw new IllegalArgumentException("Course Name cannot be empty.");
		}
		
		if (grade <= 0) {
			throw new NumberFormatException("Error: grade not accept 0 or below");
		}
	}

}
