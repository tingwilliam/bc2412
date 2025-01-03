public class Animal {
  // common attribute of Cat and Dog
  private String name;

  public Animal() {
    
  }

  public Animal(String name) {
    this.name = name;
  }

  public void eat() {
    System.out.println("Animal is eating...");
  }
  public String getName() {
    return this.name;
  }
}