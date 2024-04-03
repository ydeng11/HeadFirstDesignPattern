public class ToyFactory implements Factory {
  private static ToyFactory toyFactory;
  private ToyFactory() {}

  public static ToyFactory getInstance() {
    if (toyFactory == null) {
      toyFactory = new ToyFactory();
    }
    return toyFactory;
  }

  @Override public Toy makeToy(String name) {
    return new ToyImpl(name);
  }
}
