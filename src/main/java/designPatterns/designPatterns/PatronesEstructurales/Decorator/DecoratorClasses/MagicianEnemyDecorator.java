package designPatterns.designPatterns.PatronesEstructurales.Decorator.DecoratorClasses;

import designPatterns.designPatterns.PatronesEstructurales.Decorator.Entities.Enemy;

public class MagicianEnemyDecorator extends EnemyDecorator{
    public MagicianEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        System.out.println("Magician attack!!");
        super.attack();
    }
}
