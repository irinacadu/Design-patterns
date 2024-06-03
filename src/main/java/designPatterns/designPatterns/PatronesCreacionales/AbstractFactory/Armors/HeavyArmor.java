package designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Armors;

import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Interfaces.Armor;

public class HeavyArmor implements Armor {
    @Override
    public void protect() {
        System.out.println("heavy Armor protect!!");
    }
}
