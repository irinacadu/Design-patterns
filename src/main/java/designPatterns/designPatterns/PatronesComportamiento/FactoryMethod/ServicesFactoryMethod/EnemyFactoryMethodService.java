package designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.ServicesFactoryMethod;


import designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.EntitiesFactoryMethod.EnemyFactoryMethod;
import designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.EntitiesFactoryMethod.MagicianFactoryMethod;
import designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.EntitiesFactoryMethod.WarriorFactoryMethod;

public class EnemyFactoryMethodService {

    public EnemyFactoryMethod createEnemy(String enemy){
        if(enemy.equals("warrior")) return new WarriorFactoryMethod();
        if (enemy.equals("magician")) return new MagicianFactoryMethod();
        return null;
    }
}
