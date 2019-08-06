package designpatterns.creational.strategy.behaviour.quack;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
