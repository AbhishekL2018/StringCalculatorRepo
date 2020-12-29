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
		assertEquals(calculator.Add(""), 0);
	}

	@Test
	public void singleValueTest() {
		assertEquals(calculator.Add("1"), 1);
	}

	@Test
	public void twoNumbersCommaSeperatedReturnSumTest() {
		assertEquals(calculator.Add("1,2"), 3);
	}

	@Test
	public void twoNumbersNewLineSeperatedReturnSumTest() {
		assertEquals(calculator.Add("1\n2"), 3);
	}

	@Test
	public void threeNumbersNewLineDelimitedReturnSumTest() {
		assertEquals(calculator.Add("1\n2\n3"), 6);
	}

	@Test
	public void threeNumbersCommaDelimitedReturnSumTest() {
		assertEquals(calculator.Add("1,2,3"), 6);
	}

}
