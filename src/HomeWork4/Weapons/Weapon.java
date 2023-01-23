package HomeWork4.Weapons;
import HomeWork4.Weaponable;

import java.util.Objects;

public abstract class Weapon implements Weaponable {
    protected int pointOfDamage;

    public Weapon(int pointOfDamage) {
        this.pointOfDamage = pointOfDamage;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(toString());
    }
}
