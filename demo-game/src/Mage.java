public class Mage extends HHero {
  private int maxHp;
  private int maxMp;
  private int level;
  private Stave stave;

  // contructer
  public Mage(long id, int hp, int mp, int pa, int pd, int ma, int md, int ag,
      int cc, int cd) {
    super(id, hp, mp, pa, pd, ma, md, ag, cc, cd);
    this.maxHp = 300;
    this.maxMp = 300;
  }

  // getter-stave
  public Stave getStave() {
    return this.stave;
  }


  // print
  public String toString() {
    return " LEVEL:" + super.getLevel() + ", ID:" + super.getId() + 
           ", HP:"+ super.getHp() + ", MaxHP:" + this.maxHp + 
           ", MP:" + super.getMp() + ", MaxMP:" + this.maxMp + 
           ", Stave:" + (getStave().getStaveName()) +
           ", StaveLevel:" + (getStave().getStaveLevel()) +
           ", PA:" + (super.getPa() + getStave().getStavePa()) +
           ", PD:" + super.getPd() + 
           ", MA:" + (super.getMa() + getStave().getStaveMa()) + 
           ", MD:" + super.getMd() + 
           ", AG:" + super.getAg() + 
           ", CC:" + (super.getCc() + getStave().getStaveCc()) + 
           ", CD:" + super.getCd();
  }


  public void setLevel() {
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
    this.maxHp = this.getHp();
    this.maxMp = this.getMp();
      }

  public void setstave(Stave stave) {
    this.stave = stave;
  }

  public static void main(String[] args) {
    Mage mage = new Mage(123456, 200, 200, 10, 10, 10, 10, 10, 10, 10);
    Stave recurve = new Stave("Recurve", 1, 200, 100, 100);
    Stave guinsoo = new Stave("Guinsoo", 1, 100, 250, 50);
    mage.setstave(guinsoo); 

    System.out.println(mage.toString());

    mage.setLevel();
    mage.setstave(recurve);
    recurve.setStaveLevelUp();
    System.out.println(mage.toString());

    mage.setLevel();
    System.out.println(mage.toString());


  }

}
