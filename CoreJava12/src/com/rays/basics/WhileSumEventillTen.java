package com.rays.basics;

public class WhileSumEventillTen
{
	public static void main(String[] args)
	{
		int i = 2;
		int sum = 0;
		while(i<=10)
		{
			sum = sum+i;
			i=i+2;
		}
		System.out.println("Sum of all Even numbers from 2 to 10 is = "+sum);
	}

}
