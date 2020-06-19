package application;

import entities.Calculation;
import entities.Function;
import service.ConverterService;

public class Program {

	public static void main(String[] args) {
		
		String fString = "1.0x9.0 -9.0x1.0 +5.0x0.0";
		
		Function function = new Function(ConverterService.converterString(fString));
		
		System.out.println(Calculation.bisectionMethod(0.5, 1.0, 0.001, function, true));
		
		
	}

}
