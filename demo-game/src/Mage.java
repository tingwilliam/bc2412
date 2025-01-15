public class Mage extends HHero {
  private int maxHp;
  private int maxMp;
  private int level;

    //contructer
  public Mage(long id, int hp, int mp, int pa, int pd, 
    int ma, int md, int ag, int cc, int cd){
    super(id, hp, mp, pa, pd, ma, md, ag, cc, cd);
    this.maxHp = 200;
    this.maxMp = 100;
  }

    //print
  public String toString(){
    return" LEVEL:" + super.getLevel() + " ID: " + super.getId() + 
    " HP:" + super.getHp() + " MaxHP:" + this.maxHp + 
    " MP:" + super.getMp() + " MaxMP:" + this.maxMp + 
    " PA:" + super.getPa() + " PD:" + super.getPd() + 
    " MA:" + super.getMa() + " MD:" + super.getMd() +
    " AG:" + super.getAg() + " CC:" + super.getCc() +
    " CD:" + super.getCd();
  }

public void setlevel(int level){
  this.level = level; 
    setLevel(getLevel() + 1);
    setHp(getHp() + 100);
    setMp(getMp() + 100);
    setPa(getPa() + 10);
    setPd(getPd() + 10);
    setMa(getMa() + 10);
    setMd(getMd() + 10);
    setAg(getAg() + 10);
    setCc(getCc() + 10);
    setCd(getCd() + 10);
  this.maxHp += 100;
  this.maxMp += 100;
}

public static void main(String[] args) {
  Mage mage = new Mage(123456, 200, 200, 1, 2, 3, 4, 5, 6, 7);

  System.out.println(mage.toString());
        //System.out.println(mage2.toString());
        mage.setlevel(2);
        System.out.println(mage.toString());
        mage.setlevel(3);
        System.out.println(mage.toString());
    }
  
  }
