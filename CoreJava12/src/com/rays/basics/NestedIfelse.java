package com.rays.basics;

public class NestedIfelse 
{
	public static void main (String[] args)
	{
		int a=58;
		int b=40;
		int c=35;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater");
			}
		}
		else if (b>a)
		{
			if(b>c)
			{
				System.out.println("b is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
	}

}
