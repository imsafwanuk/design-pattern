package com.karim.safwan.design.patterns.builder;

public class BMW_Custom_Cars_Builder extends BMW_Car_Builder {
		
//	setters

	public BMW_Custom_Cars_Builder setCarType(String carType) {
		car.carType = carType;
		return this;
	}
	
	public BMW_Custom_Cars_Builder setSeats(int seats) {
		car.seats = seats;
		return this;
	}
	
	@Override
	public BMW_Custom_Cars_Builder setRoofFeature(String roofFeature) {
		car.roofFeature = roofFeature;
		return this;
	}
	
	public BMW_Custom_Cars_Builder setRadio(boolean radio) {
		car.radio = radio;
		return this;
	}
	
	public BMW_Custom_Cars_Builder setNagivation(boolean nagivation) {
		car.nagivation = nagivation;
		return this;
	}
	
	public BMW_Custom_Cars_Builder setCarInterior(String carInterior) {
		car.carInterior = carInterior;
		return this;
	}
	
	public BMW_Custom_Cars_Builder setCarTransmission(String carTransmission) {
		car.carTransmission = carTransmission;
		return this;
	}
	
	public BMW_Custom_Cars_Builder setEngineSize(String engineSize) {
		car.engineSize = engineSize;
		return this;
	}
	
	public BMW_Custom_Cars_Builder setCarWeight(double carWeight) {
		car.carWeight = carWeight;
		return this;
	}
	
	
	@Override
	public BMW_Custom_Cars_Builder setCarColor(String carColor) {
		car.carColor = carColor;
		return this;
	}
	
	@Override
	public BMW_Car build() {
		// check if everything is specified
		boolean makeCar = true;
		
		if(car.getCarColor() == null) {
			System.out.println("Please choose car color.");
			makeCar = false;
		}
		
		if(car.getCarInterior() == null) {
			System.out.println("Please choose an interior for your car.");
			makeCar = false;
		}
		
		if(car.getCarTransmission() == null) {
			System.out.println("Please choose car transmission.");
			makeCar = false;
		}
		
		if(car.getCarType() == null) {
			System.out.println("Please choose car type.");
			makeCar = false;
		}
		
		if(car.getCarWeight() == 0) {
			System.out.println("Please give car weight.");
			makeCar = false;
		}
		
		if(car.getEngineSize() == null) {
			System.out.println("Please give car engine size, from V[1-9].");
			makeCar = false;
		}
		
		if(car.getRoofFeature() == null) {
			System.out.println("Please decide on your car roof.");
			makeCar = false;
		}
		
		if(car.getSeats() == 0) {
			System.out.println("Please decide on your car seats.");
			makeCar = false;
		}
			
		if(makeCar)
			return car;
		else
			return null;
	}
}
