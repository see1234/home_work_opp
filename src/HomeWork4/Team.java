package HomeWork4;

import HomeWork4.Weapons.Shields.Shield;

import java.util.*;

public class Team <E extends Warrior> implements Iterable<E>{
    private List<E> team = new ArrayList<>();
    
    public Team<E> addWarriorToTeam(E person) {
        team.add(person);
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }

    public int maxTeamRange() {
        int maxRange = 0;
        for (E item : team) {
            if(item instanceof Archer) {
                if(((Archer)item).shotRange() > maxRange) maxRange = ((Archer)item).shotRange();
            }
        }
        return maxRange;
    }
    public int minTeamShield() {
        int minDefend = Integer.MAX_VALUE;
        for (E item : team) {
            for(Weaponable weapon : item.getWeapons()) {
                if(weapon instanceof Shield) {

                      if(minDefend > ((Shield) weapon).getDefend()) {
                          minDefend = ((Shield) weapon).getDefend();
                      }

                }
            }
        }
        return minDefend;
    }
}
