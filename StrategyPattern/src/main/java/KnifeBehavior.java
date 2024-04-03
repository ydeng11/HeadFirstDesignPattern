public class KnifeBehavior implements WeaponBehavior {
  private String nameOfKnife;

  public KnifeBehavior(String nameOfKnife) {
    this.nameOfKnife = nameOfKnife;
  }

  @Override public void useWeapon() {
    System.out.println("Stab using " + nameOfKnife + "!");
  }
}
