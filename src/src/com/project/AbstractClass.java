package com.project;

public abstract class AbstractClass {
	
	// variables : 
		int age;
		final static int count  =  0;
		
		// methods
		public abstract void hello(); // This method requires a body instead of a semicolon
		
		public static void add(int a , int b) {
			System.out.println(a +b);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AbstractClass ab = new AbstractClass(); // Cannot instantiate the type AbstractClass
		add(10,90);


	}

}
