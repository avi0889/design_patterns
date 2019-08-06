package designpatterns.creational.factory.abstractfactory.factory.ingredient;

import designpatterns.creational.factory.abstractfactory.ingredient.cheese.ReggianoCheese;
import designpatterns.creational.factory.abstractfactory.ingredient.clam.Clams;
import designpatterns.creational.factory.abstractfactory.ingredient.clam.FreshClams;
import designpatterns.creational.factory.abstractfactory.ingredient.dough.ThinCrustDough;
import designpatterns.creational.factory.abstractfactory.ingredient.sauce.Sauce;
import designpatterns.creational.factory.abstractfactory.ingredient.cheese.Cheese;
import designpatterns.creational.factory.abstractfactory.ingredient.dough.Dough;
import designpatterns.creational.factory.abstractfactory.ingredient.sauce.MarinaraSauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
