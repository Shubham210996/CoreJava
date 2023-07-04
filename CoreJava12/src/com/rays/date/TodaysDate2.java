package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodaysDate2 {
	public static void main (String[] args)
	{
		Date sp = new Date();
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sp);
	//	String s = d.format(sp);
		System.out.println(d.format(sp));
	//	System.out.println(s);
	}
}
