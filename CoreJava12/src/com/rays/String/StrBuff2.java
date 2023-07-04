package com.rays.String;

public class StrBuff2 {
	public static void main (String[] args)
	{
		StringBuffer master = new StringBuffer ("Roshani");
		master.append(" Shubham Prajapati");
		System.out.println(master);
		System.out.println();
		System.out.println("Length of the String Buffer is = "+master.length());
		System.out.println();
		System.out.println("Capacity of the String Buffer is = "+master.capacity());
		System.out.println();
		System.out.println("Character at index 2 is = "+master.charAt(2));
		System.out.println();
		System.out.println("Index of String Roshani is = "+master.indexOf("Roshani"));
		System.out.println();
		System.out.println("Replacement is = "+master.replace(0,25,"Roshani is my Wife"));
		System.out.println();
		System.out.println("Reverse is = "+master.reverse());
		
	}

}
