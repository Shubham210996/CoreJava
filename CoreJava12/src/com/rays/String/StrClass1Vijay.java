package com.rays.String;

public class StrClass1Vijay {
	public static void main (String[] args)
	{
		String sName = "Vijay Dinanath Chouhan";
		
		System.out.println("7th Character of String is = "+sName.charAt(6));
		System.out.println();
		System.out.println("Dina index of String is = "+sName.indexOf("Dina"));
		System.out.println("nana index of String is = "+sName.indexOf("nana"));
		System.out.println();
		System.out.println("First i position is = "+sName.indexOf("i"));
		System.out.println("First a position is = "+sName.indexOf("a"));
		System.out.println("First t position is = "+sName.indexOf("t"));
		System.out.println("First h position is = "+sName.indexOf("h"));
		System.out.println();
		System.out.println("Last i position is = "+sName.lastIndexOf("i"));
		System.out.println("Last h position is = "+sName.lastIndexOf("h"));
		System.out.println("Last y position is = "+sName.lastIndexOf("y"));
		System.out.println("Last Di position is = "+sName.lastIndexOf("D"));
		System.out.println();
		System.out.println("Name replaced by "+sName.replace("Vijay Dinanath Chouhan", "Shubham Prajapati"));

		System.out.println();
		String newName = sName.replace("Vijay Dinanath Chouhan", "Shubham Prajapati");
		System.out.println(newName);
		System.out.println();
		
		System.out.println("Length of the String is = "+sName.length());
		System.out.println("Fist Latter of the String is = "+sName.charAt(0));
		System.out.println("Lower Case = "+sName.toLowerCase());
		System.out.println("Upper Case = "+sName.toUpperCase());
		System.out.println();
		System.out.println("String starts with Vijay = "+sName.startsWith("Shubham"));
		System.out.println("String ends with chouhhan = "+sName.endsWith("Chouhan"));
		System.out.println();
		System.out.println("Substring of String is = "+sName.substring(3));
	}

}
