package com.rays.ex1;

public class ExF_Fibonacci {
	public static void main(String[] args)
	{
	int a = 0, b= 1, c=0;
	int n = 150;
		while(c<=n)
		{
			System.out.print("  "+c);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
