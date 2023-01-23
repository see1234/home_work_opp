package HomeWork4;

import HomeWork4.Weapons.Shields.Shield;
import HomeWork4.Weapons.Sword;

import java.util.List;
/*
На основе работы на уроке.
Создать класс щита, разработать разные типы щитов, добавить в семейство классов Warriors обобщения в виде щитов.
Реструктуризировать код в конечных классах семейства Warriors.
Добавить метод определения минимального щита в команде.
* Продумать, как можно сделать воина без щита.
 */

public class Shieldman extends Warrior {

    public Shieldman(String name, int healthPoint, Sword sword, Shield shield) {
        super(name, healthPoint, List.of(shield, sword));
    }

    @Override
    public String toString() {
        return "Shieldman, " + super.toString();
    }

}
