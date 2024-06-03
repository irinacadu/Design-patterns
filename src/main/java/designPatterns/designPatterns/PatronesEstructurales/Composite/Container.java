package designPatterns.designPatterns.PatronesEstructurales.Composite;

import designPatterns.designPatterns.PatronesEstructurales.Composite.Entities.BaseItem;

import java.util.ArrayList;

public class Container extends BaseItem {

    public Container(String name) {
        super(name, 0);
        items = new ArrayList<>();
    }

    @Override
    public void add(BaseItem item) {

        items.add(item);

    }

    @Override
    public void delete(BaseItem item) {

        items.remove(item);

    }

    /**
     * Función recursiva
     * @return
     */
    @Override
    public int getValue() {
        int result = 0;

        for(BaseItem item : items) result += item.getValue();
        return result;
    }
}
