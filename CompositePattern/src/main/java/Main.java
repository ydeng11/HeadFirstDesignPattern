import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Waitress {
  CompositeItem item;

  public Waitress(CompositeItem item) {
    this.item = item;
  }

  void print() {
    item.print();
  }
}

public class Main {
  public static void main(String[] args) {
    var coffeeMenu = new Menu("Coffee", "Helio love coffee", new ArrayList<>());
    var lunchMenu = new Menu("Lunch", "Helio love lunch", new ArrayList<>());
    var breakfaseMenu = new Menu("Breakfast", "Helio love breakfast", new ArrayList<>());
    coffeeMenu.addItem(new MenuItem("Cold Brew", "5.0"));
    coffeeMenu.addItem(new MenuItem("Latte", "7.0"));

    lunchMenu.addItem(new MenuItem("Fried Rice", "8.9"));
    lunchMenu.addItem(new MenuItem("Beef", "11.1"));
    lunchMenu.addItem(coffeeMenu);

    breakfaseMenu.addItem(new MenuItem("Egg", "2"));
    breakfaseMenu.addItem(new MenuItem("Milk", "1.5"));

    var menuComposite = new Menu("All", "Composite", new ArrayList<>());
    menuComposite.addItem(breakfaseMenu);
    menuComposite.addItem(lunchMenu);

    var waitress = new Waitress(menuComposite);
    waitress.print();
  }
}
