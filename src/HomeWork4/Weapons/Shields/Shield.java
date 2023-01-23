package HomeWork4.Weapons.Shields;

import HomeWork4.Weapons.Weapon;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Shield extends Weapon {
    protected int defend;

    public Shield(int defend) {
        super(1);
        this.defend = defend;
    }

    public int getDefend() {
        return defend;
    }

    @Override
    public int damage() {
        return pointOfDamage;
    }

    @Override
    public String toString() {
        return "(Shield [defend=" + defend + "], " + "Damage = " + pointOfDamage + ")";
    }
}
