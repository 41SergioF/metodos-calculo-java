package service;

import java.util.ArrayList;
import java.util.List;

import entities.Polynomial;

//4x⁵ +1x³ +1

public class ConverterService {

	public static List<Polynomial> converterString (String function) {
		 String[] polynomialsFunction = function.split(" "); //separa os polinômios da função
		 List<Polynomial> polynomials = new ArrayList<Polynomial>();
			 
		 for (String polynomial : polynomialsFunction) {
			 String[] parts = polynomial.split("x");
			 polynomials.add(new Polynomial(Double.parseDouble(parts[0]), Double.parseDouble(parts[1])));
		 }
		 return polynomials;
	}

	public static List<Polynomial> toDerive(List<Polynomial> list) {
		List<Polynomial> auxList = list.subList(0, list.size() -1 );
		
		for (Polynomial polynomial : auxList) {
			if (polynomial.getExponent() == 0.0) { //teste se o expeente é igual a zero
				auxList.remove(polynomial);
				continue;
			}
			
			polynomial.setBase(polynomial.getBase() * polynomial.getExponent());
			polynomial.setExponent(polynomial.getExponent()-1);
		}
		return auxList;
	}
}
