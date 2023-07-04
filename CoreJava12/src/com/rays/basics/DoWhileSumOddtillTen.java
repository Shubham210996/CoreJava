package com.rays.basics;

public class DoWhileSumOddtillTen
{
	public static void main(String[] args)
	{
		int i = 1;
		int sum = 0;
		do
		{
			sum = sum+i;
			i=i+2;
		}
		while(i<=9);
		System.out.println("Sum of all Odd numbers from 1 to 9 is = "+sum);
	}

}
