package designpatterns.creational.observer.observer;

import designpatterns.creational.observer.subject.Subject;

public class Observer1 implements Observer {
	private int value;
	private Subject simpleSubject;
	
	public Observer1(Subject simpleSubject) {
		this.simpleSubject = simpleSubject;
		simpleSubject.registerObserver(this);
	}
	
	public void update(int value) {
		this.value = value;
		display();
	}
	
	public void display() {
		System.out.println("update received, new value is " + value);
	}
}
