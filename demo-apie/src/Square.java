import java.math.BigDecimal;

public class Square extends Shape {
    private double length;


  public Square (String color, double length) {
    super(color);
    this.length = length;
  }
    public double getlength() {
    return this.length;
  }
    public double area() {
    return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.length))
.doubleValue();
  }


  public static void main(String[] args) {
    Square square = new Square("Yellow", 10.0);
    square.area();

    System.out.println(square.getColor() + " area: " + square.area());
  }
}
