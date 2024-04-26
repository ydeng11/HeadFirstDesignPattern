public class EmptyCartState implements State {
  private Order order;

  public EmptyCartState(Order order) {
    this.order = order;
  }

  @Override public void addToCart() {
    System.out.println("Add item to cart!");
    order.setState(order.getAddToCartState());
  }

  @Override public void emptyCart() {
    System.out.println("Clear cart!");
    order.setState(order.getEmptyCartState());
  }

  @Override public void placeOrder() {
    System.out.println("Empty cart - add items firstly!");
  }

  @Override public void makePayment() {
    System.out.println("Empty cart - no payments needed!");
  }
}
