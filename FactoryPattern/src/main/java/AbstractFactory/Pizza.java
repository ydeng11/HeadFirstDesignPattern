package AbstractFactory;

import java.util.List;

public abstract class Pizza {
  private String name;
  private IngredientFactory ingredientFactory;
  private Dough dough;
  private Sauce sauce;
  private Cheese cheese;
  private Toppings toppings;

  public Pizza(IngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  void setName(String name) {
    this.name = name;
  }
  void prepare() {
    this.dough = ingredientFactory.provideDough();
    this.sauce = ingredientFactory.provideSauce();
    this.cheese = ingredientFactory.provideCheese();
    this.toppings = ingredientFactory.provideToppings();
    System.out.println(String.format("Prepare the pizza using dough %s, sauce %s, cheese %s, toppings %s",
        this.dough.getName(), this.sauce.getName(), this.cheese.getName(), this.toppings.getName()));
  }

  void bake() {
    System.out.println("Bake 20 minutes");
  }

  void box() {
    System.out.println("Box the pizza");
  }
}
