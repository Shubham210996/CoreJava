package com.rays.ex1;

public class ExL_Palindrome {
	public static void main(String[] args)
	{
		int num = 121;
		int rem=0;
		int rev=0;
		for(int n=num; n>0; n=n+0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(rev==num)
		{
			System.out.println("This number "+num+" is a Palindrome Number");
		}
		else
		{
			System.out.println("This number "+num+" is not a Palindrome Number");
		}
	}

}
