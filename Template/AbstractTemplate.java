package Template;

public abstract class AbstractTemplate {
	/**
	 * 模板方法
	 */
	public void templateMethod() {
		// 调用基本方法
		abstractMethod();
		hookMethod();
		concreteMethod();
	}

	/**
	 * 基本方法的声明（必须由子类实现）
	 */
	protected abstract void abstractMethod();

	/**
	 * 基本方法(空方法，子类可以选择是否实现它)
	 */
	protected void hookMethod() {
	}

	/**
	 * 基本方法（已经实现）
	 */
	private final void concreteMethod() {
		// 业务相关的代码
	}
}
