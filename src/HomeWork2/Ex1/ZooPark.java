package HomeWork2.Ex1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZooPark {
    private Radio radio;
    public static int id;
    private HashMap<Integer, Animal> animalHashMap;

    public ZooPark() {
        this.animalHashMap = new HashMap<Integer, Animal>();
        this.radio = new Radio("RADIO");
        id = 0;

    }

    public Radio getRadio() {
        return radio;
    }

    public List<SpeakInterface> getSpeakables() {
        List<SpeakInterface> answers = new ArrayList<SpeakInterface>();
        for(Animal animal : this.animalHashMap.values()) {
            answers.add(animal);
        }
        answers.add(radio);
        return answers;
    }

    public void addAnimal(Animal animal) {
        this.animalHashMap.put(id, animal);
        id++;
    }
    public List<Runnable> getRunner() {
        List<Runnable> runnerList = new ArrayList<Runnable>();
        for(Animal animal : animalHashMap.values()) {
            if(animal instanceof Runnable) {
                runnerList.add((Runnable) animal);
            }
        }
        return runnerList;
    }
    public int getChampionsofSpeed() {
        int speed = 0;

        for(Animal animal : animalHashMap.values()) {
            if(animal instanceof Runnable) {
                if(speed <= ((Runnable) animal).run_speed()) {
                    speed = ((Runnable) animal).run_speed();
                }
            }
        }
        return speed;
    }
    public int getChampionOfFly() {
        int speed = 0;

        for(Animal animal : animalHashMap.values()) {
            if(animal instanceof Flyable) {
                if(speed <= ((Flyable) animal).speed_fly()) {
                    speed = ((Flyable) animal).speed_fly();
                }
            }
        }
        return speed;
    }
    public List<Flyable> getFlyable() {
        List<Flyable> flyableList = new ArrayList<Flyable>();
        for(Animal animal : animalHashMap.values()) {
            if(animal instanceof Flyable) {
                flyableList.add((Flyable) animal);
            }
        }
        return flyableList;
    }
    public List<Swimably> getSwimably() {
        List<Swimably> swimablyList = new ArrayList<Swimably>();
        for(Animal animal : animalHashMap.values()) {
            if(animal instanceof Swimably) {
                swimablyList.add((Swimably) animal);
            }
        }
        return swimablyList;
    }
    public HashMap<Integer, Animal> getAnimalHashMap() {
        return animalHashMap;
    }
}
