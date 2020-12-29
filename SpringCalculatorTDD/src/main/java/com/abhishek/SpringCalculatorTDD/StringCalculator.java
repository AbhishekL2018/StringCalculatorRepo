package com.abhishek.SpringCalculatorTDD;

public class StringCalculator {

	public int calculate(String number) {
		String[] inputNumbers = number.split(",");
		if (isEmpty(number)) {
			return 0;
		}
		if (number.length() == 1) {
			return stringToInteger(number);
		} else {
			return Integer.parseInt(inputNumbers[0]) + Integer.parseInt(inputNumbers[1]);
		}
	}

	private boolean isEmpty(String number) {
		return number.isEmpty();
	}

	private int stringToInteger(String number) {
		return Integer.parseInt(number);
	}
}
