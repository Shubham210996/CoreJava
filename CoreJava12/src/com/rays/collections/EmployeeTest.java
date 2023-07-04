package com.rays.collections;

import java.util.ArrayList;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("EC040","Saving Account", "Shubham Prajapati", 27);
		Employee e2 = new Employee("EC041","Personal Account", "Jyoti Kanel", 18);
		Employee e3 = new Employee("EC042","Saving Account", "Nirmala Bundela", 26);
		Employee e4 = new Employee("EC043","Saving Account", "Chandramani Kushwah", 26);
		Employee e5 = new Employee("EC044","Personal Account", "Megha Prajapati", 25);
		
		ArrayList list = new ArrayList();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		
		System.out.println();
		
		System.out.println(list);
		System.out.println();
		
		for(Object obj : list)
		{
			System.out.println(obj);
		}
	}
}
