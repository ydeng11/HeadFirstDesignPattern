import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CoffeeMenu implements Menu {
  public String name;
  public String description;
  public List<MenuItem> items;

  public CoffeeMenu(String name, String description) {
    this.name = name;
    this.description = description;
    this.items = new ArrayList<>();
  }

  public void addMenuItem(MenuItem item) {
    this.items.add(item);
  }

  @Override public Iterator<MenuItem> getMenuIterator() {
    return items.iterator();
  }

  @Override public String toString() {
    return "CoffeeMenu{" +
        "name='" + name + '\'' +
        ", description='" + description + '\'' +
        '}';
  }
}
