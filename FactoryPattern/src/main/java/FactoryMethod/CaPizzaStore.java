package FactoryMethod;

import java.util.List;

public class CaPizzaStore extends PizzaStore {
  @Override public Pizza createPizza(String name) {
    Pizza pizza;
    if (name.equals("cheese")) {
      pizza =  new CaCheesePizza("ca cheese pizza", "ca dough", "ca sauce", List.of("ca veggies"));
    } else if (name.equals("pineapple")) {
      pizza = new CaPineapplePizza("ca pineapple pizza", "ca pineapple dough", "ca pineapple sauce", List.of("ca veggies"));
    } else {
      throw new IllegalArgumentException("this store doesn't have this pizza " + name);
    }
    return pizza;
  }
}
