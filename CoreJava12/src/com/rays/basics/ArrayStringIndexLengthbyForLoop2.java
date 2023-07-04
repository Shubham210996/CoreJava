package com.rays.basics;

public class ArrayStringIndexLengthbyForLoop2
{
	public static void main(String[] args)
	{
		String [] Customers = {"Shubham","Jyoti","Megha","Govinda","Chandramani","Nirmala","Roshani","Lalla","Kiran","Sonu"};
		System.out.println("Length of the Customers array is = "+Customers.length);
		System.out.println();
		for(int i=9; i>=0; i--)
		{
			System.out.println("The name of the Customer at index "+i+ " is = "+Customers[i]);
		}
	}
	
}
