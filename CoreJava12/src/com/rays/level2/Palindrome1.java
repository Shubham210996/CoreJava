package com.rays.level2;

public class Palindrome1
{
	public static void main(String[] args)
	{
		int n1=15651,r,rev=0;
		for(int n2=n1;n2>0;n2=n2+0)
		{
			r=n2%10;
			rev=rev*10+r;
			n2=n2/10;
		}
		System.out.print("Number is = "+rev);
		System.out.println();
		if(rev==n1)
		{
			System.out.println("This is a Palindrome Number");
		}else
		{
			System.out.println("This is not a Palindrome Number");
		}
	}

}
