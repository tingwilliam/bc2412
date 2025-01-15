public class Cat extends Animal implements Walkable, Sleepable { 
  // Animal.class is a Parent Class
  // Cat.class is a Chlid Class
  // Inherit all attributes from Parent Class
  
  // private String name;
  private int age;

  // constructor
  public Cat(String name, int age) {
    // this.name = name;
    super(name); // Calling Parent Contructor 
    // must be the first line to call super()
    this.age = age;
  }
  
  // Inherit Parent all instance methods
  // public String getName() {
  //   return this.name;
  // }

  // walk()
  @Override
  public void walk() {
    System.out.println("Cat is walking ...");
  }

  @Override
  public void eat() {
    System.out.println("Cat is eating ...");
  }
  
  @Override
  public void sleep() {
    System.out.println("Cat is sleeping ...");
  }

  public static void main(String[] args) {
    Cat cat = new Cat("ABC", 8);
    System.out.println(cat.getName()); // ABC
    cat.walk(); // Cat itself method
    cat.eat(); // Override Parent method implementation
  }
}