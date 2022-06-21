package com.mirdu.calculation.basic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class CalculatorTest {
	static Calculator c;
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class");
		c = new Calculator();
		
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Test"+c);
		c = null;
	
		System.out.println("After Class");
	}
	@Before
	public void beforeTest()
	{
		
		System.out.println("Before Test"+ c);
	}
	@After
	public void afterTest()
	{
		System.out.println("After Test"+c);
		
	}
	@Test
	public void testAdd1() {
		System.out.println(c);
		assertEquals(5, c.add(3, 2));
	}

	@Test
	public void testAdd2() {
		System.out.println(c);
		assertEquals(0, c.add(-3, 3));
	}
	@Test
	public void testAdd3() {
		System.out.println(c);
		assertEquals(-7, c.add(5, -12));
	}

	@Test
	public void testDiff() {
		System.out.println(c);
		assertEquals(5, c.diff(10, 15));
	}
	
	@Test
	public void testaddArray()
	{
		int a[] = {1,2,3};
		int b[] = {2,3,4};
		
		int r[] = {3,5,7};
		assertArrayEquals(r,c.addArray(a, b));
	}
	
}
