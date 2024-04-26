public class MenuItem {
  public String name;
  public String price;

  public MenuItem(String name, String price) {
    this.name = name;
    this.price = price;
  }

  @Override public String toString() {
    return "MenuItem{" +
        "name='" + name + '\'' +
        ", price='" + price + '\'' +
        '}';
  }
}
