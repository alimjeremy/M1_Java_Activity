/**
 * 
 */
package com.bpi.Activity5;

import java.util.Scanner;

public class Activity5 {
	
	public static int add(int x) {
		int result = 0;
		for (int i = 1; i <= x; i++) {
			result = result + i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter how many loop: ");
			int userin = sc.nextInt();
			System.out.println("Sum = " + add(userin));
			
		}

	}

}
