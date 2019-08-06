package designpatterns.creational.factory.abstractfactory.factory.ingredient;

import designpatterns.creational.factory.abstractfactory.ingredient.sauce.Sauce;
import designpatterns.creational.factory.abstractfactory.ingredient.dough.Dough;
import designpatterns.creational.factory.abstractfactory.ingredient.cheese.Cheese;
import designpatterns.creational.factory.abstractfactory.ingredient.clam.Clams;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Clams createClam();
 
}
