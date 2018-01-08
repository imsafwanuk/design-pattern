package com.karim.safwan.design.patterns.builder;

public class BMW_6_Series_Builder extends BMW_Car_Builder {
	
	BMW_6_Series_Builder() {
		car.setCarType(BMW_Car.CAR_TYPE_SEDAN);
		car.setSeats(5);
		car.setRadio(true);
		car.setNagivation(true);
		car.setCarInterior(BMW_Car.CAR_INTERIOR_CLASSIC);
		car.setCarTransmission(BMW_Car.CAR_TRANSMISSION_AUTO);
		car.setCarWeight(680.8);
		car.setEngineSize("V4");
		
		// 2 modifyable stuff in this class
		car.setCarColor("No Color Set Yet");
		car.setRoofFeature(BMW_Car.SUN_ROOF);
	}
	
	@Override
	public BMW_6_Series_Builder setCarColor(String carColor) {
		car.setCarColor(carColor);
		return this;
	}
	
	@Override
	public BMW_6_Series_Builder setRoofFeature(String roofFeature) {
		car.setRoofFeature(roofFeature);
		return this;
	}

	

	
	
}
