public class Dog extends Animal { // extends
  // private String name

    // constructor (Class CANNOT inherit Parent Constructor)

    public Dog (String name) {
      //this.name = name;
      super(name);
    }

    //getter
    //public String getname() {
      //return this.name;
    //}

    //walk()
    public void walk() {
      System.out.println("Dog is walking...");
    }
  
}
