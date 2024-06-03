package designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.TestAbstractFactory;

import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.EnemyAbstractFactory;
import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Interfaces.Armor;
import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.Interfaces.Weapon;
import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.MagicianAbstractFactory;
import designPatterns.designPatterns.PatronesCreacionales.AbstractFactory.WarriorAbstractFactory;
import designPatterns.designPatterns.PatronesCreacionales.GeneralEntities.Enemy;

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
