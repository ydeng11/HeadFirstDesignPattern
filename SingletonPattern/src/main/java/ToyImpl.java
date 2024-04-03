public class ToyImpl implements Toy {
  private String name;

  public ToyImpl(String name) {
    this.name = name;
  }

  @Override public void play() {
    System.out.println(name + " goes squeak!");
  }
}
