package designPatterns.designPatterns.PatronesEstructurales.Composite;

import designPatterns.designPatterns.PatronesEstructurales.Composite.Entities.BaseItem;

public class Item extends BaseItem {

    public Item(String name, int value) {
        super(name, value);
    }

    @Override
    public void add(BaseItem baseItem) {
        System.out.println("no items allowed");
    }

    @Override
    public void delete(BaseItem baseItem) {
        System.out.println("no items allowed");
    }

    @Override
    public int getValue() {
        return value;
    }
}
