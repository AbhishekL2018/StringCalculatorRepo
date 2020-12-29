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
			return getSum(inputNumbers);
		}
	}

	private boolean isEmpty(String number) {
		return number.isEmpty();
	}

	private int stringToInteger(String number) {
		return Integer.parseInt(number);
	}

	private int getSum(String[] numbers) {
		int sum = 0;
		for (String number : numbers) {
			sum += Integer.parseInt(number);
		}
		return sum;
	}
}
