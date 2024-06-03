package designPatterns.designPatterns.PatronesEstructurales.Adapter.Entities;

import designPatterns.designPatterns.PatronesEstructurales.Adapter.Interfaces.Enemy;

public class Warrior implements Enemy {
    @Override
    public void attack() {
        System.out.println("Warrior attack!!");
    }

    @Override
    public void damage() {
        System.out.println("Warrior damage!!");
    }
}
