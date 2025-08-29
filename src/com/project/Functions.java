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
	
	
	
	// varargs
	//rules: 1) only 1 varargs is allowed per method (int ...num, int... days) X
	// 2) varargs parameter always comes last (int... num ,String name) X
	// 3) might cause ambiguty issue
	public static int add(int... num ) {
		int total = 0;
		for(int i:num) {
			total += i;
		}
		return total;
	}
	
	
	public static String Concat(String... words) {
		String T = " ";
		for (String i:words) {
			T +=i +" ";
		}
		return T;
	}
	
	
	public static int  Max(int... numbers) {
		int large = numbers[0];
		for (int i: numbers) {
			if(i > large) {
				large = i;
			}
		} return large;
	}
	
	
	public static int Find(int... n) {
		for(int i:n) {
			if(i%2 == 0) {
				return i ;
			}
		}
		for (int i:n) {
			if(i%2 != 0) {
				return i;
			}
		}
		return n[0];
	}
	
	
    int age = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Functions func = new Functions();
		System.out.println(func.age);
		
		MultiplicationTable();
		NaturalNumber();
		SquareNumber();
		SumEvenOdd();
		multiplication(6);
		Hello("Khilchand");
		System.out.println(add(2,7));
		System.out.println(hello(" java"));
		System.out.println(add(100,500,400,200));
		System.out.println(Concat("abc","xyz","pqr"));
		System.out.println(Max(5,7,3,4,2,2));
		System.out.println(Find(10,6,3,5,4,7));
	}

}
