package HomeWork2.Ex1;

public abstract class Animal implements SpeakInterface {
    protected String name;
    protected int laps;
    protected String sound;

    public String getSound() {
        return sound;
    }
    public Animal(String name, int laps, String sound) {
        this.name = name;
        this.laps = laps;
        this.sound = sound;
    }

    public String say() {
        return sound;
    }
    @Override
    public String toString() {
        return String.format("Animal is type %s", getClass().getName());
    }
}
