package com.project;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class CollectionFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collection interface : index based , duplicates/unique , ordered/unordered

		//1) List interface : index based , duplicate allow ,ordered
		// a) ArrayList : index based , duplicate allow ,ordered

		int age ;
		int age1 = 29;
		int age2 = 30;
		String name ;

		ArrayList<Integer> ages = new ArrayList();

		// to add data in the list
		ages.add(19);
		ages.add(20);
		ages.add(21);
		ages.add(22);
		ages.add(23);
		ages.add(24);
		ages.add(25);
		ages.add(19);
		ages.add(age1);
		ages.add(age2);
		System.out.println(ages);

		//to set a value at specfic position -set (index,value)
		System.out.println(ages.set(0,15));

		//to get element of specfic position
		System.out.println(ages.get(4));

		//to check the size of list
		System.out.println(ages.size());

		//to check if list is empty or not
		System.out.println(ages.isEmpty());

		//to remove an element
		ages.remove(0);
		System.out.println(ages);

		//to check an element is there or not
		System.out.println(ages.contains(20));

		//to check index of an element
		System.out.println(ages.indexOf(19));



		ArrayList<Integer> oldArrayList = new ArrayList();
		for (int i = 40; i<= 46; i++) {
			oldArrayList.add(i);
		}

		//to add a list inside a list
		ages.addAll(oldArrayList);
		System.out.println(ages);



		// add 5 student in array list
		ArrayList<String> students = new ArrayList();
		students.add("Alice");
		students.add("Bob");
		students.add("Charlie");
		students.add("David");
		students.add("Eve");

		System.out.println(students);

		//remove the 2nd element 
		students.remove(1);
		System.out.println(students);

		for(String names : students) {
			System.out.println(names);
		}


		//add 10 number in array list
		ArrayList<Integer> number = new ArrayList();
		number.add(10);
		number.add(15);
		number.add(30);
		number.add(85);
		number.add(29);
		number.add(24);
		number.add(21);
		number.add(51);
		number.add(9);
		number.add(2);
		System.out.println(number);

		// Ask the user for a number
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to search: ");
		int userNumber = scanner.nextInt();

		// Check if the number exists using a loop
		boolean found = false;
		for (int num : number) {
			if (num == userNumber) {
				found = true;
				break;
			}
		}

		// Print result
		if (found) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

		scanner.close();



		// 2) LinkedList class : dynamic, non-contagious, efficiently insertion and deletion

		LinkedList<Character> linked = new LinkedList();




		// 3) Vector: Legacy class. dynamic array
		Vector <String> vect = new Vector();

		//vect.add("Python");
		

		//Stack : LIFO (Last in First Out)
		Stack<String> stack = new Stack();
		//method
		stack.remove(12);
		stack.pop();

		//to get top most element
		stack.get(2);
		stack.peek();


		// Queue : FIFO(First In First Out), tail and head
		PriorityQueue<String> pq = new PriorityQueue();

		//method
		pq.add("Pankaj");
		pq.remove("pankaj");


		//Deque : Doubly ended queue, flexible
		ArrayDeque<Integer> ad = new ArrayDeque();
		
		// add
		ad.add(1);
		ad.add(2);
		ad.add(3);
		ad.addFirst(9);
		ad.addLast(3);
		
		//remove
		ad.remove();
		ad.remove(2);
		ad.removeFirst();
		ad.removeLast();
		
		
		
		
		
		
		
		
		
		
		
	}


}
