package designPatterns.designPatterns.PatronesCreacionales.Factory.InterfaceFactory;


import designPatterns.designPatterns.PatronesCreacionales.GeneralEntities.Enemy;
import designPatterns.designPatterns.PatronesCreacionales.GeneralEntities.Magician;
import designPatterns.designPatterns.PatronesCreacionales.GeneralEntities.Warrior;

public class EnemyFactoryService {

    public Enemy createEnemy(String enemy) {
        if (enemy.equals("warrior")) return new Warrior();
        if (enemy.equals("magician")) return new Magician();
        return null;
    }
}
