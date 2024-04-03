public class Espresso implements Beverage {
  @Override public int cost() {
    return 2;
  }

  @Override public String getDescription() {
    return "Espresso";
  }
}
