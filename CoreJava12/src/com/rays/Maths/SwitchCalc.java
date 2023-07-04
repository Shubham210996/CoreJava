package com.rays.Maths;

public class SwitchCalc {
	public static void main (String[] args)
	{
		int i = 0, a=25, b=10, c, d;
		switch(i)
		{
		case 1:
		{
			c=a+b;
			System.out.println("Sum of two numbers is = "+c);
			break;
		}
		case 2:
		{
			d=a-b;
			System.out.println("Subtraction of two numbers is = "+d);
			break;
		}
		case 3:
		{
			c=a*b;
			System.out.println("Multiplication of two numbers is = "+c);
			break;
		}
		case 4:
		{
			d=a/b;
			System.out.println("Division of two numbers is = "+d);
			break;
		}
		default :
		{
			System.out.println("There is no any operation has performed yet.");
		}
		}
	}

}
