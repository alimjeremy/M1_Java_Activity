package com.bpi;

/**
 * 
 */
public class Car {
	
	private String carName;
	private String carBrand;
	private String carColor;
	private String carType;
	
	public Car(String carName, String carBrand, String carColor, String carType) {
		this.carName = carName;
		this.carBrand = carBrand;
		this.carColor = carColor;
		this.carType = carColor;
		
	}
	
	public Car() {
		
	}
	
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	void displayInfo() {
		System.out.println("Car name is "+getCarName()+ " car brand is " +getCarBrand()+ " car color is "+getCarColor()+" car type "+getCarType());
	}

}
