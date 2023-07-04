package com.rays.String;

public class CharCount2 {
	public static void main (String[] args)
	{
		String  str = "roshani shubham prajapati";
		int count =0;
		for (char letter = 'a'; letter<='z'; letter++)
		{
			for(int i = 0; i<str.length(); i++)
			{
				if(letter==str.charAt(i))
				{
					count++;
				}
			}
			if(count>0)
			{
			System.out.println(letter+" is = "+count+" times.");
			count =0;
			}
		}
	}

}
