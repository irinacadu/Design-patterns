package designPatterns.designPatterns.PatronesEstructurales.Composite.Entities;

import java.util.List;

public abstract class BaseItem {

    protected String name;
    protected int value;

    protected List<BaseItem> items; // un item contiene elementos de su mismo tipo

    public BaseItem(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public abstract void add (BaseItem baseItem);
    public abstract void delete(BaseItem baseItem);

    public abstract int getValue();
}
