package designpatterns.creational.factory.abstractfactory.factory.store;

import designpatterns.creational.factory.abstractfactory.factory.ingredient.NYPizzaIngredientFactory;
import designpatterns.creational.factory.abstractfactory.factory.ingredient.PizzaIngredientFactory;
import designpatterns.creational.factory.abstractfactory.pizza.CheesePizza;
import designpatterns.creational.factory.abstractfactory.pizza.PepperoniPizza;
import designpatterns.creational.factory.abstractfactory.pizza.Pizza;
import designpatterns.creational.factory.abstractfactory.pizza.VeggiePizza;
import designpatterns.creational.factory.abstractfactory.pizza.ClamPizza;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
