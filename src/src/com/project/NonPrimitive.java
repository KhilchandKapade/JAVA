package com.project;

public class NonPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String emoji ="😎🤷‍♂️🤷‍♂️😁";
		String add ="123- building, complex , road dfghjkey";
		System.out.println(add);
		add = "Hello, I am learning java ";
		System.out.println(add);
		
		
		//operations with string (+ - * /)
		add += "Shubhangi"; //concatenation
		System.out.println(add);
		
	//	add -= "Shubhangi";
	//	System.out.println(add);
		
		
		// length of str count 
		add= "Hello , world! , Hello";
		System.out.println(add.length());
		
		System.out.println(add.indexOf('o'));
		System.out.println(add.indexOf("Hello"));
		System.out.println(add.lastIndexOf('o'));
		System.out.println(add.lastIndexOf("Hello"));
		
		
		// charAt - to know the char at specified index
		System.out.println(add.charAt(21));
		
		//startswith and endswith : to check 
		System.out.println(add.startsWith("Hello"));
		System.out.println(add.endsWith("Hello"));
		
		//trim : to remove extra spaces
		add ="           hello, world      ";
		System.out.println(add);
		System.out.println(add.trim());
		
		//substring  - to divide a string into parts
		add = "hello world , Shunhangi";
		String sub = add.substring(4);
		System.out.println(sub);
		
		
		// equality - to check  of 2 string
		add = "Shubhangi";
		sub = "Divya";
		System.out.println(add.equals(sub));
		
		add = "dlvYa";
		sub = "Divya";
		System.out.println(add.equalsIgnoreCase(sub));
		
		
		add = "xyz";
		sub = "avc";
		System.out.println(add.compareTo(sub));
		
		
		// to check content of str
		add ="";
		System.out.println(add.isBlank());
		
		add ="";
		System.out.println(add.isEmpty());
		
		// replace - to replace a char/word
		add ="Hello I am Khilchand and I am learning Java";
		System.out.println(add.replace('a','A'));
		System.out.println(add.replace("I am","I'm"));
		//System.out.println(add.replaceAll('e', 'x'));
		
		
		
		//split
		add = "Apple,Cherry,Grapes,Melons";
		
		
		
		
		
		
		
		
	}

}
