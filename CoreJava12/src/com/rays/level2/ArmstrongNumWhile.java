package com.rays.level2;

public class ArmstrongNumWhile {
	public static void main (String[] args)
	{
		 int num = 124;
		 int n = num;
		 int sum = 0;
		 int rem;
		 while(n>0)
		 {
			 rem=n%10;
			 sum=sum+(rem*rem*rem);
			 n=n/10;
		 }
		 if(sum==num)
		 {
			 System.out.println("This number "+num+" is a Armstrong Number");
		 }else
		 {
			 System.out.println("This number "+num+" is not a Armstrong Number");
		 }
	}

}
