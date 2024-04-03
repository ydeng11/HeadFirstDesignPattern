package AbstractFactory;

import java.util.List;

public class NyIngredientFactory implements IngredientFactory {
  private Dough dough = new CommonDough();
  private Sauce sauce = new CommonSauce();
  private Cheese cheese = new CommonCheese();
  private Toppings toppings = new CommonToppings();

  @Override public Dough provideDough() {
    return dough;
  }

  @Override public Sauce provideSauce() {
    return sauce;
  }

  @Override public Cheese provideCheese() {
    return cheese;
  }

  @Override public Toppings provideToppings() {
    return toppings;
  }
}
