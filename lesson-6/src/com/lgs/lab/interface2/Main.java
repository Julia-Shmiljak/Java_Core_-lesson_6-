package com.lgs.lab.interface2;

public class Main {
	public static void main(String[] args) {
		
		MyCalculator calculator = new MyCalculator(10, 15);
		
		calculator.viewResult(calculator.coutPlus());
		calculator.viewResult(calculator.counMinus());
		calculator.viewResult(calculator.countDevide());
		calculator.viewResult(calculator.countMultiply());
		
	}

}
