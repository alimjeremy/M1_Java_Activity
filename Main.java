package com.bpi.m4.Activity3;

public class Main {

	public static void main(String[] args) {
		ATMTransaction atmTran = new ATMTransaction();
		
		System.out.println("=== ATM BALANCE INQUIRY SYSTEM ====\n");
		
		System.out.println("--- Test Case 1: Valid Savings Account ---");
		atmTran.checkBalance("100123456", 15000.00);

		System.out.println("--- Test Case 2: Valid Checking Account ---");
		atmTran.checkBalance("200987654", 25000.00);
		
		System.out.println("--- Test Case 3: Invalid Account Number Format ---");
		atmTran.checkBalance("ABC12345", 15000.00);
		
		System.out.println("--- Test Case 4: Empty Account Number ---");
		atmTran.checkBalance("", 15000.00);
	}

}
