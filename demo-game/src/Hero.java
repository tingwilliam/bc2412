public abstract class Hero {
  //hp -Health Point
  //mp -Magic Point
  //Level - > Increase Max HP, Max MP
  //attackPower

    //Method
  //Presentation: isAlive
  // Action: Level Up: +MaxHP, +MaxMP, +AttackPower
  //Hero is a Parent Class
  //Child Class: Archer, Mage, Warrior

  //attack,
  //Weapon, 

  private int hp;
  private int mp;
  private int level;
  //private int attackPower;
  //private Role role;
  //private int maxHp;
  //private int maxMp;

  public void levelUp() {

  }


  public Hero (int hp, int mp, int level) {
    this.hp = hp;
    this.mp = mp;
    this.level = level;
    //this.attackPower = attackPower;
  }

  public int getHp() {
    return this.hp;
  }
  public int getMp() {
    return this.mp;
  }
  public int getLevel() {
    return this.level;
  }
  //public int getAttackPower() {
    //return this.attackPower;
  //}

}
