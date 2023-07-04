package com.rays.basics;

public class WhileSumEventillHundred
{
	public static void main(String[] args)
	{
		int i=2;
		int sum = 0;
		while(i<=100)
		{
			sum=sum+i;
			i=i+2;
		}
		System.out.println("Sum of all Even numbers from 2 to 100 is = "+sum);
	}
}
