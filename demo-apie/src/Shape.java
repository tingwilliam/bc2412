public abstract class Shape {
  //abstract class VS class
  //1. CANNOT create object for abstract class
  //2.
  //3. abstract class's
  private char color;


  public Shape (char color) {
    this.color = color;
  }

  public char getColor() {
    return this.color;
  }

  //implicitly public for abstract method
  //implication: 
  // 1. If the child cannot provide area implementation, then it is not a shape.
  // 2. The child class must provide the implemenation of abstract method
  abstract double area();

  public static Shape create(char ref, char color) { // S -> Square, C -> Circle
    switch(ref) {
      case'S' :
      return new Square(color, 3.0);
      case'C' :
      return new Circle(color, 4.0);
      default:
        return null;
    }
  }

  public static Circle createCircle(char color, double radius) {
    return new Circle(color, radius);
  }

  public static void main(String[] args) {
    //new Shape ('R'); // compile error, abstract class
    Shape.create('C', 'R');
    Circle c2 = Shape.createCircle('B', 3.0);
    // Heros.createArcher();
  }
    //Hero[] heros = new Hero[3];
}

