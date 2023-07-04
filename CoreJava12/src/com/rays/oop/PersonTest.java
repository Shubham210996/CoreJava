package com.rays.oop;

public class PersonTest {
	public static void main(String[] args)
	{
		Person p = new Person();
		p.setName("Shubham Prajapati");
		p.setAddress("243, ward no. 8, Lunhera Bujurg");
		
		System.out.println("Name : "+p.getName());
		System.out.println("Address : "+p.getAddress());
		System.out.println("Date of Birth : "+p.getDate());
	}
}
