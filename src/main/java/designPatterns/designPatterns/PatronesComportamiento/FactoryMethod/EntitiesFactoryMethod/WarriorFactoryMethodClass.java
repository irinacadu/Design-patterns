package designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.EntitiesFactoryMethod;

import designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.FactoryMethod.EnemyFactoryMethodAbstractClass;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Enemy;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Warrior;

public class WarriorFactoryMethodClass extends EnemyFactoryMethodAbstractClass {

    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }
}
