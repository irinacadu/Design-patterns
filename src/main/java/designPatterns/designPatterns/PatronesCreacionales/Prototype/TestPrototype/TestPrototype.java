package designPatterns.designPatterns.PatronesCreacionales.Prototype.TestPrototype;

import designPatterns.designPatterns.PatronesCreacionales.Prototype.Enemy;

public class TestPrototype {

    public static void main(String[] args) {
        // Tenemos una variable con tres nombres. Con new enemy estoy guardando un espacio en memoria solamente para enemy1.
        // De esta manera estaremos copiando el mismo objeto varias veces, pero apuntaría al mismo sitio. Por lo tanto si cambiamos el valor de un atributo del enemy2 se cambiará en el 1.
        Enemy enemy1 = new Enemy(100,100);
        Enemy enemy2 = enemy1;
        Enemy enemy3 = enemy1;

        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println(enemy2);

        //Para poder copiarlo sin que afecte a

        System.out.println("=====================================================");

        enemy2.setHealth(0);
        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println(enemy3);

    }
}
