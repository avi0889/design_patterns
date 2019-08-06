package designpatterns.creational.factory.simplefactory;

import designpatterns.creational.factory.simplefactory.factory.SimplePizzaFactory;
import designpatterns.creational.factory.simplefactory.pizza.Pizza;
import designpatterns.creational.factory.simplefactory.factory.PizzaStore;

public class Main {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
 
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}
}
