public class Main {
  public static void main(String[] args) {
    SwordBehavior truthSword = new SwordBehavior("TruthSword");
    King king = new King("Helio", truthSword);

    SwordBehavior loveSword = new SwordBehavior("LoveSword");
    Queen queen = new Queen("Little Helio", loveSword);

    SwordBehavior powerSword = new SwordBehavior("PowerSword");
    Knight knight = new Knight("Helio's knight", powerSword);

    AxeBehavior commonAxe = new AxeBehavior("CommonAxe");
    KnifeBehavior commonKnife = new KnifeBehavior("SmallKnife");

    Troll trollA = new Troll("Troll A", commonAxe);
    Troll trollB = new Troll("Troll B", commonAxe);
    Troll trollC = new Troll("Troll C", commonKnife);

    trollA.fight();
    trollB.fight();
    king.fight();
    knight.fight();
    trollC.fight();
    queen.fight();
    knight.setWeapon(commonAxe);
    knight.fight();
  }
}
