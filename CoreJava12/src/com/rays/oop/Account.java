package com.rays.oop;

public class Account {
	private String number;
	private String acType;
	private double balance;
	
	public void setAcNum(String s)
	{
		number = s;
	}
	public String getAcNum()
	{
		return number;
	}
	public void setAcType(String s)
	{
		acType = s;
	}
	public String getAcType()
	{
		return acType;
	}
	public void getBal()
	{
		System.out.println("Your Account Balance is = "+balance+" Rupees");
	}
	public void withdrawl(int wd)
	{
		balance = balance - wd;
	}
	public void deposit(int dpst)
	{
		balance = balance + dpst;
	}
	public void fundTransfer(int ft)
	{
		balance = balance - ft;
	}
}
