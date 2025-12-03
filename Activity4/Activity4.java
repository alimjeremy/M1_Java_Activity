/**
 * 
 */
package com.bpi.hello;

import java.util.Scanner;

public class Activity4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter your age: ");
			int age = sc.nextInt();
			
			if (age <= 18) {
				System.out.println("Minor");
			}
			else if (age >= 18 && age <= 59) {
				System.out.println("Adult");
			}
			else if (age >= 60) {
				System.out.println("Senior");
			}
			else {
				
			}
		}

	}

}
