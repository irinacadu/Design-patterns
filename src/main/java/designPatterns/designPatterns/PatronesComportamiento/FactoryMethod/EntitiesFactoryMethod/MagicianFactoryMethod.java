package designPatterns.designPatterns.PatronesComportamiento.FactoryMethod.EntitiesFactoryMethod;

public class MagicianFactoryMethod implements EnemyFactoryMethod {
    @Override
    public void attack() {
        System.out.println("Magician attack!!");
    }
}
