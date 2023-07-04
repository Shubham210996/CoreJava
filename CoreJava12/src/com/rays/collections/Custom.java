package com.rays.collections;

public class Custom {
	private int id;
	private String color;
	private int age;
	private String name;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return color;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	@Override
	public String toString() {
		return id+" "+name+" "+age+" "+color;
	}
}
