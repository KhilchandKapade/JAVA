package com.project;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println(12*12);
		System.out.print("Java");
		System.out.print("Program");
		
		
		
		//type casting implicit widening
		byte countOfStd = 127;
		int countOfStds = countOfStd;
		System.out.println(countOfStds);
		
		
		//Narrowing / explicit : data loss
		int count = 2425368;
		byte countlnByte = (byte) count;
		System.out.println("count in int:"+count);
		System.out.println("After converting into byte:"+countlnByte);
		
		
		byte countEx = 127;
		char countExt = (char) countEx;
		System.out.println(countExt);
		
		int countInt = 1254374576;
		float countF = (float) countInt;
		System.out.println(countF);
		
		
		
		// Arithmetic operators  = - * / % ++ --
		
		int c = (10 + 7);
		int a = 19;
		int b = 30;
		c = a + b;
		System.out.println("Addition:"+c);
		System.out.println(10%2);
		
		a++;
		b--;
		System.out.println(a+"  "+b);
		
		
		// Relational operator 
		
		a = 200;
		b = -400;
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a != b);
		System.out.println(a <= b);
		System.out.println(a >= b);

		
		// Assignment operators 
		
		a += 5;
		b -= 5;
		System.out.println(a);
		System.out.println(b);
		
		
		// Logical Operator
		
		System.out.println(true && true);
		System.out.println(true | false);
		System.out.println(!true);
		
		
		

		
	}

}
