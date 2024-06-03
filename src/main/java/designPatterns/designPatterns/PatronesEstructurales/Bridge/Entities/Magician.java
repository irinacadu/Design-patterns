package designPatterns.designPatterns.PatronesEstructurales.Bridge.Entities;

import designPatterns.designPatterns.PatronesEstructurales.Bridge.Fighter;
import designPatterns.designPatterns.PatronesEstructurales.Bridge.MagicianFighterImpl;

public class Magician extends Enemy  {

    public Magician() {
        setFighter(new MagicianFighterImpl());
    }
    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }


    public void attack() {
        System.out.println("Magician:");
        getFighter().attack();
    }


    public void protect() {
        System.out.println("Magician:");
        getFighter().protect();
    }

    @Override
    public Fighter getFighter() {
        return super.getFighter();
    }

    @Override
    public void setFighter(Fighter fighter) {
        super.setFighter(fighter);
    }
}
