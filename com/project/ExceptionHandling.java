package com.project;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static int Division(int a,int b)throws ArithmeticException {
		return a/b;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int di = 0;
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
		}finally {
		System.out.println(di);;
  		}System.out.println("Thanks you");



		//		FileReader file;
		//		try {
		//			file = new FileReader("lab.txt");
		//		}catch (FileNotFoundException e) {
		//			e.printStackTrace();
		//		}
		//		try {
		//			System.out.println(file.read());
		//		}catch(Exception e) {









		// throw

		try {
			System.out.println("please Enter your age :");
			int age = sc.nextInt();
			if(age < 18) {
				//System.out.println("you cannot vote");
				throw new ArithmeticException("you cannot vote");
			}else {
				System.out.println("you can Vote");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}



		// CustomException

		int pass = 123;
		System.out.println("Please Enter the Password :");
		int userPass = sc.nextInt();
		try {
			if(pass != userPass) {
				throw new IncorrectPasswordException("Incorrect Password");

			}else {
				System.out.println("Login Successfully");
			}
		}catch(IncorrectPasswordException e) {
			e.printStackTrace();
		}






		//		
		//		1. Division by Zero
		//
		//		Write a program that takes two integers from the user and performs division.
		//		Use try-catch to handle the case when the denominator is zero and display a proper error message.

		System.out.println("Enter First number:");
		int n = sc.nextInt();
		System.out.println("Enter Second number:");
		int d = sc.nextInt();

		try {
			int div = n/d;
			System.out.println(div);
		} catch(ArithmeticException e){
			e.printStackTrace();
		} catch( Exception e) {
			e.printStackTrace();
		}



		//		 2. String Index Out of Bounds
		//
		//		Write a program that initializes an string
		//		Ask the user for an index and try to print the char at that index.
		//		Handle the case when the user enters an invalid index.

		String s = "Hello, World";
		System.out.println("Please Enter the index");
		try {
			int index = sc.nextInt();
			char c = s.charAt(index);
			System.out.println("character at "+index+" is "+c);
		}catch(StringIndexOutOfBoundsException ioe) {
			System.out.println("please Enter Valid index");
			System.out.println(ioe.fillInStackTrace());
		}catch(InputMismatchException ie){
			System.out.println("Please enter Valid No.");			}catch(Exception e) {
			System.out.println(e.fillInStackTrace());
		}

		//StringToIt(sc);
		sc.close();





		//		 3. String to Integer Conversion
		//		Take a string input from the user and try to convert it to an integer u

		System.out.println("Please enter a number: ");
		Scanner scanner = new Scanner(System.in);

		// Use a try-catch block to handle conversion errors
		try {
			// Take string input from the user
			String userInput = scanner.nextLine();

			// Try to convert the string to an integer
			int number = Integer.parseInt(userInput);

			// Print the successfully converted integer
			System.out.println("Success! The converted integer is: " + number);

		} catch (NumberFormatException e) {
			// Catch the exception if the input is not a valid integer
			System.out.println("Error: Invalid input. Please enter a valid integer.");
		} finally {
			// Always close the scanner to prevent resource leaks
			scanner.close();
		}













	}

}
