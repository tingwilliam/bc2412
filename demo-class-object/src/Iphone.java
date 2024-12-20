public class Iphone {

  private String model;
  private String memory; 
  private String color;

  public Iphone (String model, String memory, String color) {
    this.model = model;
    this.memory = memory;
    this.color = color;
  }
  public String getModel() {
    return this.model;
  }
  public String getMemory() {
    return this.memory;
  }
  public String getColor() {
    return this.color;
  }

  public static void main(String[] args) {
    String iphone = "Iphone8";
    String iphoneMemory = "64GB";

    String iphone2 = "Iphone11";
    String iphoneMemory2 = "128GB";

    String[] models = new String[]{"Iphone8", "Iphone11", };
    String[] memorys = new String[] {"64GB","128GB"};

    Iphone i1 = new Iphone ("Iphone8", "64GB", "black");
    System.out.println(i1.getModel());
    System.out.println(i1.getMemory());
    System.out.println(i1.getColor());
    Iphone i2 = new Iphone ("Iphone11", "128GB", "white");
    System.out.println(i2.getModel()); 
    System.out.println(i2.getMemory()); 
    System.out.println(i2.getColor());

    Iphone[] iphones = new Iphone[] {i1, i2, new Iphone("Iphone14", "256GB", "pink")} ;
    for (Iphone i : iphones) {
      System.out.println(i.getModel() + "," + i.getMemory() + "," + i.getColor());

    }
}
}
