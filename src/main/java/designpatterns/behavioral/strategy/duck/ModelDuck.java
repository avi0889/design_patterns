package designpatterns.creational.strategy.duck;

import designpatterns.creational.strategy.behaviour.quack.Quack;
import designpatterns.creational.strategy.behaviour.fly.FlyNoWay;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
