package HomeWork2.Ex1;
import java.util.List;

public class Cat extends Animal implements Runnable{
  private int x;
  private int y;
  public Cat(String name, int x, int y) {
    super(name, 4, "Мяу");
    this.x = x;
    this.y = y;
  }


  @Override
  public int run_speed() {
    return 2;
  }
}
