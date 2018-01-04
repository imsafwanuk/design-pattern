package com.karim.safwan.design.patterns.creational;

public class America extends Country{
	// static vars
	static int priority = 0;
//	arr = new int[2];
	
	
	public America() {
		super("America");
		priority++;
		myStatusArray = new Status[] {Status.KIDS,Status.DEVELOPED};
//		myStatusArray.add(Status.DEVELOPED);
//		myStatusArray.add(Status.KIDS);
	}
	
	
	// getter
	public int getPriority() {
		return this.priority;
	}
}
