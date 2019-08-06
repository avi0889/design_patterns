package designpatterns.creational.decorator.starbuzz;

import designpatterns.creational.decorator.starbuzz.beverage.Beverage;
import designpatterns.creational.decorator.starbuzz.beverage.DarkRoast;
import designpatterns.creational.decorator.starbuzz.beverage.Espresso;
import designpatterns.creational.decorator.starbuzz.beverage.HouseBlend;
import designpatterns.creational.decorator.starbuzz.decorator.Soy;
import designpatterns.creational.decorator.starbuzz.decorator.Whip;
import designpatterns.creational.decorator.starbuzz.decorator.Mocha;

public class Main {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
