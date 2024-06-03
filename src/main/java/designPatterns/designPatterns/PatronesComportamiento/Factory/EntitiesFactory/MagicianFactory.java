package designPatterns.designPatterns.PatronesComportamiento.Factory.EntitiesFactory;


public class MagicianFactory implements EnemyFactory {
    @Override
    public void attack() {
        System.out.println("Magician attack!!");
    }
}
