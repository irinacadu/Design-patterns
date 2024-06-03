package designPatterns.designPatterns.PatronesCreacionales.FactoryMethod.EntitiesFactoryMethod;

import designPatterns.designPatterns.PatronesCreacionales.FactoryMethod.FactoryMethod.EnemyFactoryMethodAbstractClass;
import designPatterns.designPatterns.PatronesCreacionales.GeneralEntities.Enemy;
import designPatterns.designPatterns.PatronesCreacionales.GeneralEntities.Magician;

public class MagicianFactoryMethodClass extends EnemyFactoryMethodAbstractClass {
    @Override
    public Enemy createEnemy() {
        return new Magician();
    }

}
