package designPatterns.designPatterns.PatronesComportamiento.Factory;

public class Magician implements Enemy{
    @Override
    public void attack() {
        System.out.println("Magician attack!!");
    }
}
