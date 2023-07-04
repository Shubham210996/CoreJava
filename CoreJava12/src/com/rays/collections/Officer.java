package com.rays.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

import com.rays.constructors.Circle;
public class Officer
{
	public static void main(String[] args)
	{
		Collection coll1 = new ArrayList();
		coll1.add("Shubham Prajapati");
		coll1.add(240296);
		coll1.add("Red and Blue");
		
		Collection coll2 = new ArrayList();
		coll2.add("Jyoti Kanel");
		coll2.add(210904);
		coll2.add("Red");
		
		Collection coll3 = new ArrayList();
		coll3.add("Sanjay Verma");
		coll3.add(200586);
		coll3.add("Black");
		
		Collection coll4 = new ArrayList();
		coll4.add("Suraj Verma");
		coll4.add(130792);
		coll4.add("Dark Green");
		
		Custom obj = new Custom();
		obj.setName("Sandeep Maheshwari");
		obj.setColor("Fair");
		obj.setId(254);
		obj.setAge(39);
		
		ArrayList coll5 = new ArrayList();
		coll5.add(obj);
		
		Iterator it1 = coll1.iterator();
		System.out.println("Collection 1 Iterator value is = "+it1.hasNext());
		
		Iterator it2 = coll2.iterator();
		System.out.println("Collection 2 Iterator Value is = "+it2.hasNext());
		
		System.out.println();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println();
		
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		System.out.println();
		
		Iterator it3 = coll3.iterator();
		while(it3.hasNext())
		{
			Object c = it3.next();
			System.out.println(c);
		}
		System.out.println();
		
//		Iterator it4 = coll4.iterator();
//		{
//			while(it4.hasNext())
//			{
//				Custom c = (Custom )it4.next();
//				System.out.println("4th Iteration : "+c);
//			}
//		}
		
		Iterator it5 = coll5.iterator();
		while(it5.hasNext())
		{
			Custom c1 = (Custom) it5.next();
			System.out.println(c1);
		}
//		Enumeration ert = (Enumeration) coll1.iterator();
//		while(ert.hasMoreElements()) {
//			System.out.println("Enumeration Output : "+ert.nextElement());
//		}
	}
}
