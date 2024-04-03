public class Tea extends AbstractCondimentBeverage {
  Beverage beverage;

  public Tea(Beverage beverage) {
    super(beverage);
    this.beverage = beverage;
  }

  @Override public int cost() {
    return beverage.cost() + 2;
  }

  @Override public String getDescription() {
    return beverage.getDescription() + ", Tea";
  }
}
