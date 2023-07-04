package com.rays.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("Bura mat Dekho");
		c.add("Bura mat Suno");
		
		System.out.println(c);
		
		System.out.println();
		
		for(Object obj : c)
		{
			System.out.println(obj);
		}
	}
}
