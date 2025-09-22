package com.project;
import java.util.ArrayList;

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

	}

}
