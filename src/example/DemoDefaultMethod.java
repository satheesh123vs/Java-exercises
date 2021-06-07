package example;

//Default Methods which allow the interfaces to have methods with implementation,
//without affecting the classes that implement the interface.

@FunctionalInterface
interface TestInterface {
	// abstract method -exactly one abstract method inside FunctionalInterface.
	public void square(int a);

	// default method
	default void show() {
		System.out.println("Default Method:show() Executed");
	}
}

public class DemoDefaultMethod implements TestInterface {
	public static void main(String[] args) {
		TestInterface testInterface = new DemoDefaultMethod();
		testInterface.show();
	}

	@Override
	public void square(int a) {
	}

}