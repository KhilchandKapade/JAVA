package com.project;

public interface Atm {
	
	// variable : must initialize a value, cannot reassign a value
	// by default variable are final(cannot change), static
	int chipNo = 101;
	String model = "Custom";
	
	// methods: by default are abstract
	
	public static void credit() {
		//abstract methods do not specify a body
		// static method can have method body
	}
	
	
	public void debit(); // only declare
	
	
	
	
}
