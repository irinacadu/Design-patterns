package designPatterns.designPatterns.PatronesComportamiento.Factory.TestFactory;


import designPatterns.designPatterns.PatronesComportamiento.Factory.EntitiesFactory.EnemyFactory;
import designPatterns.designPatterns.PatronesComportamiento.Factory.ServicesFactory.EnemyFactoryService;

public class TestFactory {
    public static void main(String[] args) {
        EnemyFactoryService enemyFactoryService = new EnemyFactoryService();
        EnemyFactory warrior = enemyFactoryService.createEnemy("warrior");
        EnemyFactory magician = enemyFactoryService.createEnemy("magician");

        warrior.attack();
        magician.attack();
    }
}
