package com.bpi.m4.Activity5;

public class Main {

	public static void main(String[] args) throws InvalidAccountFormatException, InvalidAccountNumberException {
		
		AccountValidator actValidator = new AccountValidator();
		
		System.out.println("=== Account Number Validation Test ===");
		
		actValidator.testValidation("Test 1: Valid account", "1234567890"); 	// Test 1
		actValidator.testValidation("Test 2: Too short", "123"); 				// Test 2
		actValidator.testValidation("Test 3: Contains letters", "12345ABC90"); 	// Test 3
		actValidator.testValidation("Test 4: Contains space", "1234 567890");	// Test 4
		actValidator.testValidation("Test 5: Null value", ""); 				// Test 5
	}

}
