public class Mage extends Hero {
  private int maxHp;
  private int maxMp;

  public Mage(long id, int hp, int mp, int pa, int pd, 
  int ma, int md, int ag, int cc, int cd){
super(id, hp, mp, pa, pd, ma, md, ag, cc, cd);
this.maxHp = 200;
this.maxMp = 100;
}


public String toString(){
return" LEVEL:" + super.getLevel() + " ID: " + super.getId() + 
" HP:" + super.getHp() + " MaxHP:" + this.maxHp + 
" MP:" + super.getMp() + " MaxMP:" + this.maxMp + 
" PA:" + super.getPa() + " PD:" + super.getPd() + 
" MA:" + super.getMa() + " MD:" + super.getMd() +
" AG:" + super.getAg() + " CC:" + super.getCc() +
" CD:" + super.getCd();
}

public static void main(String[] args) {
  Mage mage = new Mage(123456, 200, 200, 1, 2, 3, 4, 5, 6, 7);

  System.out.println(mage.toString());
    }
  
  }
