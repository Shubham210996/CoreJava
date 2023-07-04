package com.rays.collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TigerSet2 {
	public static void main(String[] args)
	{
		String str;
		int i;
		TreeSet s = new TreeSet();
//		s.add(9);
//		s.add(4);
//		s.add(5);
//		s.add(8);
//		s.add(3);
//		s.add(7);
//		s.add(1);
//		s.add(2);
//		s.add(10);
//		s.add(6);
//		
//		System.out.println("SortedSet s = "+s);
		
		s.add("One");
		s.add("Two");
		s.add("Three");
		s.add("Four");
		s.add("Five");
		s.add("Six");
		s.add("Seven");
		s.add("Eight");
		s.add("Nine");
		s.add("Ten");
		
		System.out.println("ShortedSet s = "+s);
		
		SortedSet s1 = new TreeSet();
		s1.add(9);
		s1.add(4);
		s1.add(5);
		s1.add(8);
		s1.add(3);
		s1.add(7);
		s1.add(1);
		s1.add(2);
		s1.add(10);
		s1.add(6);
		
		System.out.println("SortedSet s1 = "+s1);
		System.out.println();
		
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			str = (String) it.next();
			System.out.println(str);
		}
		System.out.println();
		
		Iterator it1 = s1.iterator();
		while(it1.hasNext())
		{
			i = (int) it1.next();
			System.out.println(i);
		}
	}
}
