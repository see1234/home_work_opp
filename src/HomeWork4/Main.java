// Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
// Создать интерфейс Weapon с методом damage(), который будет показывать наносимый урон
// На основе класса Warrior создать различные типы воинов, например, лучник, меченосец, ополченец и т.п.
// У лучника добавить поле расстояние поражения. 
// Создать различные виды вооружения, например, меч, лук, лопата.
// Обеспечить, чтобы определенный тип воина мог нести только определенной оружие
// Создать класс командира

package HomeWork4;

import HomeWork4.Weapons.Bow;
import HomeWork4.Weapons.Shields.Shield;
import HomeWork4.Weapons.Shields.SuperShield;
import HomeWork4.Weapons.Sword;

import java.util.List;

/*

  На основе работы на уроке. Создать класс щита, + Shieldman
  разработать разные типы щитов, + SuperShield, Shield
  добавить в семейство классов Warriors обобщения в виде щитов. + Это теперь не нужно так как можно добавлять и убирать;
  Реструктуризировать код в конечных классах семейства Warriors. + Сделал ArrayList<Weaponable>
  Добавить метод определения минимального щита в команде. 54, 64 - Main.java
* Продумать, как можно сделать воина без щита. Изменен Warrior убран abstract, теперь ему можно добавлять оружки убирать и тд
 */
public class Main {
    public static void main(String[] args) {
        Team <Swordman> team1 = new Team<>();
        team1.addWarriorToTeam(new Swordman("Vasya", 250, new Sword(25)))
        .addWarriorToTeam(new Swordman("John", 200, new Sword(50)));

        for (Swordman swordman : team1) {
            System.out.println(swordman);
        }

        Team <Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Kolya", 150, new Bow(100, 50)))
        .addWarriorToTeam(new Archer("Paul", 200, new Bow(75, 70)));

        for (Archer person : team2) {
            System.out.println(person);
        }

        System.out.println(team1.maxTeamRange());
        System.out.println(team2.maxTeamRange());

        Team <Shieldman> team3 = new Team<>();
        team3.addWarriorToTeam(new Shieldman("Kolya", 150, new Sword(75), new Shield(30)))
                .addWarriorToTeam(new Shieldman("Paul", 200, new Sword(75), new SuperShield(75)));
        for (Shieldman person : team3) {
            System.out.println(person);
        }
        System.out.println("Минимальный щит TEAM#3:" + team3.minTeamShield());
        Team  team4 = new Team<>();
        team4.addWarriorToTeam(new Swordman("Kolya", 150, new Sword(30)))
                .addWarriorToTeam(new Shieldman("Paul", 200, new Sword(75), new SuperShield(75)))
                        .addWarriorToTeam(new Warrior("Pavel", 200, List.of(new Sword(75), new SuperShield(125))));

        for (Object person : team4) {
            System.out.println(person);
        }

        System.out.println("Минимальный щит TEAM#4:" + team4.minTeamShield());
    }
    
    
}
