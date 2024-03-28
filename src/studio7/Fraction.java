package studio7;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
	}

	public String multiplyFraction(Fraction other) {
		int newNumerator = this.numerator * other.numerator;
		int newDenominator = this.denominator * other.denominator;
		return newNumerator + "/" + newDenominator;
	}

	public String addFraction(Fraction other) {
		int commonDenom = this.denominator * other.denominator;
		int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
		return newNumerator + "/" + commonDenom;
	}

	public String reciprocalFraction() {
		int newNumerator = this.denominator;
		int newDenominator = this.numerator;
		return newNumerator + "/" + newDenominator;
	}

	private int gcd(int a,int b) {
		if (b==0) {
			return a;
		}
		else {
			return gcd(b, a % b);
		}
	}
	
	private String simplifyFraction() {
		int d = gcd(this.numerator, this.denominator);
		int newNumerator = this.numerator / d;
		int newDenominator = this.denominator / d;
		return newNumerator + "/" + newDenominator;
	}

	public static void main(String[] args) {
		Fraction other = new Fraction(2, 10);
		Fraction other1 = new Fraction(1, 2);

		System.out.println(other.multiplyFraction(other1));
		System.out.println(other.addFraction(other1));
		System.out.println(other.reciprocalFraction());
		System.out.println(other.simplifyFraction());
	}
}
