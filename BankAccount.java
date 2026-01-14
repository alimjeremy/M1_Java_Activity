package com.bpi.m4.Activity8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
	private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
	
	//Initial balance
	private double balance = 10000;
	
	public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
		
		logger.info("Withdrawal requested: ₱{}", amount);
		
		if(amount < 0) {
			logger.error("Invalid withdrawal amount: ₱{}", amount);
			throw new InvalidAmountException("Withdrawal amount must be positive");
		}
		
		if(amount > balance) {
			logger.warn("Insufficient funds: ₱{} available", balance);
			throw new InsufficientFundsException("Insufficient funds for withdrawal", balance, amount);
		}
		
		//Process withdrawal
		balance -= amount;
		
		logger.info("Withdrawal completed: ₱{}, New balance: ₱{}", amount, balance);
	}
	
	public void deposit(double amount) throws InvalidAmountException {
		
		logger.info("Deposit requested: ₱{}", amount);
		
		if(amount <= 0) {
			logger.error("Invalid deposit amount: ₱{}", amount);
			throw new InvalidAmountException("Deposit amount must be positive");
		}
		
		if(amount > 50000) {
			logger.warn("Large deposit: ₱{} - requires verification", amount);
		}
		
		//Process deposit
		balance += amount;
		
		logger.info("Deposit completed: ₱{}, New balance: ₱{}", amount, balance);
	}
}
