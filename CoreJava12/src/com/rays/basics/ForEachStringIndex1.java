package com.rays.basics;

public class ForEachStringIndex1
{
	public static void main (String[] args)
	{
		String [] Candidates = {"Nirmala","Kiran","Roshani","Jyoti","Shubham","Lalla","Chandramani","Sonu"};
		System.out.println("Length of the Candidates array is = "+Candidates.length);
		System.out.println();
		
		for(String s : Candidates)
		{
			System.out.println(s);
		}
	}
}
