package com.rays.ex1;

public class ExN_AvrageofEvenOdd {
	public static void main(String[] args)
	{
	float Avr = 0; float sum = 0;
	int n = 10; int num=n*2;
		for(int i=1; i<=num; i++)
		{
			sum = sum+i;
			System.out.println("Sum is = "+sum);
			Avr = sum/num;
		}
	System.out.println("Average Sum of "+n+" Even and "+n+" Odd Numbers is = "+Avr);
	}
}
