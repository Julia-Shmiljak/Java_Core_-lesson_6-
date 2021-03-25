package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
	int x;
	int y;

	public MyCalculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int coutPlus() {
		return this.x + this.y;		
	}
	@Override
	public int counMinus() {
		return this.x - this.y;		
	}
	@Override
	public int countDevide() {
		return this.x * this.y;	
	}
	@Override
	public int countMultiply() {
		return this.x / this.y;
	}

	public void viewResult (int result) {
		System.out.println("Result: " + result);
	}

}
