package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserDate {
	private int dob;
	private String name;
	
	public void setDate(int i)
	{
		dob = i;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.format(dob);
	}
	public int getDate()
	{
		return dob;
	}
	
	
}
