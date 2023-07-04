package com.rays.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("Bura mat Dekho");
		c.add("Bura mat Suno");
		c.add("Bura mat Kaho");
		System.out.println("1. Length of Collection : " + c.size());
		System.out.println();
		
		for(Object ele : c)
		{
			System.out.println(ele);
		}
		Object[] eleArray = c.toArray();
		System.out.println();
		
		for(Object ele : eleArray)
		{
			String s = (String) ele;
			System.out.println(s);
		}
		System.out.println();
		
		
		
	}
}
