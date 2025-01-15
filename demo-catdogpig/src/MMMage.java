public class MMMage extends HHHero {
  private int maxHp;
  private int maxMp;


  //contructer
    public MMMage(long id, int hp, int mp) {
    super(id, hp, mp);
    this.maxHp = 200;
    this.maxMp = 100;
  
    }

    @Override
  public String toString() {
    return super.getLevel() + " " + super.getId() + " " + super.getHp() + " " +
          super.getMp() + " "+ this.maxHp + " " + this.maxMp + " ";
  }
  

  public static void main(String[] args) {
    MMMage mage = new MMMage(456789, 500, 500);

    System.out.println(mage.toString());
  }
}
