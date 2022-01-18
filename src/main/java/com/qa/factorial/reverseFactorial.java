package com.qa.factorial;

public class reverseFactorial {

	public int factorial(int number) {
		for (int i = number - 1; i > 0; i--) {
			number *= i;
		} return number;
	}
	
	public String calculate(int i) {
		String returnValue = "";
		returnValue += i + " = ";
		int reversedFactorial = i;
		int originalValue = i;
		
		for (int j = 1; j < reversedFactorial; j++) {
			reversedFactorial = reversedFactorial / j;
		}		
		
		if (factorial(reversedFactorial) == originalValue) {
			return returnValue + reversedFactorial + "!";
		}
		
		return returnValue + "NONE";
	}
	
}
