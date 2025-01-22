package furniture;
public class DemoFactory {
  public static void main(String[] args) {
    //polymorphism
    Chair mc = new ModernChair();
    Chair vc = new VictorianChair();
    System.out.println(mc.sitOn());
    System.out.println(mc.hasLegs());
    System.out.println(vc.hasLegs());
    System.out.println(vc.sitOn());
  }
}
