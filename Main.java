package com.bpi;

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car("Challenger", "Dodge", "Black", "Muscle Car");
		
		car1.setCarName("Mustang");
		car1.setCarBrand("Ford");
		car1.setCarColor("Red");
		car1.setCarType("Muscle Car");
		
		car1.displayInfo();
		car2.displayInfo();
	}

}
