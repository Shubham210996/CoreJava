package com.rays.oop;

public class AccountTest extends Person {
	public static void main(String[] args) {
		Person p = new Person();
		Account men = new Account();
		men.setAcNum("708902010001071");
		men.setAcType("Saving Account");
		men.deposit(10000);
		men.withdrawl(5000);
		men.fundTransfer(2000);
		p.setName("Jyoti Kanel");
		p.setAddress("Kheda Pura, Bhiknyakhedi");
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(men.getAcNum());
		men.getBal();
	}
}
