package designpatterns.creational.factory.abstractfactory.pizza;

import designpatterns.creational.factory.abstractfactory.ingredient.sauce.Sauce;
import designpatterns.creational.factory.abstractfactory.ingredient.cheese.Cheese;
import designpatterns.creational.factory.abstractfactory.ingredient.clam.Clams;
import designpatterns.creational.factory.abstractfactory.ingredient.dough.Dough;

public abstract class Pizza {
	public String name;

	public Dough dough;
	public Sauce sauce;
	public Cheese cheese;
	public Clams clam;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		return result.toString();
	}
}
