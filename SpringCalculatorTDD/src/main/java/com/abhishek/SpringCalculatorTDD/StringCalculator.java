package com.abhishek.SpringCalculatorTDD;

public class StringCalculator {

	public int calculate(String number) {
		if(isEmpty(number)) {
			return 0;
		}
		return stringToInteger(number);
	}
	
	private boolean isEmpty(String number) {
		return number.isEmpty();
	}
	private int stringToInteger(String number) {
		return Integer.parseInt(number);
	}
}
