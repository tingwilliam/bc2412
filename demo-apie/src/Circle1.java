import java.math.BigDecimal;
import java.util.Objects;

public class Circle1 extends Shape { //Parent Class: color
  // Square, Triangle
  private double radius;
// If you don't specify the constructor, implicitly you have an empty constructor

    //Contructor
      //area() return double
    public Circle1(String color, double radius) {
    // if you don't specify super() here, implicitly you are calling super()
    super(color);
    // super(color); // because you have "extends", you have to "super"
    this.radius =radius;
  }

  // Override the parent given method
  // compiler will help to check if the parent class has an area() method
  @Override 
  public double area() {
    return BigDecimal.valueOf(this.radius) //
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }
  public double getradius() {
    return this.radius;
  }

@Override
public boolean equals(Object obj) {
  if(this == obj)
  return true;
  if(!(obj instanceof Circle1))
  return false;
  Circle1 circle = (Circle1) obj;
  return Objects.equals(circle.getradius(), this.radius)
  && Objects.equals(circle.getColor(), super.getColor()); 
}

@Override
    public int hashCode() {
      return Objects.hash(this.radius, super.getColor());
    }

@Override
    public String toString() {
      return "Circle["
        +"radius=" +this.radius
        +", color=" +super.getColor()
        + "]";
    }



    public double area() {
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius)).multiply(BigDecimal.valueOf(Math.PI))//
.doubleValue();
  }
  

    public static void main(String[] args) {
      // new Circle(); //after you specify a constructor, 
      //then the default will be no longer exists
      Circle1 circle = new Circle1("Black", 10.0);
      Circle1 circle2 = new Circle1("White", 9.0);

      circle.area();

      System.out.println(circle.getColor()); // null
      System.out.println(circle2.getColor());


      System.out.println(circle.getColor() + " area: " + circle.area());

  
  Object object = new Object();
    Circle1 myCircle1 = new Circle1 ("Black", 4.0);
    Circle1 checkCircle1 = new Circle1 ("Black", 4.0);
    if (myCircle1.getradius() == checkCircle1.getradius() && myCircle1.getColor() == checkCircle1.getColor()) {

    }
    if (myCircle1.equals(checkCircle1)) {
      System.out.println("same!");
    }else{
      System.out.println("Not same!");
    }
    System.out.println(myCircle1.hashCode());
    System.out.println(checkCircle1.hashCode());

    System.out.println(circle);

    }
  }

