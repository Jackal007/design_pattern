package Decorate;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		decorate();
		component.operation();
		decorate();
	}

	@Override
	public void decorate() {
		System.out.println("****");
	}
}
