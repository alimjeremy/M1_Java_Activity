package com.bpi.SW6;

public class Car extends Vehicle implements Refuelable {
	
	Car(int numberOfWheel, String brand) {
		super(numberOfWheel, brand);
	}
	
	@Override
	void startEngine() {
		System.out.println(brand + " started engine.");
	}
	
	@Override
	public void refuel() {
		System.out.println(brand + " car with " + numberOfWheel + " wheels is refueling with unleaded gasoline.");
	}

}
