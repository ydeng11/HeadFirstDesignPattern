package FactoryMethod;

import java.util.List;

public class NyPineapplePizza extends Pizza {

  public NyPineapplePizza(String name, String dough, String sauce, List<String> toppings) {
    super(name, dough, sauce, toppings);
  }
}
