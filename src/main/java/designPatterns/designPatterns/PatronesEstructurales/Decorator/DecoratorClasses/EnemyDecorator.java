package designPatterns.designPatterns.PatronesEstructurales.Decorator.DecoratorClasses;

import designPatterns.designPatterns.PatronesEstructurales.Decorator.Entities.Enemy;

public abstract class EnemyDecorator implements Enemy {

    protected Enemy enemy;

    public EnemyDecorator(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public void attack() {
        enemy.attack();
    }
}
