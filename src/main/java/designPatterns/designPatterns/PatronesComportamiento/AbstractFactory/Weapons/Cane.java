package designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Weapons;

import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Interfaces.Weapon;

public class Cane implements Weapon {
    @Override
    public void damage() {
        System.out.println("Cane damage!!");
    }
}
