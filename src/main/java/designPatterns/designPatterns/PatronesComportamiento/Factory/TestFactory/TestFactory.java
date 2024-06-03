package designPatterns.designPatterns.PatronesComportamiento.Factory.TestFactory;


import designPatterns.designPatterns.PatronesComportamiento.Factory.InterfaceFactory.EnemyFactoryService;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Enemy;

public class TestFactory {
    public static void main(String[] args) {
        EnemyFactoryService enemyFactoryService = new EnemyFactoryService();
        Enemy warrior = enemyFactoryService.createEnemy("warrior");
        Enemy magician = enemyFactoryService.createEnemy("magician");

        warrior.attack();
        magician.attack();
    }
}
