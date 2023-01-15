package HomeWork2.Ex1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ZooPark zooPark = new ZooPark();
        zooPark.addAnimal(new Cat("Кошак", 10, 20));
        zooPark.addAnimal(new Dog("Дог", 3, 4));
        zooPark.addAnimal(new Duck("утка"));
        /*or(Map.Entry<Integer, Animal> animalEntry : zooPark.getAnimalHashMap().entrySet()) {
            Animal animal = animalEntry.getValue();
            int id = animalEntry.getKey();
            String say = animal.say();
            System.out.printf("ID: %d (%s) %s\n", id,animal, say);
        }
        for(Runnable runnable : zooPark.getRunner()) {
            System.out.println(runnable.run_speed());
        }
        for(SpeakInterface speakInterface : zooPark.getSpeakables()) {
            System.out.println(speakInterface.say());
        }
        System.out.println("max speed of run: " + zooPark.getChampionsofSpeed());
        System.out.println("max speed of fly: " + zooPark.getChampionOfFly());
        for(Flyable flyers : zooPark.getFlyable()) {
            System.out.printf("speed of FLY: %d", flyers.speed_fly());
        } */
        for(Swimably swimably : zooPark.getSwimably()) {
            System.out.printf("%s speed of Swim: %d", swimably.getClasses().getSimpleName(), swimably.getSwimSpeed());
        }
    }


}
