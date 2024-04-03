public class Main {
  public static void main(String[] args) {
    Beverage espresso = new Espresso();
    System.out.println(espresso.getDescription());
    System.out.println("espresso price: " + espresso.cost());

    Beverage latte = new Milk(espresso);
    System.out.println(latte.getDescription());
    System.out.println("latte price: " + latte.cost());

    Beverage latteExtraMilk = new Milk(latte);
    System.out.println(latteExtraMilk.getDescription());
    System.out.println("latte extra milk price: " + latteExtraMilk.cost());
  }
}
