package designPatterns.designPatterns.PatronesEstructurales.Adapter.Entities;

import designPatterns.designPatterns.PatronesEstructurales.Adapter.Interfaces.Enemy;

public class Magician implements Enemy {
    @Override
    public void attack() {
        System.out.println("Magician attack!!");
    }

    @Override
    public void damage() {
        System.out.println("Magician damage!!");
    }
}
