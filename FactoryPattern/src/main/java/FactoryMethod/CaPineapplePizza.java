package FactoryMethod;

import java.util.List;

public class CaPineapplePizza extends Pizza {
  public CaPineapplePizza(String name, String dough, String sauce, List<String> toppings) {
    super(name, dough, sauce, toppings);
  }
}
