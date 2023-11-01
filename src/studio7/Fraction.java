package studio7;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
	}

	public String multiplyFraction(Fraction apple) {
		double newNumerator = this.numerator * apple.numerator;
		double newDenominator = this.denominator * apple.denominator;
		return newNumerator + "/" + newDenominator;
	}
	public static void main(String[] args) {
		Fraction apple = new Fraction(5, 55);
		Fraction banana = new Fraction(3, 12);
		
		System.out.println(apple.multiplyFraction(banana));
	
	}
}
