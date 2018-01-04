package com.karim.safwan.design.patterns.creational;

public class Bangladesh extends Country{
	// static vars
	static int priority = 0;
	
	public Bangladesh() {
		super("Bangladesh");
		priority++;
		myStatusArray = new Status[] {Status.ROMANCE,Status.DEVELOPING};
	}
	
	// getter
	public int getPriority() {
		return this.priority;
	}
}
