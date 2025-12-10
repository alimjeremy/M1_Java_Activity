package com.bpi.SW6;

public abstract class Vehicle {
	int numberOfWheel;
	String brand;
	
	Vehicle(int numberOfWheels, String brand) {
		this.numberOfWheel = numberOfWheels;
		this.brand = brand;
	}
	
	abstract void startEngine();
	
	void destroy() {
		System.out.println(brand + " vehicle with " + numberOfWheel + " wheels is destroyed.");
	}

}
