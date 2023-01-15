package HomeWork2.Ex1;
public class Duck extends Animal implements Runnable, Flyable, Swimably {
    public Duck(String name) {
        super(name, 4, "Кря");
    }

    @Override
    public int speed_fly() {
        return 500;
    }

    @Override
    public int run_speed() {
        return 3;
    }

    @Override
    public int getSwimSpeed() {
        return 4354;
    }

    @Override
    public Class getClasses() {
        return getClass();
    }
}
