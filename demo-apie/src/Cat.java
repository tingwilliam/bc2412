public class Cat extends Animal implements Walkable, Sleepable {
  //Animal.class is a Parent Class
  //Cat.class is a child Class
  // Interit all attribut from Parent Class

    //private String name;
  private int age;
  private int legs;

    //Contructor
    public Cat(String name,int legs, int age) {
      //this.name =name;
      super(name); //Calling Parent Contructor
      //(must be the first lint to call super)
    }
    public int getAge() {
      return this.age;
    }

    public int getLegs() {
      return this.legs;
    }
    //Inherit Parent all instance methods
    //public String getname() {
    //  return this.name;
    //}

    //walk()
    @Override
    public void walk() {
      System.out.println("Cat is walking...");
    }
    @Override
    public void eat() {
      System.out.println("Cat is eating...");
    }

    @Override
    public void sleep() {
      System.out.println("Cat is sleeping...");
    }

    public static void main(String[] args) {
      Cat cat =new Cat("ABC", 4, 8);
      Dog dog = new Dog("BBB");
      System.out.println(cat.getName()); //ABC
      cat.walk();

    }
}

