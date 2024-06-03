package designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Weapons;

import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Interfaces.Weapon;

public class Axe implements Weapon {
    @Override
    public void damage() {
        System.out.println("Axe damage!!");
    }
}
