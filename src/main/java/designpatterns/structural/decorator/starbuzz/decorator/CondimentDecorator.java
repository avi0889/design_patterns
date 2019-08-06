package designpatterns.creational.decorator.starbuzz.decorator;

import designpatterns.creational.decorator.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription();
}
