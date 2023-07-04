package com.rays.oop;

import java.util.Date;

public class Person {
	private String name ;
	private Date dob = null;
	private String address;
	public static final float AVG_AGE = 18;
	
	public void setName(String s1)
	{
		name = s1;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String s2)
	{
		address = s2;
	}
	public String getAddress()
	{
		return address;
	}
	public void setDate(Date d)
	{
		dob = d;
	}
	public Date getDate()
	{
		return dob;
	}
	public float getAge()
	{
		return AVG_AGE;
	}
}
