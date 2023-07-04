package com.rays.basics;

public class CheckPrime2
{
	public static void main (String[] args)
	{
		int num = 19;
		int count = 0;
		for(int i = 2; i<num ; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("The given number "+num+" is not a Prime Number");
		}else
		{
			System.out.println("The given number "+num+" is a Prime Number");
		}
	}
}
