package com.abhishek.SpringCalculatorTDD;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

	private final String seperator = ",|\n";
	public int count_call = 0;

	public int Add(String numbers) throws Exception {
		count_call++;
		String[] inputNumbers = seperator(numbers);
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
			if (stringToInteger(number) > 1000) {
				continue;
			}
			sum += stringToInteger(number);
		}
		return sum;
	}
	
	private String[] seperator(String numbers) {
		if(numbers.startsWith("//")) {
			Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(numbers);
			if(matcher.matches()) {
				String delimitre = matcher.group(1);
				String toSplit = matcher.group(2);
				return toSplit.split(delimitre);
			}
			throw new RuntimeException("Wrong custom Delimitre format");
		}
		return numbers.split(seperator);	
	}
	
	 public int GetCalledCount() {
		return count_call;
	 }
}
