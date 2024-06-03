package designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Weapons;

import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Interfaces.Weapon;

public class Cane implements Weapon {
    @Override
    public void damage() {
        System.out.println("Cane damage!!");
    }
}
