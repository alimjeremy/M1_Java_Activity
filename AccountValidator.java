package com.bpi.m4.Activity4;

public class AccountValidator {
	
	public void validateAccountNumber(String accountNumber) throws Exception {
		if (accountNumber == null) {
			throw new NullPointerException("Cannot be null");
		} else if (accountNumber.length() != 10) {
			throw new Exception("Must be 10 digits");
		} else {
			System.out.println("Valid account: "+accountNumber);
		}
	}

}
