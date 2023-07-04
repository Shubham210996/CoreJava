package com.rays.Arrays;

public class ArrayIndexbyForrLoop1 {
	public static void main (String[] args)
	{
		int [ ] Customer = new int [5];
		for(int i = 0; i<Customer.length; i++)
		{
			Customer[i] = 3*i+2;
		}
		for(int i = 0; i<Customer.length; i++)
		{
			System.out.println("Value at index "+i+" is = "+Customer[i]);
		}
	}

}
