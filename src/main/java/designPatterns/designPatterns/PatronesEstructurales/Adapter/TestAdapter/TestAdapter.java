package designPatterns.designPatterns.PatronesEstructurales.Adapter.TestAdapter;

import designPatterns.designPatterns.PatronesEstructurales.Adapter.ZombieAdapter;

public class TestAdapter {
    public static void main(String[] args) {
        ZombieAdapter zombieAdapter = new ZombieAdapter();

        zombieAdapter.attack();
        zombieAdapter.damage();
    }


}
