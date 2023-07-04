package com.rays.collections;

public class Lion {
	private String name;
	private String fatherName;
	private String motherName;
	private int acNum;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setFatherName(String fName)
	{
		this.fatherName = fName;
	}
	public String getFatherName()
	{
		return fatherName;
	}
	public void setMotherName(String mName)
	{
		this.motherName = mName;
	}
	public String getMotherName()
	{
		return motherName;
	}
	public void setAcNum(int acNum)
	{
		this.acNum = acNum;
	}
	public int getAcNum()
	{
		return acNum;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"     "+fatherName+"     "+motherName+"     "+acNum;
	}
}
