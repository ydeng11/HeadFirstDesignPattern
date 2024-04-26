import java.util.Iterator;
import java.util.List;

class Waitress {
  List<Menu> menus;

  public Waitress(List<Menu> menus) {
    this.menus = menus;
  }

  void printMenu() {
    menus.forEach(menu -> {
      Iterator<MenuItem> menuItemIterator = menu.getMenuIterator();
      System.out.println(menu);
      while (menuItemIterator.hasNext()) {
        System.out.println(menuItemIterator.next());
      }
    });
  }
}

public class Main {
  public static void main(String[] args) {
    var coffeeMenu = new CoffeeMenu("coffee", "helio's coffee");
    var lunchMenu = new LunchMenu("lunch", "helio's lunch");
    coffeeMenu.addMenuItem(new MenuItem("Cold Brew", "7.0"));
    coffeeMenu.addMenuItem(new MenuItem("Espresso", "8.0"));

    lunchMenu.addItem(new MenuItem("Noodles", "9.9"));
    lunchMenu.addItem(new MenuItem("Fried Rice", "11.9"));

    Waitress waitress = new Waitress(List.of(coffeeMenu, lunchMenu));
    waitress.printMenu();
  }
}
