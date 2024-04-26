import java.util.Iterator;

class MenuIterator implements Iterator {
  private MenuItem[] items;
  private int index;

  public MenuIterator(MenuItem[] items) {
    this.items = items;
    this.index = 0;
  }

  @Override public boolean hasNext() {
    return index < items.length && items[index] != null;
  }

  @Override public Object next() {
    var item = items[index];
    index += 1;
    return item;
  }
}

public class LunchMenu implements Menu {
  public String name;
  public String description;
  public MenuItem[] items;
  public int index;
  public int menuSize;

  public LunchMenu(String name, String description) {
    this.name = name;
    this.description = description;
    this.index = 0;
    this.menuSize = 10;
    this.items = new MenuItem[menuSize];
  }

  public void addItem(MenuItem item) {
    if (index >= menuSize) {
      return;
    }
    items[index] = item;
    index += 1;
  }

  @Override public Iterator<MenuItem> getMenuIterator() {
    return new MenuIterator(items);
  }

  @Override public String toString() {
    return "LunchMenu{" +
        "name='" + name + '\'' +
        ", description='" + description + '\'' +
        '}';
  }
}
