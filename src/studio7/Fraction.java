package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	//instance variables
	// each fraction object can have a different num/demom 
	// allows us to mantain individual states for each object 

//	public Fraction(int initNumerator, int initDenominator) {
//		numerator = initNumerator;
//		denominator = initDenominator;
//	}
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
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
		
		// ex: 1/2 * 2/3
		// commonDenom = 2 * 3 = 6
		// new numerator: 1 * 3 + 2 * 2 
		// returns 7/6
	}

	public String reciprocalFraction() {
		int newNumerator = this.denominator;
		int newDenominator = this.numerator;
		return newNumerator + "/" + newDenominator;
	}

	private int gcd(int a,int b) {
		if (a%b == 0) {
			return b;
			// ex: 24, 18
			// gcd(18, 24%18) -> gcd(18,6)
			// gcd(6, 18%6) -> gcd(6, 0)
			// gcd = 6
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
