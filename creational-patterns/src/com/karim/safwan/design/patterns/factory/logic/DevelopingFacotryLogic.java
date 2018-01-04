package com.karim.safwan.design.patterns.factory.logic;
import java.util.ArrayList;
import java.util.List;

import com.karim.safwan.design.patterns.creational.*;

public class DevelopingFacotryLogic implements IFactoryProvider {
	private static List<Country> developingCountryArray;
	
	public DevelopingFacotryLogic(Country[] allCountryArray) {
		developingCountryArray = new ArrayList<Country>();
		setDevelopingCountry(allCountryArray);
	}
	
	private void setDevelopingCountry(Country[] allCountryArray) {
		for(Country country : allCountryArray) {
			Status[] statusArr = country.getMyStatusArray();
			for(Status status : statusArr) {
				if(status == Status.DEVELOPING)
					developingCountryArray.add(country);
			}
		}
	}
	
	public Country getCountry() {
		int min = 10000;
		Country retCountry = null; 
		
		for(Country country : developingCountryArray) {
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
