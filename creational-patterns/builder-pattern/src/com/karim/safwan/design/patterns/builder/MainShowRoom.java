package com.karim.safwan.design.patterns.builder;

public class MainShowRoom {

	public static void main(String[] args) {
		
		// general cars where 2 states are user chosen
		
		BMW_6_Series_Builder builder = new BMW_6_Series_Builder()
				.setCarColor("red")
				.setRoofFeature(BMW_Car.FOLDING_ROOF);

		BMW_M_Series_Builder mBuilder = (BMW_M_Series_Builder) new BMW_M_Series_Builder()
				.setCarColor("red")
				.setRoofFeature(BMW_Car.MOON_ROOF);
		
		// custom car where everything is user chosen
		BMW_Custom_Cars_Builder custom_Cars_Builder = new BMW_Custom_Cars_Builder()
				.setCarType(BMW_Car.CAR_TYPE_SPORTS)
				.setSeats(7)
				.setRadio(true)
				.setNagivation(true)
				.setCarInterior(BMW_Car.CAR_INTERIOR_LUXURY)
				.setCarTransmission(BMW_Car.CAR_TRANSMISSION_AUTO)
				.setCarWeight(1346)
				.setEngineSize("V6")
				.setRoofFeature(BMW_Car.SUN_ROOF)
				.setCarColor("Purple");
		
		
		// build all 3 cars
		BMW_Car SixSeriesCar = builder.build();
		BMW_Car customCar = custom_Cars_Builder.build();
		BMW_Car mCar = mBuilder.build();
		
		System.out.println(SixSeriesCar.toString());
		System.out.println();
		System.out.println(customCar.toString());
		System.out.println();
		System.out.println(mCar.toString());
	}

}
