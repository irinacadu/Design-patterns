package designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.TestFactoryMethod;

import designPatterns.designPatterns.PatronesComportamiento.Factory.EntitiesFactory.EnemyFactory;
import designPatterns.designPatterns.PatronesComportamiento.Factory.ServicesFactory.EnemyFactoryService;

public class TestFactoryMethod {
    public static void main(String[] args) {
        EnemyFactoryService enemyFactoryService = new EnemyFactoryService();
        EnemyFactory warrior = enemyFactoryService.createEnemy("warrior");
        EnemyFactory magician = enemyFactoryService.createEnemy("magician");

        warrior.attack();
        magician.attack();
    }
}
