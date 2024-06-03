package designPatterns.designPatterns.PatronesEstructurales.Decorator.TestDecorator;

import designPatterns.designPatterns.PatronesCreacionales.Prototype.Warrior;
import designPatterns.designPatterns.PatronesEstructurales.Decorator.DecoratorClasses.AssassinEnemyDecorator;
import designPatterns.designPatterns.PatronesEstructurales.Decorator.DecoratorClasses.MagicianEnemyDecorator;
import designPatterns.designPatterns.PatronesEstructurales.Decorator.DecoratorClasses.WarriorEnemyDecorator;
import designPatterns.designPatterns.PatronesEstructurales.Decorator.Entities.Enemy;
import designPatterns.designPatterns.PatronesEstructurales.Decorator.Species.Elf;
import designPatterns.designPatterns.PatronesEstructurales.Decorator.Species.Human;

public class TestDecorator {
    public static void main(String[] args) {
        System.out.println("===========Human warrior=========");
        Enemy humanWarrior = new WarriorEnemyDecorator(new Human());
        humanWarrior.attack();

        System.out.println("=======Human warrior magician============");
        Enemy humanWarriorMagician = new MagicianEnemyDecorator(new WarriorEnemyDecorator(new Human()));
        humanWarriorMagician.attack();

        System.out.println("=========Elf magician warrior assasin==========");
        Enemy elfMagicianWarriorEnemy = new MagicianEnemyDecorator(
                new WarriorEnemyDecorator(
                        new AssassinEnemyDecorator(
                                new Elf())));

        elfMagicianWarriorEnemy.attack();
    }
}
