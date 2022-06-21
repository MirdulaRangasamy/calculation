package com.mirdu.calculation.basic;

public class StringBasic {
	public String join(String a, String b)
	{
		return a+" "+b;
		}
	public boolean isUpper(String s)
	{
		for(int i=0; i<s.length();i++)
		{
			if(!Character.isUpperCase(s.charAt(i)))
				return false;
		}
		return true;
	}
}
