package AbstractFactory;


public abstract class PizzaStore {
  Pizza orderPizza(String name) {
    System.out.println("Start making " + name);
    Pizza pizza = createPizza(name);
    pizza.setName(name);
    pizza.prepare();
    pizza.bake();
    pizza.box();
    return pizza;
  }

  abstract Pizza createPizza(String name);

}
