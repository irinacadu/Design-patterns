package designPatterns.designPatterns.PatronesEstructurales.Decorator.DecoratorClasses;

import designPatterns.designPatterns.PatronesEstructurales.Decorator.Entities.Enemy;

public class WarriorEnemyDecorator extends EnemyDecorator {
    public WarriorEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        System.out.println("Warrior attack!");
        super.attack();
    }
}
