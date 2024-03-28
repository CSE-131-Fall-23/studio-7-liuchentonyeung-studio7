package studio7;

public class Complex {
	
	private double real;
	private double imaginary;
	
	private Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public String addComplex(Complex other) {
		double realNum = this.real + other.real;
		double imaginaryNum = this.imaginary + other.imaginary;
		return realNum + " + " + imaginaryNum + "i";
	}
	
	public String productComplex(Complex other) {
		//(a+bi)×(c+di), is (ac−bd)+(ad+bc)i
		double realNum = (this.real * other.real) - (this.imaginary * other.imaginary);
		double imaginaryNum = (this.real * other.real) + (this.imaginary * other.imaginary);
		return realNum + " + " + imaginaryNum + "i";
	}
	
	public static void main(String[] args) {
		Complex other = new Complex(2,4);
		Complex other1 = new Complex(3, 5);
		System.out.println(other.addComplex(other1));
		System.out.println(other.productComplex(other1));
	}
}
