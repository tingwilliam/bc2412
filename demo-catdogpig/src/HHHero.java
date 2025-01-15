public class HHHero {
  private long id;
  private int level;
  private int hp;
  private int mp;


  //Contructer
  public HHHero (long id, int hp, int mp) {

    this.level = 1;
    this.id = id;
    this.hp = hp;
    this.mp = mp;
  }
  
  //Getter
  public int getLevel(){
    return this.level;
  }
  public long getId(){
    return this.id;
  }
  public int getHp(){
    return this.hp;
  }
  public int getMp(){
    return this.mp;
  }

  //Setter
  //public void setHp(int hp); {
    //this.hp = hp;
//}
}
