package com.project;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numetor:");
		int num = sc.nextInt();
		System.out.println("Enter the denometor:");
		int den = sc.nextInt();

		try {
			int div = num/den;
			System.out.println(div);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(InputMismatchException ie) {
			System.out.println(ie.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thanks");


		
		FileReader file;
		try {
			file = new FileReader("lab.txt");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		try {
//			System.out.println(file.read());
//		}catch(Exception e) {
			
		














	}

}
