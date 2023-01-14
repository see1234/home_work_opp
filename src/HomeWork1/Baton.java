package HomeWork1;

public class Baton extends Product {
    private double calories;
    public Baton(String name, double cost, double calories) {
        super(name, cost);
        this.calories = calories;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " calories: %f",this.calories);
    }

    public double getCalories() {
        return calories;
    }
}
