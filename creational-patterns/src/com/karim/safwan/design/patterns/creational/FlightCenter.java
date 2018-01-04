package com.karim.safwan.design.patterns.creational;

import java.util.Scanner;

import com.karim.safwan.design.patterns.factory.logic.DevelopedFacotryLogic;
import com.karim.safwan.design.patterns.factory.logic.DevelopingFacotryLogic;
import com.karim.safwan.design.patterns.factory.logic.KidsFacotryLogic;
import com.karim.safwan.design.patterns.factory.logic.RomanticFacotryLogic;


public class FlightCenter {
	
	public static void main(String args[]) {
		// create ref for all countries that should be in db
		Country[] countries = getAvaliableCountries();
		
		/* 
		 *create factory classes which encapsulates different logics and generates a country name 
		 * on the run. The main logic is country with wanted status and low priority will be generated.
		 * Giving all countries a fair share of advertisement. 
		 * */
		
		DevelopedFacotryLogic developedFacotryLogic = new DevelopedFacotryLogic(countries);
		DevelopingFacotryLogic developingFacotryLogic = new DevelopingFacotryLogic(countries);
		RomanticFacotryLogic romanticFacotryLogic = new RomanticFacotryLogic(countries);
		KidsFacotryLogic kidsFacotryLogic = new KidsFacotryLogic(countries);
		
		// this is where system asks employee what country to advertise.
		Country country=null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("For Office Use Only.");

		
		String selection = "";
		 do{
			System.out.println("What type of country you want to advertise?");
			System.out.println("Select from: Developed, Developing, Kids, Romantic.	Or type 'exit' to laeve");
			System.out.print(">> ");
			
			selection = scanner.nextLine();
			if(selection.equalsIgnoreCase("developed"))
				country = developedFacotryLogic.getCountry();
			else if(selection.equalsIgnoreCase("developing"))
				country = developingFacotryLogic.getCountry();
			else if(selection.equalsIgnoreCase("kids"))
				country = kidsFacotryLogic.getCountry();
			else if(selection.equalsIgnoreCase("romantic"))
				country = romanticFacotryLogic.getCountry();
			else 
				return;
			
			System.out.println("Lets advertise: " + country.getName());
			
		}while(true);
		
		
		
	}
	
	// create ref countries.
	public static Country[] getAvaliableCountries() {
		Country[] arr = new Country[] {new America(), new Bangladesh(), new Paris(), new China()};
		return arr;
	}
}
