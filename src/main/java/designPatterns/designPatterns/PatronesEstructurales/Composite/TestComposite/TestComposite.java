package designPatterns.designPatterns.PatronesEstructurales.Composite.TestComposite;

import designPatterns.designPatterns.PatronesEstructurales.Composite.Container;
import designPatterns.designPatterns.PatronesEstructurales.Composite.Entities.BaseItem;
import designPatterns.designPatterns.PatronesEstructurales.Composite.Item;

public class TestComposite {

    public static void main(String[] args) {
        BaseItem inventory = new Container("Inventory");
        BaseItem bagCoins = new Container("Bag Coins");
        BaseItem bagPotions = new Container("Bag Potions");

        BaseItem coins = new Item("Coins",3);
        bagCoins.add(coins);
        BaseItem magicPotion = new Item("Magic potion",3);
        BaseItem healthPotion = new Item("Health potion",3);
        bagPotions.add(magicPotion);
        bagPotions.add(healthPotion);

        BaseItem blade = new Item("Blade",3);
        BaseItem shield = new Item("Shield",3);

        inventory.add(bagPotions);
        inventory.add(bagCoins);
        inventory.add(blade);
        inventory.add(shield);

        System.out.println("The value of the inventory is: "+inventory.getValue());
    }
}
