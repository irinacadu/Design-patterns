package designPatterns.designPatterns.PatronesEstructurales.Decorator.Species;

import designPatterns.designPatterns.PatronesEstructurales.Decorator.Entities.Enemy;

public class Ork implements Enemy {
    @Override
    public void attack() {
        System.out.println("Ork attack!");
    }
}
