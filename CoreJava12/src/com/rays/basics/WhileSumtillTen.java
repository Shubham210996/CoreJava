package com.rays.basics;

public class WhileSumtillTen
{
	public static void main(String[] args)
	{
		int i = 1;
		int sum = 0;
		while(i<=10)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of all numbers from 1 to 10 is = "+sum);
	}
}
