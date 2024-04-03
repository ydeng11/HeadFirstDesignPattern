public class Milk extends AbstractCondimentBeverage {
  Beverage beverage;
  public Milk(Beverage beverage) {
    super(beverage);
    this.beverage = beverage;
  }

  @Override public int cost() {
    return beverage.cost() + 1;
  }

  @Override public String getDescription() {
    return beverage.getDescription() + ", Milk";
  }
}
