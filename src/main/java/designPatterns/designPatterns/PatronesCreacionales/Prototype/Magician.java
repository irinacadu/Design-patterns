package designPatterns.designPatterns.PatronesCreacionales.Prototype;

public class Magician extends Enemy {

    private int mana;

    public Magician(int health, int damage, int mana) {
        super(health, damage);
        this.mana = mana;
    }

    public Magician(Magician magician) {
        super(magician);

        if(magician!=null) setMana(getMana());
    }

    public Magician(Enemy enemy, int mana) {
        super(enemy);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public Enemy clone() {
        return new Magician(this);
    }

    @Override
    public String toString() {
        return "Magician{" +
                "mana=" + mana +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
