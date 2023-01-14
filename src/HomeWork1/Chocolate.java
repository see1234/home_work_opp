package HomeWork1;

public class Chocolate extends Product {
    private int milkiness;
    /**
     *@param milkiness Молочность
     */
    public Chocolate(String name, int milkiness) {
        super(name, 50);
        this.milkiness = milkiness;
    }

    @Override
    public String toString() {
        return String.format("%s Молочность: %d", super.toString(), this.milkiness);
    }
}
