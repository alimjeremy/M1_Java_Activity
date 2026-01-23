package App;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dao.DBConnection;
import service.Process;

public class M5_Activity3 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int ch = 0;
		
		try {
			conn = DBConnection.getConnection();
			System.out.println("Connected to Postgre successfully");

			Scanner sc = new Scanner(System.in);
			
			do { // Make a loop condition for the menu
				System.out.println("=== Student Course Management ===");
				System.out.print("1. Add Student\n"
						+ "2. Add Course\n"
						+ "3. Show Students\n"
						+ "4. Show Courses\n"
						+ "0. Exit\n"
						+ "Choice an option: ");
				 ch = sc.nextInt();
				 sc.nextLine();
				 
				 option(ch, sc);
				System.out.println();
			} while (ch != 0);
			
		} catch (NumberFormatException e) {
			
			System.out.println("Error: " + e.getMessage());
			
		} catch (SQLException e) {	
			
			System.out.println("Error: " + e.getMessage());
			
		} finally {
			//Close ResultSet from DB
			if (rs != null) {
				try {
					rs.close();
					System.out.println("rs");
				} catch (SQLException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			//Close Statement from DB
			if (stmt != null) {
				try {
					stmt.close();
					System.out.println("stmt");
				} catch (SQLException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			//Close Connection from DB
			if (conn != null) {
				try {
					conn.close();
					System.out.println("conn");
				} catch (SQLException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
		}

	}
	
	public static void option(int choice, Scanner sc) {
		switch (choice) {
		case 1 :
			Process.addStudent(sc);
			break;
		case 2 :
			Process.addCourse(sc);
			break;
		case 3 :
			Process.showStudents();
			break;
		case 4 :
			Process.showCourses();
			break;
		case 0 :
			System.out.println("Exiting...");
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
