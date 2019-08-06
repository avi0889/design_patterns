package designpatterns.creational.builder;

import designpatterns.creational.builder.builder.HawaiianPizzaBuilder;
import designpatterns.creational.builder.builder.PizzaBuilder;
import designpatterns.creational.builder.pizza.Pizza;
import designpatterns.creational.builder.waiter.Waiter;


public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();

        waiter.setPizzaBuilder( hawaiianPizzaBuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
    }
}
