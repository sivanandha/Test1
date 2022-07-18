package com.example;

import static org.junit.Assert.*;


import org.junit.Test;

public class DemoTest {

	@Test
	public void testAddition() {
		final int actual=Math.addExact(4, 4);
		final int expected=8;
		assertEquals(expected, actual);
	}

	@Test
	public void testSub() {
		final int actual=Math.subtractExact(4, 4);
		final int expected=0;
		assertEquals(expected, actual);
	}
		
		@Test
		public void testmul() {
			final int actual=Math.multiplyExact(2, 3);
			final int expected=6;
			assertEquals(expected, actual);
		
	}

}
