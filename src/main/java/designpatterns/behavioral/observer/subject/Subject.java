package designpatterns.creational.observer.subject;

import designpatterns.creational.observer.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
