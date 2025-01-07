public interface Walkable {
  //1. no instance variable
  //2. All methods are abstract (interface=100% abstract)
  //3. Everthing in interface is implicaitly public
  //4. Support "static final" variable
  //5. No contrictor
  //6. AfterJava 8, we have default & static method

  int x = 3; //Implicitly static final
  void walk(); //abstract method

  //After Java 8, we can use default instance method
  default void walkFaster() {
    System.out.println("A way to walk faster...");
  }

  //After Java 8, we can use static method in Interface
  static int calculateDistance() {
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(Walkable.x); //3
    //Walkable.x =4; // static final
    // Walkable.walkFaster();
  }
}
