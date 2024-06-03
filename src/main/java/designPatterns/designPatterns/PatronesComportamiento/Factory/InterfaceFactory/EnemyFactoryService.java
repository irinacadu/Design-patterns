package designPatterns.designPatterns.PatronesComportamiento.Factory.InterfaceFactory;


import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Enemy;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Magician;
import designPatterns.designPatterns.PatronesComportamiento.GeneralEntities.Warrior;

public class EnemyFactoryService {

    public Enemy createEnemy(String enemy) {
        if (enemy.equals("warrior")) return new Warrior();
        if (enemy.equals("magician")) return new Magician();
        return null;
    }
}
