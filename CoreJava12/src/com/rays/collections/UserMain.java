package com.rays.collections;

import java.util.ArrayList;

public class UserMain {
	public static void main(String[] args) {
		User men1 = new User();
		User men2 = new User();
		
		men1.setName("Shubh P");
		men1.setCon(1099);
		men1.setAge(20);
		
		men2.setName("Shubham Prajapati");
		men2.setCon(1073652);
		men2.setAge(27);
			
		ArrayList coll1 = new ArrayList();
		ArrayList coll2 = new ArrayList();
		//ArrayList coll3 = new ArrayList();
		
		coll1.add(men1);
		coll2.add(men2);
//		coll3.add(coll1);
//		coll3.add(coll2);
//		System.out.println("Collection 3 after adding collection 1 and 2 in it : "+coll3);
//		System.out.println();
		
		//coll2.clear();
		//System.out.println("Collection 3 after clear collection 2 from it : "+coll3);
		System.out.println();
		
		//System.out.println("Collection 1 contains the object men1 : "+coll1.contains(men1));
		System.out.println();
		
	//	System.out.println("Collection 1 contains all Collection 2 : "+coll1.containsAll(coll2));
		System.out.println();
		
		//System.out.println("Collection 1 contains all Collection 3 : "+coll1.containsAll(coll3));
		System.out.println();
		
		//System.out.println("Collection 2 is Empty : "+coll2.isEmpty());
		//System.out.println("Collection 3 is Empty : "+coll3.isEmpty());
		System.out.println();
		
		//System.out.println("Collection 1 before removing it's object men 1 : "+coll1);
		//coll1.remove(men1);
		//System.out.println("Collection 1 after removing object men 1 : "+coll1);
		
		System.out.println();
		//System.out.println("Collection 3 output at this moment : "+coll3);
		
		System.out.println();
		//coll3.removeAll(coll1);
	    //coll3.removeAll(coll2);
		//System.out.println("Collection 3 after removing coll1 and coll2 : "+coll3);
		System.out.println();
		
		//coll1.add(men1);
		//coll2.add(men2);
		//System.out.println(coll3);
		//System.out.println();
		//System.out.println(coll1);
		//System.out.println();
		System.out.println("Coll1 before retaining : "+coll1);
		System.out.println("Coll2 before retaining : "+coll2);
		coll2.retainAll(coll1);
		System.out.println("Coll1 after rataining : "+coll1);
		System.out.println("Coll2 after retaining : "+coll2);
		//System.out.println();
		//System.out.println(coll2);
		System.out.println(coll1);
		
		//coll2.retainAll(coll1);
		//System.out.println(coll2);
		//System.out.println(coll1);
		//System.out.println(coll3);
		
		System.out.println();
		//coll2.add(men2);
		//coll1.addAll(coll2);
		//coll1.add(men1);
		//coll3.addAll(coll1);
		//System.out.println(coll1);
		//System.out.println(coll1.size());
		//System.out.println(coll3);
		//System.out.println(coll3.size());
	}
}
