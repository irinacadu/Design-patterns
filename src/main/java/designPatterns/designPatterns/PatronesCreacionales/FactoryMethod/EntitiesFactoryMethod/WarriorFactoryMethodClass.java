package designPatterns.designPatterns.PatronesCreacionales.FactoryMethod.EntitiesFactoryMethod;

import designPatterns.designPatterns.PatronesCreacionales.FactoryMethod.FactoryMethod.EnemyFactoryMethodAbstractClass;
import designPatterns.designPatterns.PatronesCreacionales.GeneralEntities.Enemy;
import designPatterns.designPatterns.PatronesCreacionales.GeneralEntities.Warrior;

public class WarriorFactoryMethodClass extends EnemyFactoryMethodAbstractClass {

    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }
}
