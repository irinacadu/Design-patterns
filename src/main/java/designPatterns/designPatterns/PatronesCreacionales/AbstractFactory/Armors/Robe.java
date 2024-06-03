package designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Armors;

import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Interfaces.Armor;

public class Robe implements Armor {
    @Override
    public void protect() {
        System.out.println("robe protect!!");

    }
}
