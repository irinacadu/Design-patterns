package designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.TestFactoryMethod;


import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Enemy;
import designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.EntitiesFactoryMethod.MagicianFactoryMethod;
import designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.EntitiesFactoryMethod.WarriorFactoryMethod;

public class TestFactoryMethod {
    public static void main(String[] args) {
        Enemy warrior = new WarriorFactoryMethod().createEnemy();
        Enemy magician = new MagicianFactoryMethod().createEnemy();

        warrior.attack();
        magician.attack();
    }
}
