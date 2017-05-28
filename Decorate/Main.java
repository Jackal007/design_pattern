package Decorate;

public class Main {
	public static void main(String[] args) {
		Component test = new ConcreteDecorator(new ConcreteDecorator(new ConcreteComponent()));
		test.operation();
	}
}
