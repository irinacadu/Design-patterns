package designPatterns.designPatterns.PatronesComportamiento.AbstractFactory;

import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Armors.Robe;
import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Interfaces.Armor;
import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Interfaces.Weapon;
import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Weapons.Cane;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Enemy;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Magician;

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
