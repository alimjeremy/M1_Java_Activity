package com.bpi.m4.Activity2;

public class Main {

	public static void main(String[] args) {
		ATMSystem actm = new ATMSystem();
		
		System.out.println("=== ATM Withdrawal System ===");
		
		System.out.println("\n--- Test 1: Valid Withdrawal ---");
		actm.processWithdrawal("1", "5000");
		
		System.out.println("\n--- Test 2: Invalid Account Index ---");
		actm.processWithdrawal("abc", "5000");
		
		System.out.println("\n--- Test 3: Account Not Found ---");
		actm.processWithdrawal("10", "5000");
		
		System.out.println("\n--- Test 4: Insufficient Funds ---");
		actm.processWithdrawal("1", "20000");
		
		System.out.println("\n=== All tests completed! ===");

	}

}
