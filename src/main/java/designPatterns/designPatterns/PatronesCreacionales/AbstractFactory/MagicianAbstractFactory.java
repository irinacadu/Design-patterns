package designPatterns.designPatterns.PatronesCreacionales.AbstractFactory;

import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Armors.Robe;
import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Interfaces.Armor;
import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Interfaces.Weapon;
import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Weapons.Cane;
import designPatterns.designPatterns.PatronesCreacionales.GeneralEntities.Enemy;
import designPatterns.designPatterns.PatronesCreacionales.GeneralEntities.Magician;

public class MagicianAbstractFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Magician();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new Cane();
    }
}
