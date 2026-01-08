package com.bpi.m4.Activity2;

public class ATMSystem {
	double[] accounts = {10000, 15000, 20000};
	
	public void processWithdrawal(String accountIndex, String amountInput) {
		try {
			int index = Integer.parseInt(accountIndex);
			
			double balance = accounts[index];
			double amount = Double.parseDouble(amountInput);
			
			if (amount > balance) {
				System.out.println("Account=" +accountIndex+ ", Amount="+amountInput);
				System.out.println("Current balance: ₱" +balance);
				System.out.println("Withdrawal: ₱" +amount);
				System.out.println("Insufficient funds! Cannot withdraw \n₱" +amount);
			} else {
				double newBalance = balance - amount;
				System.out.println("Account=" +accountIndex+ ", Amount="+amountInput);
				System.out.println("Current balance: ₱" +balance);
				System.out.println("Withdrawal: ₱" +amount);
				System.out.println("New balance: ₱" +newBalance);
				System.out.println("Withdrawal successful!");
			}
		} catch (NumberFormatException e) {
			System.out.println("Account=" +accountIndex+ ", Amount="+amountInput);
			System.out.println("Error: Invalid input!");
			System.out.println("Please enter valid numbers.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Account=" +accountIndex+ ", Amount="+amountInput);
			System.out.println("Error: Account not found!");
			System.out.println("Invalid account index.");
		} catch (Exception e) {
			System.out.println("Transaction failed");
		}
	}
}
