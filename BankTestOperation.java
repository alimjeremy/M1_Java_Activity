package com.bpi.m4.Activity8;

@FunctionalInterface
public interface BankTestOperation  {
	
	void execute() throws InvalidAmountException, InsufficientFundsException;
}
