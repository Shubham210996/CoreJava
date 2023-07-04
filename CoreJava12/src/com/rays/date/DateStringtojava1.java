package com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStringtojava1 {
	public static void main (String[] args) throws ParseException
	{
		String birth = "24/02/1996";
		SimpleDateFormat dmy = new SimpleDateFormat("dd/MM/yyyy");
		Date d = dmy.parse(birth);
		System.out.println(d);
		
	}

}
