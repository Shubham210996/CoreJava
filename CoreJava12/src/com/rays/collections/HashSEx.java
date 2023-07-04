package com.rays.collections;

import java.util.HashSet;

public class HashSEx {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		hs.add("Six");
		hs.add("Seven");
		hs.add("Eight");
		hs.add("Nine");
		hs.add("Ten");
		
		hs.add(10);
		hs.add(2);
		hs.add(8);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(3);
		hs.add(7);
		hs.add(1);
		hs.add(9);
		
		
		System.out.println("HashSet = "+hs);
		
	}
}
