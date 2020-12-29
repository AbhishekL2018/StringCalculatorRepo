package com.abhishek.SpringCalculatorTDD;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	
	private StringCalculator calculator;
	
	@Before
	public void init() {
		calculator = new StringCalculator();
	}
	
	@Test
	public void emptyStringTest() {
		assertEquals(calculator.calculate(""), 0);
	}
	
	@Test
	public void singleValueTest() {
		assertEquals(calculator.calculate("1"), 1);
	}

}
