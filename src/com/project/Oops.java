package com.project;

public class Oops {
	
	
	String name;
	int age= 5;
	
	public Oops(String n, int age) {
		this.name = n;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oops obj = new Oops("Java Programming", 10);
		obj.name = "Java Programming";
		obj.age = 10;
		
		Oops py = new Oops("Python Programming", 8);

	}

}
