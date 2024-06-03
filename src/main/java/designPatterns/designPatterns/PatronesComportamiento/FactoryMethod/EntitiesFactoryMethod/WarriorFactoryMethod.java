package designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.EntitiesFactoryMethod;

import designPatterns.designPatterns.PatronesComportamiento.Factory.EntitiesFactory.EnemyFactory;

public class WarriorFactoryMethod implements EnemyFactoryMethod {
    @Override
    public void attack() {
        System.out.println("Warrior attack!!");
    }
}
