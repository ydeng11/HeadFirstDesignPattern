public abstract class AbstractCondimentBeverage implements Beverage {
  Beverage beverage;

  public AbstractCondimentBeverage(Beverage beverage) {
    this.beverage = beverage;
  }

  abstract public int cost();
  abstract public String getDescription();
}
