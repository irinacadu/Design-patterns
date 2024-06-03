package designPatterns.designPatterns.PatronesCreacionales.AbstractFactory;

import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Interfaces.Armor;
import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Interfaces.Weapon;
import designPatterns.designPatterns.PatronesCreacionales.GeneralEntities.Enemy;

public abstract class EnemyAbstractFactory {
    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();

}
