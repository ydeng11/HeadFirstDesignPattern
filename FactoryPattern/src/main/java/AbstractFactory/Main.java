package AbstractFactory;

public class Main {
  public static void main(String[] args) {
    NyIngredientFactory ingredientFactory = new NyIngredientFactory();
    PizzaStore nyPizzaStore = new NyPizzaStore(ingredientFactory);
    nyPizzaStore.orderPizza("cheese");
  }
}
