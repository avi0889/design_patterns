package designpatterns.creational.prototype;

/**
 * The clone() contract
*/
public interface Prototype {
    Prototype clone();
    String getName();
    void execute();
}