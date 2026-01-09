package com.bpi.m4.Activity5;

public class AccountValidator {
	
	public void validateAccountNumber(String accountNumber) throws InvalidAccountNumberException, InvalidAccountFormatException {
		for (char c : accountNumber.toCharArray()) {
			if (!Character.isDigit(c)) {
				
				throw new InvalidAccountFormatException("Account number must contain only digits");
			}
		}
		
		if (accountNumber == null || accountNumber.equals("")) {
			
			throw new NullPointerException("Account number cannot be null");
			
		} else if (accountNumber.length() != 10) {
			
			throw new InvalidAccountNumberException("Account number must be exactly 10 digits");
		}
		
		System.out.println("Valid account number: " +accountNumber);
	}
	
	public void testValidation(String testName, String accountNumber) {
		if (accountNumber.trim().isEmpty()) {
			
			System.out.println("\n" +testName+ " " +accountNumber);
			
		} else {
			
			System.out.println("\n" +testName+ " ("+accountNumber+")");
			
		}
		
		try {
			
			validateAccountNumber(accountNumber);
			
		} catch (NullPointerException e) {
			System.out.println("Warning: " + e.getMessage());
		} catch (InvalidAccountNumberException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InvalidAccountFormatException e) {
			System.out.println("Warning: " + e.getMessage());
		}
	}

}
