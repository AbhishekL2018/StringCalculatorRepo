package com.abhishek.SpringCalculatorTDD;

public class StringCalculator {

	public int calculate(String string) {
		if(string.isEmpty()) {
			return 0;
		}
		return Integer.parseInt(string);
	}
}
