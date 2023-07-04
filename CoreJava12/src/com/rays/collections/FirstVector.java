package com.rays.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class FirstVector {
	public static void main(String[] args) {
		Lion l = new Lion();
		Employee e = new Employee();
		l.setAcNum(9993682);
		l.setName("Nanuram Prajapati");
		l.setMotherName("Nani Bai Prajapati");
		l.setFatherName("Sukhlal Prajapati");
		e.setName("Shubham Prajapati");
		e.setId("9131073652");
		e.setAge(27);
		e.setAcType("Personal Account");
		
		Vector coll1 = new Vector();
		coll1.add(l);
		coll1.add(e);
		System.out.println();
		
		Iterator it = coll1.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			System.out.println(o);
		}
		System.out.println();
		
		Enumeration ert = coll1.elements();
		while(ert.hasMoreElements())
		{
			Object obj = ert.nextElement();
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println(coll1);
	}
}
