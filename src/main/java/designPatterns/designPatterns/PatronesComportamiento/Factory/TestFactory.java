package designPatterns.designPatterns.PatronesComportamiento.Factory;

public class TestFactory {
    public static void main(String[] args) {
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy warrior = enemyFactory.createEnemy("warrior");
        Enemy magician = enemyFactory.createEnemy("magician");

        warrior.attack();
        magician.attack();
    }
}
