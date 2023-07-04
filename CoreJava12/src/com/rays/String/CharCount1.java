package com.rays.String;

public class CharCount1 {
	public static void main(String[] args)
	{
		String User = "Shubham Prajapati";
		char Letter = 'h';
		int count = 0;
		for(int i=0; i<User.length(); i++)
		{
			if(User.charAt(i)==Letter)
			{
				count++;
			}
		}
		System.out.println("The Letter "+Letter+" = "+count+" times.");
	}

}
