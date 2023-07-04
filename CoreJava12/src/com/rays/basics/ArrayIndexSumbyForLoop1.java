package com.rays.basics;

public class ArrayIndexSumbyForLoop1
{
	public static void main (String[] args)
	{
		int sum = 0;
		int [] ScoreSum = {12,45,78,98,65,32,13,46,79,97,64,31,15,35,95,75,51,53,59,57,84,86,24,26,48,68};
		System.out.println("The Length of the ScoreSum Array is = "+ScoreSum.length);
		for(int i = 0; i<ScoreSum.length; i++)
		{
			sum= sum+ScoreSum[i];
		}
		System.out.println("Sum of all the Values of ScoreSum Array is = "+sum);
	}

}
