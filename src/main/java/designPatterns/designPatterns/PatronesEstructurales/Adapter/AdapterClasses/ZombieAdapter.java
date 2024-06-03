package designPatterns.designPatterns.PatronesEstructurales.Adapter.AdapterClasses;

import designPatterns.designPatterns.PatronesEstructurales.Adapter.Entities.Zombie;
import designPatterns.designPatterns.PatronesEstructurales.Adapter.Interfaces.Enemy;

public class ZombieAdapter implements Enemy {

    private Zombie zombie;

    public ZombieAdapter() {
        this.zombie = new Zombie();
    }

    @Override
    public void attack() {
        int value = (int) (Math.random()*10);

        if(value % 2 == 0) zombie.bite();
        if(value % 2 != 0)zombie.hit();

    }

    @Override
    public void damage() {
        int value = (int) (Math.random()*10);

        if(value % 2 == 0) zombie.headDamage();
        if(value % 2 != 0)zombie.bodyDamage();

    }
}
