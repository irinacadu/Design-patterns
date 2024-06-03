package designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.TestAbstractFactory;

import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.EnemyAbstractFactory;
import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Interfaces.Armor;
import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.Interfaces.Weapon;
import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.MagicianAbstractFactory;
import designPatterns.designPatterns.PatronesComportamiento.AbstractFactory.WarriorAbstractFactory;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Enemy;

public class TestAbstractFactory {

    public static void main(String[] args) {
        EnemyAbstractFactory abstractFactory = new WarriorAbstractFactory();
        Enemy warrior = abstractFactory.createEnemy();
        Armor heavyArmor = abstractFactory.createArmor();
        Weapon axe = abstractFactory.createWeapon();

        warrior.attack();
        heavyArmor.protect();
        axe.damage();

        abstractFactory = new MagicianAbstractFactory();
        Enemy magician = abstractFactory.createEnemy();
        Armor robe = abstractFactory.createArmor();
        Weapon cane = abstractFactory.createWeapon();

        magician.attack();
        robe.protect();
        cane.damage();
    }
}
