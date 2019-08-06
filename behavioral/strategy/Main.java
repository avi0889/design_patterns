package designpatterns.creational.strategy;

import designpatterns.creational.strategy.duck.*;
import designpatterns.creational.strategy.behaviour.fly.FlyBehavior;
import designpatterns.creational.strategy.behaviour.fly.FlyRocketPowered;
import designpatterns.creational.strategy.behaviour.quack.QuackBehavior;

public class Main {
 
	public static void main(String[] args) {

		FlyBehavior cantFly = () -> System.out.println("I can't fly");
		QuackBehavior squeak = () -> System.out.println("Squeak");

		//setup the ducks
		MallardDuck mallard = new MallardDuck();
		RubberDuck rubberDuck = new RubberDuck(cantFly, squeak);
		DecoyDuck decoy = new DecoyDuck();

		//make the ducks talk
		mallard.performQuack();
		rubberDuck.performQuack();
		decoy.performQuack();

		//play with flying behaviour
		Duck model = new ModelDuck();
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
