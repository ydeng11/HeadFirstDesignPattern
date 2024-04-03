package FactoryMethod;

import java.util.List;

public class CaCheesePizza extends Pizza {
  public CaCheesePizza(String name, String dough, String sauce, List<String> toppings) {
    super(name, dough, sauce, toppings);
  }
}
