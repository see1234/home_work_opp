package HomeWork4.Weapons;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Sword extends Weapon {

    public Sword(int pointOfDamage) {
        super(pointOfDamage);
    }

    @Override
    public String toString() {
        return String.format("(Sword damage = %d)", pointOfDamage);
    }

    @Override
    public int damage() {
        return ThreadLocalRandom.current().nextInt(0, pointOfDamage);
    }
}
