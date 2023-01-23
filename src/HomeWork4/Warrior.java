// Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
package HomeWork4;

import HomeWork4.Weapons.Bow;
import HomeWork4.Weapons.Shields.Shield;

import java.util.List;

public class Warrior {
    private String name;
    private Shield shield;
    private int healthPoint;
    private List<Weaponable> weapon;
    
    public Warrior(String name, int healthPoint, List<Weaponable> weapon) {
        this.name = name;
        this.healthPoint = healthPoint;

        this.weapon = weapon;

    }
    
    public String getName() {
        return name;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public Weaponable getWeapon(Weaponable weapon) {
        for(Weaponable weaponable : this.weapon) {
            if(weaponable.hashCode() ==  weapon.hashCode()) {
                return weapon;
            }
        }
        return null;
    }
    public List<Weaponable> getWeapons() {

        return weapon;
    }
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return "Warrior [name = " + name + ", healthPoint = " + healthPoint + ", weapon = " + weapon + "]";
    }
}
