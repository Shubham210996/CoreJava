package com.rays.basics;

public class WhileSumOddtillTen
{
	public static void main(String[] args)
	{
		int i=1;
		int sum=0;
		while(i<=9)
		{
			sum=sum+i;
			i=i+2;
		}
	System.out.println("Sum of all Odd numbers from 1 to 9 is = "+sum);	
	}
}
