package com.project;

public class Child extends Parent {

	String qualification;
	
	public void study() {
	System.out.println("Child studies");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParent granny = new GrandParent();
		granny.name = "Granny";
		granny.age = 80;
		granny.property = "A house and a land";

	}

}
