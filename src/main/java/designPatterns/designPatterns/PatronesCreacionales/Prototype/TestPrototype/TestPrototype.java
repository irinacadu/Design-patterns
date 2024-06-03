package designPatterns.designPatterns.PatronesCreacionales.Prototype.TestPrototype;

import designPatterns.designPatterns.PatronesCreacionales.Prototype.Enemy;
import designPatterns.designPatterns.PatronesCreacionales.Prototype.Magician;
import designPatterns.designPatterns.PatronesCreacionales.Prototype.Warrior;

public class TestPrototype {

    public static void main(String[] args) {
        System.out.println("========================Warrior con clone()================");

        Warrior warrior1 = new Warrior(100,100,100);
        Warrior warrior2 = (Warrior) warrior1.clone();

        System.out.println(warrior1);
        System.out.println(warrior2);

        System.out.println("========================Matamos al warrior2================");
        warrior2.setHealth(0);
        System.out.println(warrior1);
        System.out.println(warrior2);

        System.out.println("========================Magician con clone()================");

        Magician magician1 = new Magician(100,100,100);
        Magician magician2 = (Magician) magician1.clone();

        System.out.println(magician1);
        System.out.println(magician2);

        System.out.println("========================Matamos al warrior2================");
        magician2.setHealth(0);
        System.out.println(magician1);
        System.out.println(magician2);

    }
}
