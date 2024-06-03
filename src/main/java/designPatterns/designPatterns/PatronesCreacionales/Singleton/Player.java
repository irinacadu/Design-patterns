package designPatterns.designPatterns.PatronesCreacionales.Singleton;

public class Player {

    private String name;

    //con volatile estamos guardando la variable en memoria RAM y no en memoria caché asi todos los hilos apuntarán a la misma posición de memoria que será compartida.
    private static volatile Player player;

    private Player (String name){
        this.name = name;
    }

    public static Player getPlayer(String name){
        if (player == null) player = new Player(name);

        return player;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
