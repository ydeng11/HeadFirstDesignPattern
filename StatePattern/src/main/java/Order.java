public class Order {
  private EmptyCartState emptyCartState;
  private AddToCartState addToCartState;
  private MakePaymentState makePaymentState;
  private PlaceOrderState placeOrderState;
  private State state;

  public Order() {
    this.emptyCartState = new EmptyCartState(this);
    this.addToCartState = new AddToCartState(this);
    this.placeOrderState = new PlaceOrderState(this);
    this.makePaymentState = new MakePaymentState(this);

    setState(emptyCartState);
  }

  public void setState(State state) {
    this.state = state;
  }

  public void addToCart() {
    state.addToCart();
  }

  public void emptyCart() {
    state.emptyCart();
  }

  public void placeOrder() {
    state.placeOrder();
    state.makePayment();
  }

  public void startShipping() {
    System.out.println("Start shipping order!");
  }

  public EmptyCartState getEmptyCartState() {
    return emptyCartState;
  }

  public AddToCartState getAddToCartState() {
    return addToCartState;
  }

  public MakePaymentState getMakePaymentState() {
    return makePaymentState;
  }

  public PlaceOrderState getPlaceOrderState() {
    return placeOrderState;
  }
}
