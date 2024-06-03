package designPatterns.designPatterns.PatronesComportamiento.Factory;

public class Warrior implements Enemy{
    @Override
    public void attack() {
        System.out.println("Warrior attack!!");
    }
}
