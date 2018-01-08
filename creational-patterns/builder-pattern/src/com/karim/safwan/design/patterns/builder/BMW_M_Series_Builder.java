package com.karim.safwan.design.patterns.builder;

public class BMW_M_Series_Builder extends BMW_Car_Builder {
	
	BMW_M_Series_Builder() {
		car.setCarType(BMW_Car.CAR_TYPE_SPORTS);
		car.setSeats(2);
		car.setRadio(false);
		car.setNagivation(true);
		car.setCarInterior(BMW_Car.CAR_INTERIOR_LUXURY);
		car.setCarTransmission(BMW_Car.CAR_TRANSMISSION_MANUAL);
		car.setCarWeight(478);
		car.setEngineSize("V8");
		
		// 2 modifyable stuff in this class
		car.setCarColor("No Color Set Yet");
		car.setRoofFeature(BMW_Car.FOLDING_ROOF);
	}

}
