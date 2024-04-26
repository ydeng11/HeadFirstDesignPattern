public class PlaceOrderState implements State {
  private Order order;

  public PlaceOrderState(Order order) {
    this.order = order;
  }

  @Override public void addToCart() {
    System.out.println("Order is placed, create a new order!");
  }

  @Override public void emptyCart() {
    System.out.println("Order is placed, cannot be cancelled!");

  }

  @Override public void placeOrder() {
    System.out.println("Order is already placed!");
  }

  @Override public void makePayment() {
    System.out.println("Make payment!");
    order.setState(order.getEmptyCartState());
  }
}
