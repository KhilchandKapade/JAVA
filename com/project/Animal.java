package com.project;

public class Animal {
	
	String name;
	String type;
	String food;
	
	public Animal(String name , String type , String food) {
		this.name = name;
    	this.type = type;
    	this.food = food;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Animal details: " +this.name+ ","+this.type+","+this.food;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal bird = new Animal();
		bird.name = "Parrot";
		bird.type = "Domestic";
		bird.food = "Chillies";
		System.out.println(bird);
		
		
		Animal dog = new Animal();
		dog.name = "pom";
		dog.type = "Domestic";
		dog.food = "fooder";
		System.out.println(dog);
		
		Animal fish = new Animal("Shark", "Aquaric","Fishes");

	}

}
