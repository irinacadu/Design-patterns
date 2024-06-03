package designPatterns.designPatterns.PatronesEstructurales.Bridge.TestBridge;

import designPatterns.designPatterns.PatronesEstructurales.Bridge.Entities.Magician;
import designPatterns.designPatterns.PatronesEstructurales.Bridge.Entities.Warrior;
import designPatterns.designPatterns.PatronesEstructurales.Bridge.MagicianFighterImpl;
import designPatterns.designPatterns.PatronesEstructurales.Bridge.WarriorFighterImpl;

public class TestBridge {
    public static void main(String[] args) {
        System.out.println("============WARRIOR==============");
        Warrior warrior = new Warrior();
        warrior.attack();
        warrior.protect();
        warrior.setFighter(new MagicianFighterImpl());
        warrior.attack();
        warrior.protect();

        System.out.println("============MAGICIAN==============");
        Magician magician = new Magician();
        magician.attack();
        magician.protect();
        magician.setFighter(new WarriorFighterImpl());
        magician.attack();
        magician.protect();
    }
}
