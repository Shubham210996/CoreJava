package com.rays.basics;

public class DoWhileSumtillTen
{
	public static void main(String[] args)
	{
		int i=1;
		int sum=0;
		{do
		{
			sum=sum+i;
			i++;
		}
		while(i<=10);
		}
		System.out.println("Sum of all numbers from 1 to 10 is = "+sum);
	}
}
