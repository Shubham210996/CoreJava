package com.rays.collections;

public class Employee {
	private String id = null;
	private String acType = null;
	private String name = null;
	private int age = 0;
	
	public Employee()
	{
		//This is a Default Constructor
	}
	
	public Employee(String id, String acType, String name, int age)
	{
		this.id = id;
		this.acType = acType;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAcType() {
		return acType;
	}

	public void setAcType(String acType) {
		this.acType = acType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		return id+" "+acType+" "+name+" "+age;
	}
}
