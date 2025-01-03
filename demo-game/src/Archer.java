public class Archer extends Hero {
  

  public Archer(int hp, int mp, int level){
    super(hp, mp, level);
  }
    public static void main(String[] args) {
      Archer archer = new Archer(100, 50, 1);

      System.out.println(
      "hp:" + archer.getHp() + //
      "mp:" + archer.getMp() + //
      "level:" + archer.getLevel());//
      
    }
}
