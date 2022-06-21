package com.mirdu.calculation.basic;

public class Calculator {
	public int add(int x, int y)
	{
		return x + y;
	}
	public int diff(int x, int y)
	{
		if(x>y)
			return x - y;
		else
			return y - x;
	}
	public int[] addArray(int []a, int []b)
	{
		int c[] = new int[a.length];
		for(int i=0;i<a.length; i++)
		{
			c[i] = a[i] + b[i];
		}
		return c;
	}
}
