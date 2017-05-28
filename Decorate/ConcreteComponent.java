package Decorate;

public class ConcreteComponent implements Component {
	@Override
	public void operation() {
		System.out.println("相关的业务代码");
	}
}
