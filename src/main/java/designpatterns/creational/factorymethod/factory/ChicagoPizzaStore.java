package designpatterns.creational.factory.factorymethod.factory;

import designpatterns.creational.factory.factorymethod.pizza.chicago.ChicagoStyleVeggiePizza;
import designpatterns.creational.factory.factorymethod.pizza.Pizza;
import designpatterns.creational.factory.factorymethod.pizza.chicago.ChicagoStyleCheesePizza;
import designpatterns.creational.factory.factorymethod.pizza.chicago.ChicagoStyleClamPizza;
import designpatterns.creational.factory.factorymethod.pizza.chicago.ChicagoStylePepperoniPizza;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else return null;
	}
}
