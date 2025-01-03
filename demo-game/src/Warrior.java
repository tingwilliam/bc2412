public class Warrior extends Hero {

  public Warrior(int hp, int mp, int level){
    super(hp, mp, level);
  }
    public static void main(String[] args) {
      Warrior warrior = new Warrior(200, 20, 1);

      System.out.println(
      "hp:" + warrior.getHp() + //
      "mp:" + warrior.getMp() + //
      "level:" + warrior.getLevel());//
      
    }

  
}
