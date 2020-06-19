package entities;

import service.ConverterService;

public class Calculation {

	public Calculation() {
	}
	/*se a for positivo mas como verdadeiro. aIsPositive = false a é negativo*/
	public static Double bisectionMethod(Double a, Double b, Double erro, Function function, boolean aIsPositive) {
		Double x = 0.0;
		Double result;

		int i = 1;
		do {
		
			x = (a + b) / 2.0;
			result = function.functionCalculation(x);
			
			if (aIsPositive) { //se o a for positivo
				if (result >= 0.0) {
					a = x;
				}else {
					b = x; 
				}
			}else {
				if (result > 0.0) {
					a = x;
				}else {
					b = x; 
				}
			}
			
		} while (ConverterService.modDouble(result) > erro);
				
		return x;
	}
	
	private static Double calculateX(Double a, Double b, Function function) {
		Double f = a * function.functionCalculation(b) - b *function.functionCalculation(a);
		f = f / (function.functionCalculation(b) - function.functionCalculation(a));
				return f;
	}
	
	public static Double falsePosition(Double a, Double b, Double erro, Function function, boolean aIsPositive) {
		Double x = 0.0;
		Double result;

		do {
			
			x = calculateX(a, b, function);
			result = function.functionCalculation(x);
			
			if (aIsPositive) { //se o a for positivo
				if (result >= 0.0) {
					a = x;
				}else {
					b = x; 
				}
			}else {
				if (result > 0.0) {
					a = x;
				}else {
					b = x; 
				}
			}
			
		} while (ConverterService.modDouble(result) > erro);
		
		return x;
	}
	/*
	public static Double fixedPoint() {
		
	}*/
		
}
