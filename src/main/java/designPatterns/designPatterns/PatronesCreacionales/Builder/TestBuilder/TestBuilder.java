package designPatterns.designPatterns.PatronesCreacionales.Builder.TestBuilder;

import designPatterns.designPatterns.PatronesCreacionales.Builder.Enemy;

public class TestBuilder {
    public static void main(String[] args) {
        Enemy enemy = Enemy.builder()
                .name("irina")
                .type("magician")
                .build();
        System.out.println(enemy);

    }
}
