/**
 * 
 */
package com.bpi.hello;

import java.util.Scanner;

public class Method {
	
	public static int add(int x, int y) {
		return x + y;	
	}
	
	public static int sub(int x, int y) {
		return x - y;
	}
	
	public static int mul(int x, int y) {
		return x * y;
	}
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter first integer: ");
			int firstNum = sc.nextInt();
			System.out.print("Enter second intefer: ");
			int secondNum = sc.nextInt();
			
			int addresult = add(firstNum, secondNum);
			int subresult = sub(firstNum, secondNum);
			int mulresult = mul(firstNum, secondNum);
			
			System.out.println("Sum: " + addresult);
			System.out.println("Differences: " + subresult);
			System.out.println("Product: " + mulresult);
		}

	}

}
