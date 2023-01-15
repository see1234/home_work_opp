package HomeWork2.Ex1;
public class Dog extends Animal implements Runnable{
    private int x;
    private int y;
    public Dog(String name, int x, int y) {
        super(name, 4, "Гав");
        this.x = x;
        this.y = y;
    }

    @Override
    public int run_speed() {
        return 43;
    }
}
