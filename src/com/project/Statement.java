package com.project;
import java.util.Scanner;
public class Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//       1) declarative statement
		int age;
		String name;

		//       2) Assignment statement		
		age = 19;
		name = "Khilchand";

		//		3) expression statement
		int add = 3 + 19;

		//      4) Control flow statement

	        	//a) selection Statement

		// if () ---------------------------------------------------
		age  = 17;
		if(age >= 18) {
			System.out.println("Eligable for voting");
		} else {
			System.out.println("Cannot vote");
		}


		char Status = 'P';
		if(Status == 'P') {
			System.out.println("Present");
		}else {
			System.out.println("Absent");
		}


		int n = -12;
		if(n == -12) {
			System.out.println("Negative number");
		}else {
			System.out.println("Positive number");
		}


		int ag = 18;
		String city = "India";
		if(ag >= 18 && city == "India") {
			System.out.println("Valid for admission");
		}else {
			System.out.println("Invalid for admission");
		}

		String se1 ="domain";
		String se2 ="soft";
		if(se1 =="domain" || se2 =="softskill") {
			System.out.println("Come to office");
		}else {
			System.out.println("Not come to Office");
		}
		
		
		int cost = 50000;
		String ip ="iphone";
		if( cost <= 50000 && ip.equals("iphone")) {
			System.out.println("Buy Iphone");
		}else {
			System.out.println("mobile is not available");
		}
		
	

		boolean sess1 = true;
		boolean sess2 = false;
		if(sess1 || sess2) {
			System.out.println("Come to admission");
		}else {
			System.out.println("Not come to admission");
		}



		// else-if condition

		//  if(condition1) {
		//
		//  }else if (condition2) {
		//
		//  }else if (condition3) {
		//
		//  }else {
		//
		//  }

		int a = 10;
		int b = 20;
		int c;
		char op = ';';
		if(op == '+') {
			c = a+b;
			System.out.println("Addition of a and b is:"+ c);
		} else if (op == '-') {
			c = a - b;
			System.out.println("Subtraction of a and b is: " + c);
		} else if (op == '*') {
			c = a * b;
			System.out.println("Multiplication of a and b is: " + c);
		} else if (op == '/') {
			c = a / b;
			System.out.println("Division of a and b is: " + c);
		} else {
			System.out.println("USe any operator given here [ +, -, *, / ]");
		}
		
		
		String cast = "obc";
		String religion = "hindu";
		String classs = "high";
		
		if(cast == "obc" && religion == "hindu") {
			System.out.println("Marriage Accepts");
		} else if (cast == "obc" && classs =="high") {
			System.out.println("Marriage is Accepts");
		} else if (religion == "hindu" && classs =="high") {
			System.out.println("Not Accepts");
		}
		
		
		
		
		
		// switch case : multiple condition ------------------------------------------
		
		int dayNumber = 8;
		switch(dayNumber) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Choose number between 1 to 7");
		}
		
		
		int MonthNumber = 18;
		switch(MonthNumber) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sept");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
			
		default:
			System.out.println("Choose number between 1 to 12");
		}
		
		
		// vowels : a,e,i,o,u
		char vowel='w';
		switch(vowel) {
		case 'a','e','i','o','u':
			System.out.println(" a, e, i, o, u are vowels");
		 break;
		 default:
			 System.out.println("Consonants");
		}
		
		
	//  ternary operator ----------------------------------------
		int voting = 19;
		String output = voting > 18? "You can vote" : "You cannot ";
		System.out.println(output);
		
		
		int mobile = 60000;
		String m = "mobile";
		String out = mobile < 50000 && m =="mobile" ? "Buy mobile" : "Don't buy mobile";
		System.out.println(out);
		
		String s1 = "soft";
		String s2 ="domain";
		String o = s1 =="soft" || s2=="NA" ?  "come to class" : "don't come to class";
		System.out.println(o);		
		

		char S = 'P';
		char opp = S == 'P' ? 'Y' : 'N';
		System.out.println(opp);
		
		int num = 7;
		String number = num%2 == 0 ? "Even" : "Odd";
		System.out.println(number);
		
		
		// for loop ---------------------------------------------------------
		
		for(int i=1; i<=10; i++) {
			System.out.println(29 + "x"+ i +"=" +29*i);
		}
		
		
		for(int i=1; i<=50; i++) {         //     1 to 50 number
			System.out.print(i);
			System.out.print(" ");
		}
		
		System.out.println(" ");           // A - Z Alphabets
		for(char al= 'A'; al<='Z'; al++) {
			System.out.print(al);
		}
		
		System.out.println(" ");
		for (char ch = 'a'; ch<='z'; ch++) {
			System.out.print(ch);
		}
		
		System.out.println(" ");  
		int even = 0;                         // 1 to 100 even number
		for(int i=1; i<=100; i++) {			
			if(i%2 == 0)
			{		
				System.out.print(i+" ");	
				even = even + i;
				System.out.println("Sum of even "+even);
				
			}			 
		}
		
		System.out.println(" ");   
		int odd = 0;                            // 1 to 100 odd number
		for(int i=1; i<=100; i++) {		
			if(i%2 != 0)
			{		
				System.out.print(i+" ");	
				odd = odd + i;
				System.out.println("sum of Odd "+odd);
			}			 
		}
		
		
		for(int nn=100; nn>=0; nn--) {    // natural number 100 to 0
			System.out.print(" "+nn);
		}
		
		System.out.println(" ");             // square of number 20 to 0
		for(int sq = 20; sq>=0; sq--) {
			if(sq%2 == 0) {
				int square = sq * sq;
    			System.out.println(" ");
				System.out.print("squaer of even "+square);	
			}
		}
		
		
        // while loop ----------------------------------------------------------
		int wa = 1;
		while(wa<=10) {
			System.out.println("Hello");
			wa++;
		}
		
		
		int wsum = 1;
		int SUMM = 0;
		while(wsum <=100 ) {
			SUMM = SUMM + wsum;
			System.out.println("Sum of all natural numbers from 1 to 100 is: " + SUMM);
			wsum++;			
		}
		
		
		int wsq = 20;
		while(wsq >=2) {
			if(wsq%2 == 0) {
				int SQR = wsq * wsq;
				System.out.println("SQuare of even number is "+SQR);
			}			
			wsq--;
		}
		
		
		
		char wl = 'A';
		while(wl <= 'Z') {
			System.out.println(wl);
			wl++;
		}
		
		int ascii = 65;
		while(ascii <=90) {
			System.out.println("Ascii value is "+(char)ascii);
			ascii++;
		}

		
		int sin = 1;
		while(sin <= 50) {
			System.out.print(sin);
			System.out.print(" ");
			sin++;
		}
		
		int evod = 1;
		int eSum = 0;
		while(evod <=100) {
			if(evod%2 == 0) {
				eSum += evod;
				System.out.println("Even No "+evod);
				System.out.println("even number Sum: "+eSum);
			}else {
				eSum += evod;
				System.out.println("Odd No "+evod);
				System.out.println("odd number  Sum: "+eSum);
			}
			evod++;
		}
		
		
		
		// do-while loop -----------------------------------------------
		// execute atleast once
		
		int db = 3;
		do {
			System.out.println("Java");
			db--;
		}while(db == 0);  // 3 <= 0  false
			
		do {
			System.out.println("Python");
			db--;
		}while(db >= 0);   // true
		
		
		
		int dna = 1;
		int dSum = 0;
		do {
			dSum += dna;
			System.out.println("Sum of Natural number "+dSum);
			dna++;
		}while(dna <=100);
		
		
		int dsq = 20;
		int devn = 0;
		do {
			if(dsq%2 == 0) {
				devn = dsq * dsq;
				System.out.println("Square of even number "+devn);
			}
			dsq --;
		}while(dsq >= 2);
		
		
		
		int dascii = 65;
		int dsci = 97;
		do {
			
			System.out.print("Alphabets is "+(char)+dascii);
			System.out.println(",  Alphabets is "+(char)+dsci);
			dascii ++;
			dsci++;
		}while(dascii <= 90 && dsci <=122);
		
		
		int pn = 1;
		do {
			System.out.print(" " +pn);
			pn++;
		}while(pn<=50);
		
		
		
		int All = 1;
		int SumEvn = 0;
		int SumOdd = 0;
		do {
			if(All%2== 0) {
				SumEvn  += All;
				System.out.println("Even Number "+All +" Sum is :"+SumEvn);				
			}else {
				SumOdd  += All;
				System.out.println("Odd Number "+All +" Sum is :"+SumOdd);
			}
			All++;
		}while(All <=100);
		
		
		
		
		
		 Scanner sc = new Scanner(System.in);
	        int choice;
	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Add two numbers");
	            System.out.println("2. Subtract two numbers");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch(choice) {
	                case 1:
	                    System.out.print("Enter first number: ");
	                    int az = sc.nextInt();
	                    System.out.print("Enter second number: ");
	                    int bz = sc.nextInt();
	                    System.out.println("Sum = " + (az + bz));
	                    break;

	                case 2:
	                    System.out.print("Enter first number: ");
	                    az = sc.nextInt();
	                    System.out.print("Enter second number: ");
	                    bz = sc.nextInt();
	                    System.out.println("Difference = " + (az - bz));
	                    break;

	                case 3:
	                    System.out.println("Exiting program.");
	                    break;

	                default:
	                    System.out.println("Invalid choice, try again.");
	            }
	        } while(choice!= 3);
	        sc.close();
		
		
		
		
		
		
		
	}

}
