package designPatterns.designPatterns.PatronesEstructurales.Decorator.Species;

import designPatterns.designPatterns.PatronesEstructurales.Decorator.Entities.Enemy;

public class Elf implements Enemy {
    @Override
    public void attack() {
        System.out.println("Elf attack!!");
    }
}
