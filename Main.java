package com.bpi.m4.Activity4;

public class Main {

	public static void main(String[] args) throws Exception {
		AccountValidator actVal = new AccountValidator();
		
		try {
			actVal.validateAccountNumber("1234567890");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try {
			actVal.validateAccountNumber("123");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try {
			actVal.validateAccountNumber(null);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
