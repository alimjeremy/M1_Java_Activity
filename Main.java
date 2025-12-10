package com.bpi.SW6;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car(4, "Ford");
		Truck truck = new Truck(6, "Isuzu");
		
		car.startEngine();
		car.refuel();
		
		truck.startEngine();
		truck.refuel();
		
		destroyVehicle(truck);
	}
	
	static void destroyVehicle(Vehicle vehicleDestroy) {
		vehicleDestroy.destroy();
	}

}
