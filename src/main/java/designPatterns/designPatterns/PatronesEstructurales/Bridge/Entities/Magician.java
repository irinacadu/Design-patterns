package designPatterns.designPatterns.PatronesEstructurales.Bridge.Entities;

import designPatterns.designPatterns.PatronesEstructurales.Bridge.Fighter;

public class Magician extends Enemy  {
    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }


    public void attack() {
        System.out.println("Magician attack!!");
    }


    public void protect() {
        System.out.println("Warrior attack!!");
    }
}
