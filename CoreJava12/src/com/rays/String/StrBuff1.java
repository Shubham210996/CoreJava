package com.rays.String;

public class StrBuff1 {
	public static void main (String[] args)
	
	{
		String Str1 = "Shubham Prajapati";
		String Str2 = "Jyoti Kanel";
		
		StringBuffer Strbuff = new StringBuffer("Hello ");
		Strbuff.append("Java");
		System.out.println(Strbuff);
		System.out.println();
		System.out.println(Str1+" "+Str2);
		Strbuff.append(" How are you");
		System.out.println(Strbuff);
	}

}
