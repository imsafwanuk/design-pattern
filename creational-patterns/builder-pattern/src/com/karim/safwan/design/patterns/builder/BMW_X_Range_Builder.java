package com.karim.safwan.design.patterns.builder;

public class BMW_X_Range_Builder extends BMW_Car_Builder {
	
	BMW_X_Range_Builder() {
		car.setCarType(BMW_Car.CAR_TYPE_SUV);
		car.setSeats(7);
		car.setRadio(true);
		car.setNagivation(true);
		car.setCarInterior(BMW_Car.CAR_INTERIOR_LUXURY);
		car.setCarTransmission(BMW_Car.CAR_TRANSMISSION_AUTO);
		car.setCarWeight(1346);
		car.setEngineSize("V6");
		
		// 2 modifyable stuff in this class
		this.setCarColor("No Color Set Yet");
		this.setRoofFeature(BMW_Car.MOON_ROOF);
	}
	
}
