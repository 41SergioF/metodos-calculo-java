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
			System.out.println("<testativa> " + i);
			x = (a + b) / 2.0;
			System.out.println("x: " + x);
			result = function.functionCalculation(x);
			System.out.println(result);
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
			}i++;
			System.out.println("a: " + a + " b:"+ b + "\n");
		} while (ConverterService.modDouble(result) > erro);
				
		return x;
	}
	
}
