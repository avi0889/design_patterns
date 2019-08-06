package designpatterns.creational.prototype;


import java.util.ArrayList;
import java.util.List;

public class PrototypeModule {

    private static List<Prototype> prototypes = new ArrayList<>();

    public static void addPrototype(Prototype p) {
        prototypes.add(p);
    }

    public static Prototype createPrototype(String name) {
        for (Prototype p : prototypes) {
            if (p.getName().equals(name)) {
                return p.clone();
            }
        }
        System.out.println(name + ": doesn't exist");
        return null;
    }
}
