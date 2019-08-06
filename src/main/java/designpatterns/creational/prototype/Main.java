package designpatterns.creational.prototype;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            initializePrototypes();
            List<Prototype> prototypes = new ArrayList<>();
            for (String protoName : args) {
                Prototype prototype = PrototypeModule.createPrototype(protoName);
                if (prototype != null) {
                    prototypes.add(prototype);
                }
            }
            for (Prototype p : prototypes) {
                p.execute();
            }
        } else {
            System.out.println("Run again with arguments of command string ");
        }
    }

    // 3. Populate the "registry"
    public static void initializePrototypes() {
        PrototypeModule.addPrototype(new PrototypeAlpha());
        PrototypeModule.addPrototype(new PrototypeBeta());
        PrototypeModule.addPrototype(new ReleasePrototype());
    }
}
