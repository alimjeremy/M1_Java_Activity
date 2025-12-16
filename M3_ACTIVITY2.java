package com.bpi.m3.Activity2;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class M3_ACTIVITY2 {

	static HashSet<String> devices = new HashSet<>(Arrays.asList("Laptop", "Mouse", 
			"Keyboard", "Monitor", "Printer"));
	
	public static void main(String[] args) {
		int ch;
		
		try (Scanner sc = new Scanner(System.in)) {
			do { // Make a loop condition for the menu
				System.out.println("Select an option:");
				System.out.print("1. Search a product\n"
						+ "2. Add a product\n"
						+ "3. Print all products and count\n"
						+ "4. Exit\n"
						+ "> ");
				 ch = sc.nextInt();
				 sc.nextLine();
				 
				 handleChoice(ch, sc);
				System.out.println();
			} while (ch != 4);
		}
	}
	
	public static void handleChoice(int choice, Scanner sc) {
		
		switch (choice) {
		case 1 :
			productFound(sc);
			break;
		case 2 :
			addProduct(sc);
			break;
		case 3 :
			printProducts();
			break;
		case 4 :
			System.out.println("Exiting...");
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
	
	public static void productFound(Scanner sc) {
		System.out.print("Enter product name to search: ");
		String pd = sc.nextLine();
		
		if (devices.contains(pd)) {
			System.out.println("Product found");
		} else {
			System.out.println("Product not found");
		}
	}
	
	public static void addProduct(Scanner sc) {
		System.out.print("Enter product name to add: ");
		String newProd = sc.nextLine();
		
		if (devices.add(newProd)) {
			System.out.println("Product added: " + newProd);
		} else {
			System.out.println("Product already exists");
		}
	}
	
	public static void printProducts() {
		System.out.println("All Products:");
		for (String i : devices) {
			System.out.println(i);
		}
		System.out.println("Total unique products: " + devices.size());
	}
}

