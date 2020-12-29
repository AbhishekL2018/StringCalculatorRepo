package com.abhishek.SpringCalculatorTDD;

public class StringCalculator {

	private final String seperator = ",|\n";

	public int Add(String numbers) throws Exception {
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

	private int getSum(String[] numbers) throws Exception {
		int sum = 0;
		for (String number : numbers) {
			if (stringToInteger(number) < 0) {
				throw new Exception("negatives not allowed");
			}
			sum += stringToInteger(number);
		}
		return sum;
	}
}
