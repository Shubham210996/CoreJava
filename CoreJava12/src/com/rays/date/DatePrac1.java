package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrac1 {
	public static void main(String[] args)
	{
		Date dp = new Date();
		System.out.println("Java's Default Date = "+dp);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(dp));
		String s = sdf.format(dp);
		System.out.println("Second Print Date = "+s);
	}
}
