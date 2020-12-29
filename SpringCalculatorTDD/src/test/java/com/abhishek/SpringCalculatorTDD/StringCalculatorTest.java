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
	public void emptyStringTest() throws Exception {
		assertEquals(calculator.Add(""), 0);
	}

	@Test
	public void singleValueTest() throws Exception {
		assertEquals(calculator.Add("1"), 1);
	}

	@Test
	public void twoNumbersCommaSeperatedReturnSumTest() throws Exception {
		assertEquals(calculator.Add("1,2"), 3);
	}

	@Test
	public void twoNumbersNewLineSeperatedReturnSumTest() throws Exception {
		assertEquals(calculator.Add("1\n2"), 3);
	}

	@Test
	public void threeNumbersNewLineDelimitedReturnSumTest() throws Exception {
		assertEquals(calculator.Add("1\n2\n3"), 6);
	}

	@Test
	public void threeNumbersCommaDelimitedReturnSumTest() throws Exception {
		assertEquals(calculator.Add("1,2,3"), 6);
	}

	@Test
	public void threeNumbersRandomDelimitedReturnSumTest() throws Exception {
		assertEquals(calculator.Add("//;\n1;2;3"), 6);
	}

	/*@Test
	public void negativeInputReturnsException() throws Exception {
		try {
			calculator.Add("-1,-2,3");
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Negative numbers are not allowed: -1,-2");
		}
	}*/

	@Test(expected = Exception.class)
	public void negativeInputReturnsExceptionAlternate() throws Exception {
		calculator.Add("-1");
	}

	@Test
	public void ignoreNumberGreaterThanThousand() throws Exception {
		assertEquals(calculator.Add("100,21,1001"), 121);
	}

}
