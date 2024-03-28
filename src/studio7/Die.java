package studio7;

public class Die {
	// class is Die
	
	private int n;
	// instance variable

	public Die(int faces) {
		n = faces;
	}
	
	public int dieThrown() {
		return (int)(Math.random()*n +1);
	}
	
	public static void main(String[] args) {
		Die dice1 = new Die(27);
		System.out.println(dice1.dieThrown());
		}
	}