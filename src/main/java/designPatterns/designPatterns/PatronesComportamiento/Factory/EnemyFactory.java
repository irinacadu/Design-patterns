package designPatterns.designPatterns.PatronesComportamiento.Factory;

public class EnemyFactory {

    public Enemy createEnemy(String enemy){
        if(enemy.equals("warrior")) return new Warrior();
        if (enemy.equals("magician")) return new Magician();
        return null;
    }
}
