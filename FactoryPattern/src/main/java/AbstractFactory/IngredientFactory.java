package AbstractFactory;

import java.util.List;

public interface IngredientFactory {
  Dough provideDough();
  Sauce provideSauce();
  Cheese provideCheese();
  Toppings provideToppings();
}

interface Dough {
  String getName();
}

interface Sauce {
  String getName();
}

interface Cheese {
  String getName();
}

interface Toppings {
  List<String> getName();
}
