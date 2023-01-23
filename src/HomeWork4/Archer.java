package HomeWork4;

import HomeWork4.Weapons.Bow;

import java.util.List;

public class Archer extends Warrior {
    private Bow bow;
    public Archer(String name, int healthPoint, Bow bow) {
        super(name, healthPoint, List.of(bow));
        this.bow = bow;
    }

    @Override
    public String toString() {
        return " Archer, " + super.toString();
    }

    public int shotRange() {
        return ((Bow) getWeapon(bow)).getRange();
    }
    
}
