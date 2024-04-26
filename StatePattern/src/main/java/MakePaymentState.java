public class MakePaymentState implements State {
  private Order order;

  public MakePaymentState(Order order) {
    this.order = order;
  }

  @Override public void addToCart() {
    System.out.println("Cannot add new items while making payment!");
  }

  @Override public void emptyCart() {
    System.out.println("Cannot remove items from cart while making payment!");
  }

  @Override public void placeOrder() {
    System.out.println("Cannot place new order before finishing payment!!");
  }

  @Override public void makePayment() {
    System.out.println("Successfully made payment!");
    order.setState(order.getEmptyCartState());
  }
}
