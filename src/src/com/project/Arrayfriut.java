package com.project;

import java.util.Scanner;

public class Arrayfriut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String fruits[]=new String[3];
		System.out.println("Please Enter the First Fruit ");
		fruits[0] = sc.nextLine();
		System.out.println("Please Enter the second Fruit ");
		fruits[1] = sc.nextLine();
		System.out.println("Please Enter the third Fruit ");
		fruits[2] = sc.nextLine();
		
		for(String i : fruits) {
			System.out.println(i);	
		}
		System.out.println("Please Enter the Index of fruit [0-2]:");
		int index = sc.nextInt();
		if(index >=0 && index <fruits.length) {
			System.out.println("Please enter new fruit Name: ");
			String newFruit = sc.nextLine();
			fruits[index] = newFruit;
		}
		else {
			System.out.println("Please enter the Valid index");
		}
		
		
	}


}
