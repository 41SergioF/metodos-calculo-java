package entities;

import java.util.List;

public class Function {

	List<Polynomial> polynomialList;
	
	public Function(List<Polynomial> list) {
		polynomialList = list;
	}
	
	public List<Polynomial> getPolynomialsList() {
		return polynomialList;
	}
	
	public void addPolynomialList(Polynomial polynomial) {
		polynomialList.add(polynomial);
	}
	
	public void removePolynomialList(Polynomial polynomial) {
		polynomialList.remove(polynomial);
	}
	
	@Override
	public String toString() {
		return concat();
	}
	
	private String concat() {
		String function = new String();
		for (Polynomial polynomial : polynomialList) {
			function = function.concat(" "+ polynomial.toString());
		}
		return function;
	}

	public Double functionCalculation(Double x) {
		Double value = 0.0;
		
		for (Polynomial polynomial : polynomialList) {
			value += polynomial.polynomialCalculation(x);
		}
		
		return value;
	}

}
