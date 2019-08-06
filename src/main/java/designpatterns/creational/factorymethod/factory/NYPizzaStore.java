package designpatterns.creational.factory.factorymethod.factory;

import designpatterns.creational.factory.factorymethod.pizza.ny.NYStyleVeggiePizza;
import designpatterns.creational.factory.factorymethod.pizza.Pizza;
import designpatterns.creational.factory.factorymethod.pizza.ny.NYStyleCheesePizza;
import designpatterns.creational.factory.factorymethod.pizza.ny.NYStyleClamPizza;
import designpatterns.creational.factory.factorymethod.pizza.ny.NYStylePepperoniPizza;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
