package com.rays.ex1;

public class ExD_Factorial {
	public static void main (String[] args)
	{
		int a = 6;
		int b = a;
		int fact = 0;
		for(int i = a-1; i>0; i--)
		{
			fact = a*i;
			a=fact;
		}
		System.out.println("Factorial of given number "+b+" is = "+fact);
	}

}
