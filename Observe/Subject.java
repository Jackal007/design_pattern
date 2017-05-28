package Observe;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	/**
	 * 用来保存注册的观察者对象
	 */
	private List<Observer> list = new ArrayList<Observer>();

	/**
	 * 注册观察者对象
	 * 
	 * @param observer
	 */
	public void attach(Observer observer) {

		list.add(observer);
		System.out.println("Attached an observer");
	}

	/**
	 * 删除观察者对象
	 * 
	 * @param observer
	 */
	public void detach(Observer observer) {

		list.remove(observer);
	}

	/**
	 * 通知所有注册的观察者对象
	 */
	public void nodifyObservers(String newState) {

		for (Observer observer : list) {
			observer.update();
		}
	}
}
