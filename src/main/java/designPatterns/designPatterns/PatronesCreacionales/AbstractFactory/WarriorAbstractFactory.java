package designPatterns.designPatterns.PatronesCreacionales.AbstractFactory;

import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Armors.HeavyArmor;
import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Interfaces.Armor;
import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Interfaces.Weapon;
import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Weapons.Axe;
import designPatterns.designPatterns.PatronesCreacionales.GeneralEntities.Enemy;
import designPatterns.designPatterns.PatronesCreacionales.GeneralEntities.Warrior;

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
