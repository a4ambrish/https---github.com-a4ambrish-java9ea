package com.ambrish.jha.app.fincal;

import com.ambrish.jha.app.calculator.Calculator;
import com.ambrish.jha.app.calculator.CalculatorService;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = CalculatorService.getInstance();
		// failed to compile
		//CalculatorImpl obj = new CalculatorImpl();
		 System.out.println(cal.add(10, 20));
	}

}
