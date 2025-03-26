package studio7;

public class Rectangle {
	// our class, like a cookie cutter, defines the whole thing
	
	private double length;
	private double width;
	// our instance variables, things that "shape" the cookie

	// constructor, where you initialize the instance variables
	// taking the cutter and pressing into dough
	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
		// or this.length = initLength, initLength refers to parameter, this.length is instant variable
		// yay object oriented prorgramming!
		
		// cannot just do length = length, just reassigns parameter
	}
	
//	public Rectangle(double length, double width) { 
//	    this.length = length;
//	    this.width = width;   
//	}

	public double rectangleArea(){
		return this.length * this.width;
	}

	public double rectanglePerimeter() {
		return (2 * length) + (2 * width);
		// could also use this.length, just represents more clearly that you're using the instance variable
	}

	// rectangle can indicate whether its smaller than another rectangle
	public boolean compareRectangle(Rectangle r) {
		return this.rectangleArea() < r.rectangleArea();
		// r2.compareRectangle(r) 
		// r2 is "this"
	}

	// indicate if its a square
	public boolean ifSquare() {
		return this.length == this.width;
	}
	
	public static void main(String[] args) {
		// objects, instances of the class
		// note that the "data type" is the name of the class
		Rectangle r = new Rectangle(5.0, 7.5);
		Rectangle r2 = new Rectangle(5.5, 8.0);
		Rectangle r3 = new Rectangle(4.0, 4.0);
		
		System.out.println("Area of the rectangle: " + r.rectangleArea());
		System.out.println(r2.compareRectangle(r));
		System.out.println("Is it a square: " + r3.ifSquare());
	}

}

