package HomeWork4.Weapons;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Bow extends Weapon {
    private int range;

    public Bow(int pointOfDamage, int range) {
        super(pointOfDamage);
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    @Override
    public int damage() {
        return ThreadLocalRandom.current().nextInt(0, pointOfDamage);
    }

    @Override
    public String toString() {
        return "(Bow [range=" + range + "], " + "Damage = " + pointOfDamage + ")";
    }
}
