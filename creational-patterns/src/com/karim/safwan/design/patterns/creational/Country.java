package com.karim.safwan.design.patterns.creational;

import java.util.List;

public abstract class Country {	
	// normal vars
	protected String name;
//	protected List<Status> myStatusArray;
	protected Status[] myStatusArray;
	
	Country(String myName){
		this.name = myName;
	}
	
	// setters
	
	// getters
	abstract public int getPriority();

	public Status[] getMyStatusArray() {
		Status[] cpy = new Status[myStatusArray.length];
		for(int i = 0; i < myStatusArray.length; i++)
			cpy[i] = myStatusArray[i];
		return cpy;
	}
	
	public String getName() {
		return name;
	}
	
}
