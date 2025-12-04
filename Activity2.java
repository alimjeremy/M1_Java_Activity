/**
 * 
 */
package com.bpi.hello;

import java.util.Scanner;

public class Acitivity2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter your age: ");
			
			String Age = sc.next();
			int iAge = Integer.parseInt(Age);
			double dAge = iAge;
			
			System.out.println("Your age as int: " + iAge);
			System.out.println("Your age as double: " + dAge);
		}

	}

}
