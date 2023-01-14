package HomeWork1;

public class Milk extends Product {
    private int acidity;
    public Milk(int acidity) {
        super("Молоко", 100);
        this.acidity = acidity;
    }

    @Override
    public String toString() {
        return String.format("%s Кислотность: %d", super.toString(), this.acidity);
    }
}
