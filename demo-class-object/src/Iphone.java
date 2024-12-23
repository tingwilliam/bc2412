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
  //setter
    public void setMemory(String memory) {
      this.memory = memory;
    }
    public void setModel(String model) {
      this.model = model;
    }
    public void setColor(String color) {
      this.color = color;
    }

}
