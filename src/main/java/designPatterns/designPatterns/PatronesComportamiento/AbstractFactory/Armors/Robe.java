package designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Armors;

import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Interfaces.Armor;

public class Robe implements Armor {
    @Override
    public void protect() {
        System.out.println("robe protect!!");

    }
}
