package Observe;

public class ConcreteObserver extends Observer {

	public ConcreteObserver(String name) {
		super(name);
	}

	public void update() {
		/**
		 * 更新观察者的状态，使其与目标的状态保持一致
		 */
		System.out.println("我 " + name + " 被更新了");
	}

}
