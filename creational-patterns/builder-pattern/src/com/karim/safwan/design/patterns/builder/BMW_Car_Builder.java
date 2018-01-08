package com.karim.safwan.design.patterns.builder;

public abstract class BMW_Car_Builder {
// 
	protected BMW_Car car;
	
	
// constructor	
	
	public BMW_Car_Builder() {
		car = new BMW_Car();
	}
	
	public BMW_Car build() {
		return car;
	}
	
	
// setters
	
	public BMW_Car_Builder setCarColor(String carColor) {
		car.setCarColor(carColor);
		return this;
	}
	
	public BMW_Car_Builder setRoofFeature(String roofFeature) {
		car.setRoofFeature(roofFeature);
		return this;
	}
	
}
