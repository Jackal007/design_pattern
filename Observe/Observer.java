package Observe;

import java.util.ArrayList;
import java.util.List;

public abstract class Observer {
	/**
	 * 用来保存观察者对象订阅的subject
	 */
	private List<Subject> list = new ArrayList<Subject>();
	protected String name;

	public Observer(String name) {
		this.name = name;
	}

	public void addSubject(Subject subject) {
		list.add(subject);
		subject.attach(this);
	}

	public void update() {

	}
}
