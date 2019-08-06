package designpatterns.creational.factory.abstractfactory.factory.ingredient;

import designpatterns.creational.factory.abstractfactory.ingredient.clam.Clams;
import designpatterns.creational.factory.abstractfactory.ingredient.clam.FrozenClams;
import designpatterns.creational.factory.abstractfactory.ingredient.sauce.PlumTomatoSauce;
import designpatterns.creational.factory.abstractfactory.ingredient.sauce.Sauce;
import designpatterns.creational.factory.abstractfactory.ingredient.cheese.Cheese;
import designpatterns.creational.factory.abstractfactory.ingredient.cheese.MozzarellaCheese;
import designpatterns.creational.factory.abstractfactory.ingredient.dough.Dough;
import designpatterns.creational.factory.abstractfactory.ingredient.dough.ThickCrustDough;

public class ChicagoPizzaIngredientFactory
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
