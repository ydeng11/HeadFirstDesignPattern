package AbstractFactory;

import java.util.List;

public class CommonToppings implements Toppings {
  @Override public List<String> getName() {
    return List.of("common toppings");
  }
}
