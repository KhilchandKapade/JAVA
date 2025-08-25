package com.project;

public class Functions {
	
	public static void MultiplicationTable() {
		int num = 5;
		for(int i=1; i<=10; i++) {
			System.out.println(num+ " x "+ i +" = "+num*i);
		}
	}
	
	public static void NaturalNumber() {
		for(int num1=1 ; num1<=100; num1++) {
			System.out.println("Natural number is :"+num1);
		}
	}
	
	public static void SquareNumber() {
		int sq = 0;
		for(int n=20; n>=2; n--) {
			if(n%2 == 0) {
				sq = n * n;
				System.out.println(sq);
			}
		}
	}
	
	public static void SumEvenOdd() {
		int  SumE = 0;
		int SumO = 0;
		for (int n1=1; n1<=100; n1++) {
			if(n1%2 == 0) {
				SumE += n1;
				System.out.println("Sum  of Even Number :"+SumE);
			}else {
				SumO += n1;
				System.out.println("Sum of Odd Number :"+SumO);
			}
		}
	}

	
	//Parameterize function --------------------------------
	public static void multiplication(int num) {
		for (int i=1; i<=10; i++) {
			System.out.println(num +" x "+ i +" = " +num*1);
		}
	}
	
	public static void Hello(String name) {
		System.out.println("hello "+name);
	}
	
	
	// return use------------------------------------------
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static String hello(String name) {
		return "Hello"+name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationTable();
		NaturalNumber();
		SquareNumber();
		SumEvenOdd();
		multiplication(6);
		Hello("Khilchand");
		System.out.println(add(2,7));
		System.out.println(hello(" java"));
	}

}
