package com.abhishek.SpringCalculatorTDD;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {
	
	@Test
	public void emptyStringTest() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(calculator.calculate(""), 0);
	}

}
