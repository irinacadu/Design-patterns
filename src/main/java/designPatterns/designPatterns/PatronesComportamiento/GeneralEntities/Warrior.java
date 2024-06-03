package designPatterns.designPatterns.PatronesComportamiento.GeneralEntities;



public class Warrior implements Enemy {
    @Override
    public void attack() {
        System.out.println("Warrior attack!!");
    }
}
