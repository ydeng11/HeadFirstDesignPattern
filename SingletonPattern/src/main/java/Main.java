public class Main {
  public static void main(String[] args) {
    Factory factory = ToyFactory.getInstance();
    Toy toy = factory.makeToy("super");
    toy.play();
  }
}
