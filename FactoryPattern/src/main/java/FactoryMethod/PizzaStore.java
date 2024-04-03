package FactoryMethod;

public abstract class PizzaStore {
  Pizza orderPizza(String name) {
    Pizza pizza = createPizza(name);

    pizza.prepare();
    pizza.bake();
    pizza.box();
    return pizza;
  }
  abstract Pizza createPizza(String name);
}
