package designPatterns.designPatterns.PatronesComportamiento.Factory.ServicesFactory;


import designPatterns.designPatterns.PatronesComportamiento.Factory.EntitiesFactory.EnemyFactory;
import designPatterns.designPatterns.PatronesComportamiento.Factory.EntitiesFactory.MagicianFactory;
import designPatterns.designPatterns.PatronesComportamiento.Factory.EntitiesFactory.WarriorFactory;

public class EnemyFactoryService {

    public EnemyFactory createEnemy(String enemy){
        if(enemy.equals("warrior")) return new WarriorFactory();
        if (enemy.equals("magician")) return new MagicianFactory();
        return null;
    }
}
