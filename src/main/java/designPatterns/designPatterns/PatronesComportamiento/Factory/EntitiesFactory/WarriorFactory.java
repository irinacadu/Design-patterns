package designPatterns.designPatterns.PatronesComportamiento.Factory.EntitiesFactory;


public class WarriorFactory implements EnemyFactory {
    @Override
    public void attack() {
        System.out.println("Warrior attack!!");
    }
}
