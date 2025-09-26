package com.project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {
	
	public static void main(String args[]) {
	HashMap<String, String> hash = new HashMap();
	
	//add
	hash.put("Name","Khilchand");
	hash.put("Age","20");
	hash.put("Gender","M");
	hash.put("City","Mumbai");
	
	System.out.println(hash);
	
	// value key
	
	System.out.println(hash.keySet());
	System.out.println(hash.values());
	
	
	
	// LinkedHashMap - child class of HashMap, ordered
	LinkedHashMap<String, Object> linked = new LinkedHashMap();
	
	//add
	linked.put("Name", "Sanjana");
	linked.put("Age", 20);
	linked.put("Eligibility", true);
	
	System.out.println(linked);
	
	
	//TreeMap : implementation of Map, donn't allow null keys , maintains ascending order
	
	Map<String, Object> tree = new TreeMap();
	
	tree.put("BAse Center", "Thane");
//	tree.put(null, 201);
	
	System.out.println(tree);
	
	
	
	// Set : child of collection interface, index based approach, data should be unique
	
	Set <Integer> set = new HashSet();
	set.add(1);
	
	for(int i = 2; i<=10; i++) {
		set.add(i);
	}
	
	System.out.println(set);
	set.add(1);
	System.out.println(set);
	
	
	
	
	
	
	
	
	}

}
