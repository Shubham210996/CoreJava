package com.rays.ex1;

public class ExE_Reverse {
	public static void main(String[] args)
	{
		int num = 3678;
		int n = num;
		int rem = 0, rev = 0;
		while(n>0)
		{
			rem = n%10;
			rev = (rev*10)+rem;
			n=n/10;
		}
		System.out.println("The Reverese of the "+num+" is = "+rev);
	}

}
