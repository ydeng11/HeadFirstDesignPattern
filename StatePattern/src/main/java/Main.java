public class Main {
  public static void main(String[] args) {
    Order order = new Order();

    order.addToCart();
    order.emptyCart();
    System.out.println("------");
    order.addToCart();
    order.addToCart();
    order.placeOrder();
    System.out.println("------");
    order.emptyCart();
    order.addToCart();
    order.addToCart();
    order.emptyCart();
    order.addToCart();
    order.addToCart();
    order.placeOrder();
  }
}
