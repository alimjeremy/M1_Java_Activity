package com.bpi.m3.Activity3;

import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class M3_ACTIVITY3 {

	// Create a HashMap object called ProductPice
	static Map<String, Integer> productPrice = new LinkedHashMap<String, Integer>();
	
	static {
		//Add keys and values (Product, Price)
		productPrice.put("Laptop", 50000);
		productPrice.put("Mouse", 500);
		productPrice.put("Keyboard", 1000);
		productPrice.put("Monitor", 7000);
		productPrice.put("Printer", 6000);
	}
	
	
	public static void main(String[] args) {
		int ch;
		
		try (Scanner sc = new Scanner(System.in)) {
			do { // Make a loop condition for the menu
				System.out.println("Select an option:");
				System.out.print("1. Search a product\n"
						+ "2. Add a product\n"
						+ "3. Print all products and prices\n"
						+ "4. Find the cheapest product\n"
						+ "5. Exit\\n"
						+ "> ");
				 ch = sc.nextInt();
				 sc.nextLine();
				 
				 handleChoice(ch, sc);
				System.out.println();
			} while (ch != 5);
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
			cheapestProduct();
			break;
		case 5 :
			System.out.println("Exiting...");
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
	
	public static void productFound(Scanner sc) {
		System.out.print("Enter product name to search: ");
		String pd = sc.nextLine();
		
		if (productPrice.containsKey(pd)) {
			System.out.println("Product found");
		} else {
			System.out.println("Product not found");
		}
	}
	
	public static void addProduct(Scanner sc) {
		System.out.print("Enter product name to add: ");
		String newProd = sc.nextLine();
		System.out.print("Enter price: ");
		Integer newPrice = sc.nextInt();
		sc.nextLine();
		
		if (productPrice.containsKey(newProd)) {
			System.out.println("Product already exists");
		} else {
			productPrice.put(newProd, newPrice);
			System.out.println("Product added: " + newProd);
		}
	}
	
	public static void printProducts() {
		System.out.println("All Products and prices:");
		for (String key : productPrice.keySet()) {
			System.out.println(key + " - " + productPrice.get(key));
		}
		System.out.println("Total unique products: " + productPrice.size());
	}
	
	public static void cheapestProduct() {
		int minPrice = Collections.min(productPrice.values());
		
		for (String key : productPrice.keySet()) {
			if (productPrice.get(key) == minPrice) {
				System.out.println("Cheapest product: " + key + " - " + productPrice.get(key));
			}
		}
	}
}

