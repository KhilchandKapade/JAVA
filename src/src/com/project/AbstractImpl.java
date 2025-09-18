package com.project;

public class AbstractImpl extends AbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractImpl ab = new AbstractImpl();
		ab.hello();
		ab.add(12, 12);
		System.out.println(ab.count);

	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Method of Abstract class");
		
	}

	
}
