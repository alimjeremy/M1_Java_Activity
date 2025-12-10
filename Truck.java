package com.bpi.SW6;

public class Truck extends Vehicle implements Refuelable {
	
	Truck(int numberOfWheel, String brand){
		super(numberOfWheel, brand);
	}
	
	@Override
	void startEngine() {
		System.out.println(brand + " started engine.");
	}
	
	@Override
	public void refuel() {
		System.out.println(brand + " truck with " + numberOfWheel + " wheels is refueling with diesel gasoline.");
	}

}
