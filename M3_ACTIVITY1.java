package com.bpi.m3.Activity1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class M3_ACTIVITY1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> devices = new ArrayList<>(Arrays.asList("Laptop", "Mouse", 
				"Keyboard", "Monitor", "Printer"));
		
		System.out.println("All products");
		for (int i = 0; i <= 4; i++) {
			System.out.println(i+1 + ". " + devices.get(i));
		}
		
		devices.remove(1);
		devices.add("Webcam");
		
		System.out.println("\nAfter adding and removing products");
		for (int i = 0; i <= 4; i++) {
			System.out.println(i+1 + ". " + devices.get(i));
		}
		
		System.out.print("\nEnter product name to search: ");
		String pd = sc.next();
		
		boolean productFound = false;
		for (String device : devices) {
			if (pd.equals(device)) {
				productFound = true;
				break;
			}
		}
		
		if (productFound) {
			System.out.println("Product found");
		} else {
			System.out.println("Product not found");
		}
		sc.close();
	}

}
