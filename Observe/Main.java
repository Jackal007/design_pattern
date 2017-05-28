package Observe;

public class Main {
	public static void main(String[] args) {
		Observer observer = new ConcreteObserver("观察者");
		ConcreteSubject subject = new ConcreteSubject();
		observer.addSubject(subject);
		subject.change("new State");

	}
}
