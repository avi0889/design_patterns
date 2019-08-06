package designpatterns.creational.observer.subject;

import designpatterns.creational.observer.observer.Observer;

import java.util.*;

public class SubjectImpl implements Subject {
	private ArrayList<Observer> observers;
	private int value = 0;
	
	public SubjectImpl() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(value);
		}
	}
	
	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
}