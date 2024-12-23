import java.math.BigDecimal;

public class Circle {
  private double radius;
  //private String color;

  //Contructor
  public Circle (double radius) {
    this.radius = radius;
  }
  //getter
  public double getRadius() {
    return this.radius;
  }
  //setter
  public void setRadius(double radius) {
    this.radius = radius;
  }
    //instance method
  public double calculateArea(){
    return BigDecimal.valueOf(this.radius) //
    .multiply(BigDecimal.valueOf(this.radius))//
    .multiply(BigDecimal.valueOf(Math.PI))//
    .doubleValue();
    //BigDecimal c1 = BigDecimal.valueOf(c1.calulateArea());
  }


  public static void main(String[] args) {
    //area
    Circle c1 = new Circle(3.0);

    //Presentation
    System.out.println(c1.calculateArea());//28.27'

    //Formula
    System.out.println(c1.calculateArea());// 28.27;
  }
}


