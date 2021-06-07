package example;

@FunctionalInterface
interface Drawable {
	public void draw();
}

public class LambdaExpressionExample {
	public static void main(String[] args) {
		int width = 10;
		// Java lambda expression is treated as a function, so compiler does not
		// create .class file.
		Drawable d2 = () -> {
			System.out.println("Drawing " + width);
		};
		d2.draw();
	}
}