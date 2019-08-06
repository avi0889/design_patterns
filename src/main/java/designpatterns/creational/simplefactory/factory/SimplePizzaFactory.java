package designpatterns.creational.factory.simplefactory.factory;

import designpatterns.creational.factory.simplefactory.pizza.CheesePizza;
import designpatterns.creational.factory.simplefactory.pizza.Pizza;
import designpatterns.creational.factory.simplefactory.pizza.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
