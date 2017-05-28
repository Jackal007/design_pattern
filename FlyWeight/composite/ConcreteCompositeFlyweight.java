package FlyWeight.composite;

import java.util.HashMap;
import java.util.Map;

public class ConcreteCompositeFlyweight implements Flyweight {
	private Map<Character, Flyweight> flies = new HashMap<Character, Flyweight>();

	/**
	 * 增加一个新的单纯享元对象到聚集中
	 */
	public void add(Character key, Flyweight fly) {
		flies.put(key, fly);
	}

	/**
	 * 外蕴状态作为参数传入到方法中
	 */
	@Override
	public void operation(String state) {
		Flyweight fly = null;
		for (Object o : flies.keySet()) {
			fly = flies.get(o);
			fly.operation(state);
		}

	}

}
