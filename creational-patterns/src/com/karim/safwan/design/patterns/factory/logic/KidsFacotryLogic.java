package com.karim.safwan.design.patterns.factory.logic;
import java.util.ArrayList;
import java.util.List;

import com.karim.safwan.design.patterns.creational.*;

public class KidsFacotryLogic implements IFactoryProvider {
	private static List<Country> kidCountryArray;
	
	public KidsFacotryLogic(Country[] allCountryArray) {
		kidCountryArray = new ArrayList<Country>();
		setKidCountry(allCountryArray);
	}
	
	
	private void setKidCountry(Country[] allCountryArray) {
		for(Country country : allCountryArray) {
			Status[] statusArr = country.getMyStatusArray();
			for(Status status : statusArr) {
				if(status == Status.KIDS)
					kidCountryArray.add(country);
			}
		}
	}
	
	public Country getCountry() {
		int min = 10000;
		Country retCountry = null; 
		
		for(Country country : kidCountryArray) {
			if(min > country .getPriority()) {
				min = country .getPriority();
				retCountry = country;
			}
		}
		
		if(retCountry instanceof America)
			return new America();
		else if(retCountry instanceof Bangladesh)
			return new Bangladesh();
		else if(retCountry instanceof Paris)
			return new Paris();
		else if(retCountry instanceof China)
			return new China();
		else
			return null;
	}
}
