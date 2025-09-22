package com.project;

public class Polymorphism {

	// Poly - many , morph - forms
//	 Prathamesh : Family member , Passenger , Student , Customer , Client , Friend , NRI

//	 Method overloading , Method overriding(inheritance is needed)
		
	// method with same name , same return type but diff parameters
	public static int add(int a , int b) {
		return a +b;
	}
	
	public static double add(int a , int b , double c) {
		return a +b +c ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println(add(44, 88));
            System.out.println(add(44,88,10.78));
            
            
	}


}
