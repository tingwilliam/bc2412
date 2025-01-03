import java.math.BigDecimal;

public class Triangle extends Shape{
  private double bottem;
  private double high;

  public Triangle (String color, double bottem, double high) {
    super(color);
    this.bottem = bottem;
    this.high = high;
  }
    public double getbottem() {
    return this.bottem;
  }
    public double gethigh() {
    return this.high;
  }
    public double area() {
    return BigDecimal.valueOf(this.bottem).multiply(BigDecimal.valueOf(this.high)).divide(BigDecimal.valueOf(2.0))
.doubleValue();
  }


  public static void main(String[] args) {
    Triangle triangle = new Triangle("Green", 8.0, 4.0);
    triangle.area();

    System.out.println(triangle.getColor() + " area: " + triangle.area());
  }
}
