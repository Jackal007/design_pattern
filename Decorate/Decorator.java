package Decorate;

public class Decorator implements Component {
	protected Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		decorate();
		// 委派给构件
		component.operation();
		decorate();
	}

	public void decorate() {
		System.out.println("###########");
	}
}
