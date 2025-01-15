import java.math.BigDecimal;
import java.math.RoundingMode;

// Wrong Design for Object Oriented Programming
public class Calculator {
  
  // static method
  public static double bmi2(double weight, double height) {
    return BigDecimal.valueOf(weight)
        .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2,
            RoundingMode.HALF_UP) //
        .doubleValue();
  }

  public static double circleArea(double radius) {
    return BigDecimal.valueOf(radius) //
        .multiply(BigDecimal.valueOf(radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }

  public static double totalInterestAfterYears(double principle,
      double annualInterestRate, int numOfYears) {
    return BigDecimal.valueOf(principle) //
        .multiply(BigDecimal
            .valueOf(Math.pow(1 + annualInterestRate / 100.0, numOfYears)))
        .subtract(BigDecimal.valueOf(principle)) //
        .doubleValue();
  }

  public static void main(String[] args) {
    Calculator.bmi2(1.74, 68);
    Calculator.circleArea(3.9);
  }
}