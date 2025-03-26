package studio7;

public class Die {
	// class is Die
	
	private int n;
	// instance variable

	// constructor
	// passing in how many sides the dice has 
	public Die(int faces) {
		this.n = faces;
	}
	
	public int dieThrown() {
		return (int)(Math.random()*n +1);
		//can be rolled, return a number from 1 to n 
	}
	
	public static void main(String[] args) {
		Die dice1 = new Die(27); // object or instance of class
		System.out.println(dice1.dieThrown());
		}
	}