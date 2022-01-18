package com.qa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.factorial.reverseFactorial;

public class factorialTest {

	private reverseFactorial facty = new reverseFactorial();
	
	@Test
	public void testIsFactorial() {
		assertEquals("120 = 5!", this.facty.calculate(120));
	}
	
	@Test
	public void testNotFactorial() {
		assertEquals("150 = NONE", this.facty.calculate(150));
	}
	
	@Test
	public void test3() {
		assertEquals("3628800 = 10!", this.facty.calculate(3628800));
	}
	
	@Test
	public void test4() {
		assertEquals("479001600 = 12!", this.facty.calculate(479001600));
	}
	
	@Test
	public void test5() {
		assertEquals("6 = 3!", this.facty.calculate(6));
	}
	
	@Test
	public void test6() {
		assertEquals("18 = NONE", this.facty.calculate(18));
	}
}
