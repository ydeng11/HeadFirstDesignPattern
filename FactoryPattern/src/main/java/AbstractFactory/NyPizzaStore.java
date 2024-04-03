package AbstractFactory;

public class NyPizzaStore extends PizzaStore {
  NyIngredientFactory ingredientFactory;

  public NyPizzaStore(NyIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override Pizza createPizza(String name) {
    Pizza pizza;
    if (name.equals("cheese")) {
      pizza = new NyCheesePizza(ingredientFactory);
    } else {
      throw new IllegalArgumentException("This factory doesn't produce this pizza " + name);
    }
    return pizza;
  }
}
