package com.rays.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(0, "One");
		map.put(1, "Three");
		map.put(2, "Five");
		map.put(3, "Two");
		map.put(4, "Four");
		
		System.out.println("These are the Map Values : "+map);
		
		int s = map.size();
		System.out.println("Size of the Map : "+s);
		System.out.println();
		
		String s1 = (String) map.get(1);
		System.out.println("Value of s1 with inverted comma : "+s1);
		System.out.println();
		
		boolean flag = map.containsKey(1);
		flag = map.containsValue("Three");
		System.out.println("Output of Boolean Flag : "+flag);
		System.out.println();
		
		Set keys = map.keySet();
		for (Object o : keys)
		{
			System.out.println(o);
		}
		System.out.println();
		
		Collection coll = map.values();
		System.out.println(coll);
		System.out.println();
		
		Set collValues = map.entrySet();
		System.out.println();
		System.out.println("These are the EntreySet Values : "+collValues);
		
		if(map.containsKey(2))
		{
			System.out.println();
			System.out.println("Program has executed the first IF statement.");
			
			if(map.containsValue("One"))
			{
				System.out.println();
				System.out.println("Great Job...!!!");
			}
		}
		System.out.println();
		System.out.println(map.keySet());
		System.out.println();
		
		Map m1 = new TreeMap();
		m1.put(0, "First");
		m1.put(1, "One");
		map.putAll(m1);
		System.out.println("Put all m into Map : "+map);
		System.out.println();
		
		coll = map.values();
		System.out.println(coll);
	}
}
