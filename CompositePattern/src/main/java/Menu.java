import java.util.Iterator;
import java.util.List;

public class Menu extends CompositeItem {
  private String name;
  private String price;
  private List<CompositeItem> items;

  public Menu(String name, String price, List<CompositeItem> items) {
    this.name = name;
    this.price = price;
    this.items = items;
  }

  @Override void addItem(CompositeItem item) {
    items.add(item);
  }

  @Override boolean hasChildren() {
    return items.size() > 0;
  }

  @Override void print() {
    System.out.println(name + ": $ " + price);
    items.forEach(item -> item.print());
  }
}
