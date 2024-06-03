package designPatterns.designPatterns.PatronesComportamiento.AbstractFactory;

import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Armors.HeavyArmor;
import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Interfaces.Armor;
import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Interfaces.Weapon;
import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Weapons.Axe;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Enemy;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Warrior;

public class WarriorAbstractFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new Axe();
    }
}
