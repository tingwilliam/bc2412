public abstract class HHero {
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


  //private int attackPower;
  //private Role role;
  //private int maxHp;
  //private int maxMp;
  private long id; //own ID
  private int level;
  private int hp; //Health Point (HP)
  private int mp; //Mana Point (MP)
  private int pa; //Physical Attack (PA)
  private int pd; //Physical Defense (PD)
  private int ma; //Magical Attack (MA)
  private int md; //Magical Defense (MD)
  private int ag; //Agility (AG)
  private int cc; //Critical Damage Chance (CC)
  private int cd; //Critical Damage (CD)




  //contructer

      //this.attackPower = attackPower;
  //}
  public HHero(long id, int hp, int mp, int pa, int pd, 
               int ma,int md, int ag, int cc, int cd) {

    this.level = 1;
    this.id = id;
    this.hp = hp;
    this.mp = mp;
    this.pa = pa;
    this.pd = pd;
    this.ma = ma;
    this.md = md;
    this.ag = ag;
    this.cc = cc;
    this.cd = cd;
  }



//getter
    //public int getAttackPower() {
    //return this.attackPower;
    //}
    public int getLevel() {
      return this.level;
    }
  public long getId() {
    return this.id;
    }
  public int getHp() {
    return this.hp;
  }
  public int getMp() {
    return this.mp;
  }
  public int getPa() {
    return this.pa;
  }
  public int getPd() {
    return this.pd;
  }
  public int getMa() {
    return this.ma;
  }
  public int getMd() {
    return this.md;
  }
  public int getAg() {
    return this.ag;
  }
  public int getCc() {
    return this.cc;
  }
  public int getCd() {
    return this.cd;
  }
  
//Setter
  public void setLevel(int level) {
    this.level = level;
  }
  public void setHp(int hp) {
    this.hp = hp;
  }
  public void setMp(int mp) {
    this.mp = mp;
  }
  public void setPa(int pa) {
    this.pa = pa;
  }
  public void setPd(int pd) {
    this.pd = pd;
  }
  public void setMa(int ma) {
    this.ma = ma;
  }
  public void setMd(int md) {
    this.md = md;
  }
  public void setAg(int ag) {
    this.ag = ag;
  }
  public void setCc(int cc) {
    this.cc = cc;
  }
  public void setCd(int cd) {
    this.cd = cd;
  }
}






