public abstract class Shape {
  //abstract class VS class
  //1. CANNOT create object for abstract class
  //2.
  //3. abstract class's
  private String color;


  public Shape (String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  //implicitly public
  //implication: If the child cannot provide area implementation, then it is not a shape.
  abstract double area();
  public static void main(String[] args) {
    //new Shape ('R'); // compile error, abstract class
  }
}
