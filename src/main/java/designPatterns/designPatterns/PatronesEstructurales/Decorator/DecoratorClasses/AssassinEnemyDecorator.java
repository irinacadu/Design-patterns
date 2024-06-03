package designPatterns.designPatterns.PatronesEstructurales.Decorator.DecoratorClasses;

import designPatterns.designPatterns.PatronesEstructurales.Decorator.Entities.Enemy;

public class AssassinEnemyDecorator extends EnemyDecorator{
    public AssassinEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        System.out.println("Assassin attack!!");
        super.attack();
    }
}
