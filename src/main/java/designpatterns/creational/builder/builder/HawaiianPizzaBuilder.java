package designpatterns.creational.builder.builder;


public class HawaiianPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        System.out.println("setting cross dough..");
        pizza.setDough("cross");
    }

    public void buildSauce() {
        System.out.println("setting mild sauce..");
        pizza.setSauce("mild");
    }

    public void buildTopping() {
        System.out.println("setting ham and pineapple topping..");
        pizza.setTopping("ham+pineapple");
    }
}
