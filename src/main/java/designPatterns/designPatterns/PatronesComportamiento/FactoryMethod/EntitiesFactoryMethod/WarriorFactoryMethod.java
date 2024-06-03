package designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.EntitiesFactoryMethod;

import designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.AbstractFactoryMethod.EnemyFactoryMethodAbstract;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Enemy;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Warrior;

public class WarriorFactoryMethod extends EnemyFactoryMethodAbstract {

    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }
}
