public class MenuItem extends CompositeItem {
  public String name;
  public String price;

  public MenuItem(String name, String price) {
    this.name = name;
    this.price = price;
  }

  @Override void print() {
    System.out.println(String.format("%s : $ %s", name, price));;
  }
}
