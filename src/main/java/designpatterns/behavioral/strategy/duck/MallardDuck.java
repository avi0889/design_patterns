package designpatterns.creational.strategy.duck;

import designpatterns.creational.strategy.behaviour.fly.FlyWithWings;
import designpatterns.creational.strategy.behaviour.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
