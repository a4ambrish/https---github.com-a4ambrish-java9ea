package com.ambrish.jha.app.calculator;

import com.ambrish.jha.app.calculator.internal.CalculatorImpl;

public class CalculatorService {

	public static Calculator getInstance(){
		return new CalculatorImpl();
		
	}
	
}
