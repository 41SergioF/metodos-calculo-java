package entities;

public class Polynomial {

	private Double base;
	private Double exponent;
	
	public Polynomial() {}

	public Polynomial(Double base, Double exponent) {
		super();
		this.base = base;
		this.exponent = exponent;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getExponent() {
		return exponent;
	}

	public void setExponent(Double exponent) {
		this.exponent = exponent;
	}

	@Override
	public String toString() {
		return base + "x^" + exponent;
	}
	
	public Double polynomialCalculation(Double x) {
		return base * Math.pow(x, exponent);
	}
	
		
}
