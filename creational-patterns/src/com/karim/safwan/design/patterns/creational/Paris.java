package com.karim.safwan.design.patterns.creational;

public class Paris extends Country{
	// static vars
	static int priority = 0;
	
	public Paris() {
		super("Paris");
		priority++;
		myStatusArray = new Status[] {Status.ROMANCE,Status.DEVELOPED};
	}
	
	// getter
	public int getPriority() {
		return this.priority;
	}
}
