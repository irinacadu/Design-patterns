package designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.EntitiesFactoryMethod;

import designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.FactoryMethod.EnemyFactoryMethodAbstractClass;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Enemy;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Magician;

public class MagicianFactoryMethodClass extends EnemyFactoryMethodAbstractClass {
    @Override
    public Enemy createEnemy() {
        return new Magician();
    }

}
