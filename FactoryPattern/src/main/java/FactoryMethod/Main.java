package FactoryMethod;

public class Main {
  public static void main(String[] args) {
    PizzaStore nyPizzaStore = new NyPizzaStore();
    PizzaStore caPizzaStore = new CaPizzaStore();

    nyPizzaStore.orderPizza("cheese");
    caPizzaStore.orderPizza("pineapple");
  }
}
