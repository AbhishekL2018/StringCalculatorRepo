package com.abhishek.SpringCalculatorTDD;

public class StringCalculator {

	private final String seperator = ",|\n";

	public int Add(String numbers) {
		String[] inputNumbers = numbers.split(seperator);
		if (isEmpty(numbers)) {
			return 0;
		}
		if (numbers.length() == 1) {
			return stringToInteger(numbers);
		} else {
			return getSumOfTwoNumbers(inputNumbers[0], inputNumbers[1]);
		}
	}

	private boolean isEmpty(String number) {
		return number.isEmpty();
	}

	private int stringToInteger(String number) {
		return Integer.parseInt(number);
	}

	private int getSumOfTwoNumbers(String firstNumber, String secondNumber) {
		return Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
	}
}
