package com.rays.basics;

public class CheckPrime1
{
	public static void main (String[] args)
	{
		int a = 1;
		int rem;
		int count=0;
		for(int i = 2; i<a ; i++)
		{
			rem=a%i;
			if(rem==0)
			{
			count++;
			}
		}if(count>0)
		{
			System.out.println("The given number "+a+" is not a Prime number");
		}else
		{
			System.out.println("The given number "+a+" is a Prime number");
		}
	}
}
