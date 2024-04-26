public class AddToCartState implements State{
  Order order;

  public AddToCartState(Order order) {
    this.order = order;
  }

  @Override public void addToCart() {
    System.out.println("Add item to Cart");
    order.setState(order.getAddToCartState());
  }

  @Override public void emptyCart() {
    System.out.println("Clear non-empty Cart!");
    order.setState(order.getEmptyCartState());
  }

  @Override public void placeOrder() {
    System.out.println("Place Order!");
    order.setState(order.getPlaceOrderState());
  }

  @Override public void makePayment() {
    System.out.println("Place order before making payment!");
  }
}
