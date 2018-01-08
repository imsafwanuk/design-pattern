package com.karim.safwan.design.patterns.builder;

public class BMW_Car {
	
//	final static variables
	// roofs
	public static final String MOON_ROOF = "Moon roof";
	public static final String FOLDING_ROOF = "Folding roof";
	public static final String SUN_ROOF = "Sun roof";
	public static final String NORMAL_ROOF = "Normalroof";
	
	// car types
	public static final String CAR_TYPE_SEDAN = "Sedan";
	public static final String CAR_TYPE_SPORTS = "Sports";
	public static final String CAR_TYPE_SUV = "SUV";
	
	// car interior
	public static final String CAR_INTERIOR_LUXURY = "Luxury";
	public static final String CAR_INTERIOR_CLASSIC = "Classic";
	
	// car transmission
	public static final String CAR_TRANSMISSION_AUTO = "Auto";
	public static final String CAR_TRANSMISSION_MANUAL = "Manual";
	
	
// final variables
	public final String MAKE = "BMW";
	
// static variables
	
// plain old variables
	protected String carType;
	protected int seats;
	protected String roofFeature;
	protected boolean radio;
	protected boolean nagivation;
	protected String carInterior;
	protected String carTransmission;
	protected String engineSize;
	protected double carWeight;
	protected double carEconomy;
	protected String carColor;
	
	
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public void setRoofFeature(String roofFeature) {
		this.roofFeature = roofFeature;
	}
	
	public void setRadio(boolean radio) {
		this.radio = radio;
	}
	
	public void setNagivation(boolean nagivation) {
		this.nagivation = nagivation;
	}
	
	public void setCarInterior(String carInterior) {
		this.carInterior = carInterior;
	}
	
	public void setCarTransmission(String carTransmission) {
		this.carTransmission = carTransmission;
	}
	
	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
		
	}
	
	public void setCarWeight(double carWeight) {
		this.carWeight = carWeight;
	}
	
	
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	
	
//	getters
	
	public String getCarType() {
		return carType;
	}
	
	public int getSeats() {
		return seats;
	}

	
	public String getRoofFeature() {
		return roofFeature;
	}

	
	public boolean isRadio() {
		return radio;
	}

	
	public boolean isNagivation() {
		return nagivation;
	}

	
	public String getCarInterior() {
		return carInterior;
	}

	public String getCarTransmission() {
		return carTransmission;
	}

	public String getEngineSize() {
		return engineSize;
	}

	public double getCarWeight() {
		return carWeight;
	}
	
	public double getCarEconomy() {
		if( this.engineSize !=null && (this.engineSize.charAt(1)-'0') > '0' && (this.engineSize.charAt(1)-'0') <= '9')
			carEconomy = this.carWeight/(this.engineSize.charAt(1)-'0');
		else 
			carEconomy = this.carWeight;
		return carEconomy;
	}
	
	public String getCarColor() {
		return carColor;
	}

	@Override
	public String toString() {
		getCarEconomy();
		return "BMW_Car [MAKE=" + MAKE + ", carType=" + carType + ", seats=" + seats + ", roofFeature=" + roofFeature
				+ ", radio=" + radio + ", nagivation=" + nagivation + ", carInterior=" + carInterior
				+ ", carTransmission=" + carTransmission + ", engineSize=" + engineSize + ", carWeight=" + carWeight
				+ ", carEconomy=" + carEconomy + ", carColor=" + carColor + "]";
	}
}
