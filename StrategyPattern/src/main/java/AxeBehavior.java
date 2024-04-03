public class AxeBehavior implements WeaponBehavior {
  private String nameOfAxe;

  public AxeBehavior(String nameOfAxe) {
    this.nameOfAxe = nameOfAxe;
  }

  @Override public void useWeapon() {
    System.out.println("Attacking with " + nameOfAxe );
  }
}
