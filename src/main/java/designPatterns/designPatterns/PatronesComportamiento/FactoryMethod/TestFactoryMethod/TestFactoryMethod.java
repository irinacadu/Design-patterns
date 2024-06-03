package designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.TestFactoryMethod;


import designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.EntitiesFactoryMethod.MagicianFactoryMethodClass;
import designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.EntitiesFactoryMethod.WarriorFactoryMethodClass;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Enemy;

public class TestFactoryMethod {
    public static void main(String[] args) {
        Enemy warrior = new WarriorFactoryMethodClass().createEnemy();
        Enemy magician = new MagicianFactoryMethodClass().createEnemy();

        warrior.attack();
        magician.attack();
    }
}
