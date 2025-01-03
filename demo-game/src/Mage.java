public class Mage extends Hero {


  public Mage(int hp, int mp, int level){
    super(hp, mp, level);
  }
    public static void main(String[] args) {
      Mage mage = new Mage(200, 20, 1);

      System.out.println(
      "hp:" + mage.getHp() + //
      "mp:" + mage.getMp() + //
      "level:" + mage.getLevel());//
      
    }
}