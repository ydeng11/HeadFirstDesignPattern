package FactoryMethod;

import java.util.List;

public class NyPizzaStore extends PizzaStore {
  @Override public Pizza createPizza(String name) {
    Pizza pizza;
    if (name.equals("cheese")) {
      pizza =  new NyCheesePizza("ny cheese pizza", "ny dough", "ny sauce", List.of("ny veggies"));
    } else if (name.equals("pineapple")) {
      pizza = new NyPineapplePizza("ny pineapple pizza", "ny pineapple dough", "ny pineapple sauce", List.of("ny veggies"));
    } else {
      throw new IllegalArgumentException("this store doesn't have this pizza " + name);
    }
    return pizza;
  }
}
