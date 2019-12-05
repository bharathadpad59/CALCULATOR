package com.bharat1.amiti;

public class Calculations 
{
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int sub(int a,int b)
	{
		return a-b;
	}
	
	public int mul(int a,int b)
	{
		return a*b;
	}
	
	public int div(int a,int b)
	{
		if(a==0 || b==0)
		{
			return 0;
		}
		return a/b;
	}
	
	public int per(int a,int b)
	{
		return a*100/b;
	}
}
