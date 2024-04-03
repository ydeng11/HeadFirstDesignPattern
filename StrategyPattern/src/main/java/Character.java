public abstract class Character {
  String name;
  WeaponBehavior weapon;

  public Character(String name, WeaponBehavior weapon) {
    this.name = name;
    this.weapon = weapon;
  }

  void fight() {
    System.out.println(name + " is fighting;");
    weapon.useWeapon();
  };

  void setWeapon(WeaponBehavior weapon) {
    this.weapon = weapon;
  };
}
