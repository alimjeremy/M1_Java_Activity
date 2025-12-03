/**
 * 
 */
package com.bpi.hello;

import java.util.Scanner;

public class Activity1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("What is your name? ");
			
			String name = sc.next();
			
			System.out.println("Hello, " + name + "!");
			
		}

	}

}
