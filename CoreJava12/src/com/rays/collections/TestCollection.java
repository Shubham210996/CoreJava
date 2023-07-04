package com.rays.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("Bura mat Dekho");
		c.add("Bura mat Suno");
		c.add("Bura mat Kaho");
		
		//System.out.println("Length of Collection : "+c.size());
		
		for(Object ele : c) {
		//	System.out.println(ele);
		}
		
		Object [] objAr = c.toArray();
		
		for(Object ele : objAr) {
			String s = (String) ele;
			System.out.println(s);
		}
	}
}
