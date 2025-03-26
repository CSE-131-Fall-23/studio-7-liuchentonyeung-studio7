package studio7;

public class Complex {
	
	private double real;
	private double imaginary;
	//instance variables
	
	// constructors must have the same name as the class
	private Complex(double real, double imaginary) {
		//constructor, initializing instance variables
		this.real = real;
		this.imaginary = imaginary;
	}

	public String addComplex(Complex other) {
		// if we wanred to add (2 + 4i and 3 + 5i) add the real numbers 5 and imaginary numbers 9i 
		// would be Complex(2, 4) and Complex(3,5)
		double realNum = this.real + other.real;
		// 2 + 3
		
		double imaginaryNum = this.imaginary + other.imaginary;
		// sum of imaginary numbers 4 + 5
		
		return realNum + " + " + imaginaryNum + "i";
		// a + bi format
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
