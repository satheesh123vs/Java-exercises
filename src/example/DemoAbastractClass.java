package example;

abstract class Shape {

	String objectName = " ";

	Shape(String name) {
		this.objectName = name;
	}

	public void moveTo(int x, int y) {
		System.out.println(this.objectName + " " + "has been moved to" + " x = " + x + " and y = " + y);
	}

	abstract public double area();

	abstract public void draw();

}

class Rectangle extends Shape {

	int length, width;

	// constructor
	Rectangle(int length, int width, String name) {

		super(name);
		this.length = length;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle has been drawn ");
	}

	@Override
	public double area() {
		return (double) (length * width);
	}
}

public class DemoAbastractClass {
	public static void main(String[] args) {

		// creating the Object of chile class
		// and using abstract class reference.
		Shape rect = new Rectangle(2, 3, "Rectangle");
		System.out.println("Area of rectangle: " + rect.area());
		rect.moveTo(1, 2);
	}
}