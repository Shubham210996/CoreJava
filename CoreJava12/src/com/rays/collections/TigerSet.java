package com.rays.collections;

import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TigerSet {
	public static void main(String[] args)
	{
		SortedSet ss = new TreeSet();
		ss.add("One");
		ss.add("Two");
		ss.add("Three");
		ss.add("Four");
		ss.add("Five");
		ss.add("Six");
		ss.add("Seven");
		ss.add("Eight");
		ss.add("Nine");
		ss.add("Ten");
		ss.add("One"); //Set Interface doesn't include duplicate data.
		
		
		System.out.println(ss);System.out.println();
		System.out.println("First Element : "+ss.first());
		System.out.println("Last Element : "+ss.last());
		//System.out.println("HeadSet Element : "+ss.headSet("Fourth"));
		System.out.println("HeadSet Element 1 : "+ss.headSet("One"));
		System.out.println("HeadSet Element 2 : "+ss.headSet("Two"));
		System.out.println("HeadSet Element 3 : "+ss.headSet("Three"));
		System.out.println("HeadSet Element 4 : "+ss.headSet("Four"));
		System.out.println("HeadSet Element 5 : "+ss.headSet("Five"));
		System.out.println("HeadSet Element 6 : "+ss.headSet("Six"));
		System.out.println("HeadSet Element 7 : "+ss.headSet("a"));
		System.out.println(ss);System.out.println();
		System.out.println();
		
		System.out.println(ss);
		System.out.println("tailSet Element 1 : "+ss.tailSet("One"));
		System.out.println("tailSet Element 2 : "+ss.tailSet("Two"));
		System.out.println("tailSet Element 3 : "+ss.tailSet("Three"));
		System.out.println("tailSet Element 4 : "+ss.tailSet("Four"));
		System.out.println("tailSet Element 5 : "+ss.tailSet("Five"));
		System.out.println("tailSet Element 6 : "+ss.tailSet("Six"));
		System.out.println("tailSet Element 7 : "+ss.tailSet("a"));
		
		System.out.println();
		System.out.println("subSet Element 1 : "+ss.subSet("One", "Two"));
		System.out.println("subSet Element 1 : "+ss.subSet("Three", "Two"));
		System.out.println("subSet Element 1 : "+ss.subSet("Four", "Three"));
	
		
		
		
	}
}
