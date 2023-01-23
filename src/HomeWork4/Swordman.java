package HomeWork4;

import HomeWork4.Weapons.Sword;

import java.util.List;
/*
На основе работы на уроке.
Создать класс щита, разработать разные типы щитов, добавить в семейство классов Warriors обобщения в виде щитов.
Реструктуризировать код в конечных классах семейства Warriors.
Добавить метод определения минимального щита в команде.
* Продумать, как можно сделать воина без щита.
 */

public class Swordman extends Warrior {

    public Swordman(String name, int healthPoint, Sword sword) {
        super(name, healthPoint, List.of(sword));
    }

    @Override
    public String toString() {
        return "Swordman, " + super.toString();
    }
    
}
