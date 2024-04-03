public class BowAndArrowBehavior implements WeaponBehavior{
  private String nameOfBow;

  public BowAndArrowBehavior(String nameOfBow) {
    this.nameOfBow = nameOfBow;
  }

  @Override
  public void useWeapon() {
    System.out.println("Shoot an arrow with the " + nameOfBow + "!");
  }
}
