package designPatterns.designPatterns.PatronesComportamiento.AbstractFactory;

import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Interfaces.Armor;
import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Interfaces.Weapon;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Enemy;

public abstract class EnemyAbstractFactory {
    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();

}
