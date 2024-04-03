package FactoryMethod;

import java.util.List;

public class NyCheesePizza extends Pizza {

  public NyCheesePizza(String name, String dough, String sauce, List<String> toppings) {
    super(name, dough, sauce, toppings);
  }
}
