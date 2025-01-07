public class Animal implements Eatable {
  // common attribute of Cat and Dog
  private String name;

  public Animal() {
    
  }

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  // Contract Content
  @Override
  public void eat() {
    System.out.println("Animal is eating...");
  }
  
  public static void main(String[] args) {
    new Animal();  //ok, because ir t is normal class
  }
  Cat cat = new Cat("Jimmy", 3);
  System.out.println(cat.getName()); // Jimmy

  Animal cat2 = new Cat("Mary", 2);
  cat2.eat(); // Cat is eating ...

  // Rule 1.During the comile time,
  // "Animal cat2" implies the object can be accessed in "Animal Scope"
  // Hide the object instance method walk() & sleep
  // cat2.sleep();
  // cat2.walk();


// Example 1:
    Animal[] animals = new Animal[4]; //Cat, Dog, Pig
    animals[0] = new Cat("ABC, 2");
    animals[1] = new Dog("DEF");
    animals[2] = new Pig("IJK");
    animals[3] = new Animal("XYZ"); //what if the Animal.class is abstract ?

    Cat[] cats = new Cat[3];
    cats[0] = new Cat("123", 2);
    Dog[] dogs =new Dog[2];
    Pig[] pigs =new Pig[3];

    // Example 2:
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle('R', 3.0);
    shapes[1] = new Square('Y', 4.0);
    shapes[2] = new Circle('B', 2.0);
    for (Shape shape : shapes) {
      System.out.println("area=" + shape.area());
      // System.out.println(shape.getRadius());
    }

    //Example 3: Downcast
    for (Shape shape : shapes) {
      if (shape instanceof Circle) { //check if shape is instance of Circle?
        Circle circle = (Circle) shape; //similar to "double y = 2.0; int x = (int) y;"
        System.out.println( circle.getRadius()); //comply with Rule 1
      } else if (shape instanceof Square) {
        Square square = (Square) shape;
        System.out.println(square.getLength()); //comply with Rule 1
      }
    }

  //Example 4: for Interface
    Eatable cat4 = new Cat("Tommy", 9);
    cat4.eat(); //Cat is eating...
    // cat4.walk();

    Sleepable[] animaks2 = new Sleepable[3];
    animals2[0] = new Cat(" Steve", 2);
    animals2[1] = new Dog("Owen");
    //animals[2] = new Amimal(); //Animal didn't implement Eatable
    animals2[1].sleep();
    animals2[0].sleep();
    // animals2[0].eat();


    // Hero[] heros = new Hero[3];


   }
  }

