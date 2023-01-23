package HomeWork4.Weapons.Shields;

import HomeWork4.Weapons.Weapon;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class SuperShield extends Shield {


    public SuperShield(int defend) {
        super(defend);

    }

    @Override
    public int hashCode() {
        return Objects.hashCode("supershield" + defend);
    }

    @Override
    public String toString() {
        return "(SuperShield [defend=" + defend + "], " + "Damage = " + pointOfDamage + ")";
    }
}
