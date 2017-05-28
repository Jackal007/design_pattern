package FlyWeight.composite;

public class ConcreteFlyweight implements Flyweight {
	private Character intrinsicState = null;

	/**
	 * 构造函数，内蕴状态作为参数传入 (所有的内蕴状态在对象创建之后，就不会再改变了)
	 * 
	 * @param state
	 */
	public ConcreteFlyweight(Character state) {
		this.intrinsicState = state;
	}

	/**
	 * 外蕴状态作为参数传入方法中，改变方法的行为， 但是并不改变对象的内蕴状态。
	 */
	@Override
	public void operation(String state) {
		System.out.println("Intrinsic State = " + this.intrinsicState);
		System.out.println("Extrinsic State = " + state);
	}

}
