package com.rays.basics;

public class IfsTripple
{
	public static void main(String[] args) {
		int a = 30;
		int b = 25;
		int c = 28;

		if (a > b)
		{
			if (a > c)
			{
				System.out.println("a is greater");
			} 
		}
		if(b>a)
		{
			if(b>c)
			{
				System.out.println("b is greater");
			}
		}
		if(c>a)
		{
			if(c>b)
			{
				System.out.println("c is greater");
			}
		}
	
	}
}
