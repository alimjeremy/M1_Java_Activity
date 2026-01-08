package com.bpi.m4.Activity1;

public class BankAccount {
	
	public String getAccountName(String accountNumber) {
		if (accountNumber.equals("ACC-001")) {
			return "Juan Dela Cruz";
		}
		else if (accountNumber.equals("ACC-002")) {
			return "Maria Santos";
		}
		return null;
	}
	
	public static void testCase(String accountNumber) {
		try {
			BankAccount account = new BankAccount();
			String name = account.getAccountName(accountNumber);
			String upperName = name.toUpperCase();
			
			System.out.println("=== Bank Account Name Display ===");
			System.out.println("Looking up account: " +accountNumber);
			System.out.println("Account holder: " + upperName +"\n");
			
		} catch (NullPointerException e) {
			System.out.println("Looking up account: " +accountNumber);
			System.out.println("Error: Account not found!\n");
			System.out.println("=== Program completed successfully! ===");
		}
	}

}