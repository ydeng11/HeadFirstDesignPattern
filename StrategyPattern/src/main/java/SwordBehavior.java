public class SwordBehavior implements WeaponBehavior {
  private String nameOfSword;

  public SwordBehavior(String nameOfSword) {
    this.nameOfSword = nameOfSword;
  }

  @Override public void useWeapon() {
    System.out.println(String.format("Drawing %s!", nameOfSword));
  }
}
