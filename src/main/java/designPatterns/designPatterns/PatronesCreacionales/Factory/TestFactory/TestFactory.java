package designPatterns.designPatterns.PatronesCreacionales.Factory.TestFactory;


import designPatterns.designPatterns.PatronesCreacionales.Factory.InterfaceFactory.EnemyFactoryService;
import designPatterns.designPatterns.PatronesCreacionales.GeneralEntities.Enemy;

public class TestFactory {
    public static void main(String[] args) {
        EnemyFactoryService enemyFactoryService = new EnemyFactoryService();
        Enemy warrior = enemyFactoryService.createEnemy("warrior");
        Enemy magician = enemyFactoryService.createEnemy("magician");

        warrior.attack();
        magician.attack();
    }
}
