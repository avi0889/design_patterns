package designpatterns.creational.strategy.behaviour.quack;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
