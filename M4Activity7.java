package com.bpi.m4.Activity7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class M4Activity7 {
	private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		runTest(() -> account.deposit(5000), "Deposit");
		runTest(() -> account.withdraw(3000), "Withdrawal");
		runTest(() -> account.deposit(-500), "Deposit");
		runTest(() -> account.withdraw(20000), "Withdrawal");
		runTest(() -> account.deposit(60000), "Deposit");
	}
	
	public static void runTest(BankTestOperation operation, String operationName) {
		try {
			operation.execute();
			//logger.info(operationName);
		} catch (InvalidAmountException e) {
			logger.error("Deposit failed: Deposit amount must be positive", operationName, e);
		} catch (InsufficientFundsException e) {
			logger.error("Withdrawal failed: Insufficient funds for withdrawal", operationName, e);
		}
		
	}

}
