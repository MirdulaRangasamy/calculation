package com.mirdu.calculation.basic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringBasicTest {

	@Test
	public void testJoin() {
		assertEquals("SUN FLOWER", new StringBasic().join("SUN", "FLOWER"));
	}

	@Test
	public void testIsUpper1() {
		assertTrue(new StringBasic().isUpper("SUN"));
	}
	@Test
	public void testIsUpper2() {
		assertFalse(new StringBasic().isUpper("SUn"));
	}
	
	@Test
	public void testSame1()
	{
		String s1 = "HI";
		String s2 = "HI";
		assertSame(s1,s2);
	}
	@Test
	public void testSame2()
	{
		String s1 = "HI";
		String s2 = new String("HI");
		assertNotSame(s1,s2);
	}
	@Test
	public void checkNull()
	{
		StringBasic s = null;
		assertNull(s);
	}
	@Test
	public void checkNotNull()
	{
		StringBasic s = new StringBasic();
		assertNotNull(s);
	}
}
