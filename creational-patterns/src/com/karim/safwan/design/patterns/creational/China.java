package com.karim.safwan.design.patterns.creational;

public class China extends Country{
	// static vars
	static int priority = 0;
//	arr = new int[2];
	
	
	public China() {
		super("China");
		priority++;
		myStatusArray = new Status[] {Status.KIDS,Status.DEVELOPING};
	}
	
	
	// getter
	public int getPriority() {
		return this.priority;
	}
}
