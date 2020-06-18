package application;

import java.util.List;

import entities.Function;
import entities.Polynomial;
import service.ConverterService;

public class Program {

	public static void main(String[] args) {
		
		String fString = "4.0x3.0 -1.0x2.0 +6.0x0.0";
		Function function = new Function(ConverterService.converterString(fString));
		System.out.println(function.toString());
		List<Polynomial> list =  ConverterService.toDerive(function.getPolynomialsList());
		Function function2 = new Function(list);
		System.out.println(function2.toString());
		
		System.out.println("F(0) = " + function.functionCalculation(0.0));
	}

}
