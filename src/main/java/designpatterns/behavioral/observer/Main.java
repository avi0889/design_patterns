package designpatterns.creational.observer;

import designpatterns.creational.observer.subject.SubjectImpl;
import designpatterns.creational.observer.observer.Observer1;
import designpatterns.creational.observer.observer.Observer2;

public class Main {

	public static void main(String[] args) {
		SubjectImpl subject = new SubjectImpl();

		//create observers
		Observer1 observer1 = new Observer1(subject);
		Observer2 observer2 = new Observer2(subject);

        //update something
		subject.setValue(80);
	}
}
