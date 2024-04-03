package FactoryMethod;

import java.util.List;

public abstract class Pizza {
  private String name;
  private String dough;
  private String sauce;
  private List<String> toppings;

  public Pizza(String name, String dough, String sauce, List<String> toppings) {
    this.name = name;
    this.dough = dough;
    this.sauce = sauce;
    this.toppings = toppings;
  }

  void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Using dough " + dough);
    System.out.println("Using sauce " + sauce);
    System.out.println("Using toppings " + toppings);
  }

  void bake() {
    System.out.println("bake for 20 minutes");
  }

  void box() {
    System.out.println("ready to box");
  }

  String getName() {
    return name;
  }
}
