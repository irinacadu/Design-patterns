package designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.EntitiesFactoryMethod;

import designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.AbstractFactoryMethod.EnemyFactoryMethodAbstract;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Enemy;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Magician;

public class MagicianFactoryMethod extends EnemyFactoryMethodAbstract {
    @Override
    public Enemy createEnemy() {
        return new Magician();
    }

}
