package studio7;

public class Rectangle {
	
	private double length;
	private double width;

	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}

	public double rectangleArea(){
		return length * width;
	}

	public double rectanglePerimeter() {
		return (2 * length) + (2 * width);
	}

	// rectangle can indicate whether its smaller than another rectangle
	public boolean compareRectangle(Rectangle r) {
		return this.rectangleArea() < r.rectangleArea();
	}

	// indicate if its a square
	public boolean ifSquare() {
		return length == width;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5.0, 7.5);
		Rectangle r2 = new Rectangle(5.5, 8.0);
		Rectangle r3 = new Rectangle(4.0, 4.0);
		
		System.out.println("Area of the rectangle: " + r.rectangleArea());
		System.out.println(r2.compareRectangle(r));
		System.out.println("Is it a square: " + r3.ifSquare());
	}

}

