package designPatterns.designPatterns.PatronesCreacionales.FactoryMethod.TestFactoryMethod;


import designPatterns.designPatterns.PatronesCreacionales.FactoryMethod.EntitiesFactoryMethod.MagicianFactoryMethodClass;
import designPatterns.designPatterns.PatronesCreacionales.FactoryMethod.EntitiesFactoryMethod.WarriorFactoryMethodClass;
import designPatterns.designPatterns.PatronesCreacionales.GeneralEntities.Enemy;

public class TestFactoryMethod {
    public static void main(String[] args) {
        Enemy warrior = new WarriorFactoryMethodClass().createEnemy();
        Enemy magician = new MagicianFactoryMethodClass().createEnemy();

        warrior.attack();
        magician.attack();
    }
}
