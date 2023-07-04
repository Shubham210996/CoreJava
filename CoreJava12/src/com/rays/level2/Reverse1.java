package com.rays.level2;

public class Reverse1 {
	public static void main (String[] args)
	{
		int arm = 1432;
		int n = arm;
		int r;
		int sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			System.out.print(r);
		}
	}
}
