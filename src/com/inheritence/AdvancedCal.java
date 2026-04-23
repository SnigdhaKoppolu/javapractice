package com.inheritence;

public class AdvancedCal extends ScientificCal{
	
	void cTof() {
		System.out.println();
	}
	public static void main(String[] args) {
		AdvancedCal ac = new AdvancedCal();
		ac.add(44, 22);
		ac.power(2, 3);
		ac.sub(75, 23);
		ac.mul(12, 7);
		ac.cTof();
	}

}
