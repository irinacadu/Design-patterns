package designPatterns.designPatterns.PatronesEstructurales.Bridge;

import designPatterns.designPatterns.PatronesEstructurales.Bridge.Fighter;

public class MagicianFighterImpl implements Fighter {
    @Override
    public void attack() {
        System.out.println("Magician attack!");

    }

    @Override
    public void protect() {
        System.out.println("Magician attack!");
    }
}
