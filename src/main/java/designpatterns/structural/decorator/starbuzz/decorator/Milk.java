package designpatterns.creational.decorator.starbuzz.decorator;

import designpatterns.creational.decorator.starbuzz.beverage.Beverage;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
