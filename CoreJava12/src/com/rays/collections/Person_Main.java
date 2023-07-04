package com.rays.collections;

import java.util.ArrayList;

public class Person_Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Shubham Prajapati");
		p1.setAge(26);
		p1.setAcNum(201071);
		
		Person p2 = new Person();
		p2.setName("Sanjay Verma");
		p2.setAcNum(1000789);
		p2.setAge(27);
		
		Person p3 = new Person();
		p3.setName("Prateek Kashiv");
		p3.setAcNum(7809008);
		p3.setAge(28);
		
		System.out.println("This is the output of an Object : "+p1);
		
		System.out.println();
		
		ArrayList coll1 = new ArrayList();
		ArrayList coll2 = new ArrayList();
		ArrayList coll3 = new ArrayList();
		coll1.add(p1);
		coll2.add(p2);
		coll3.add(p3);
		coll3.addAll(coll1);
		coll3.addAll(coll2);
		
		System.out.println("This is Collection 1 : "+coll1);
		System.out.println("This is Collection 2 : "+coll2);
		System.out.println("This is Collection 3 : "+coll3);
		
		ArrayList coll4 = new ArrayList();
		coll4.add("Suraj");
		coll4.add("Chand");
		coll4.add("Sitare");
		coll4.add(475);
		coll4.add(756);
		coll4.add("Oh God");
		System.out.println();System.out.println();
		System.out.println("These are the values of Coll4 : "+coll4);
		
		coll4.add(4, p1);

		System.out.println();System.out.println();
		System.out.println("Values of Coll4 : "+coll4);
		
		coll4.add(5 , "Nirmala");

		System.out.println();System.out.println();
		System.out.println("These are the values of Coll4 : "+coll4);
		System.out.println();System.out.println();
		//System.out.println(coll4.get(4));
		coll4.remove(4);
		System.out.println(coll4);

		System.out.println();System.out.println();
		coll4.set(4, "Shubham, Jyoti and Nirmala");
		System.out.println(coll4);

		System.out.println();System.out.println();
		System.out.println(coll4.subList(4, 5));
		coll4.add(2, p2);
		System.out.println();System.out.println();
		System.out.println(coll4.indexOf(p2));
		System.out.println(coll4);
		
		System.out.println();
		System.out.println();
		System.out.println(coll4.lastIndexOf(475));
	}
}
