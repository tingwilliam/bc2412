import java.math.BigDecimal;
import java.math.RoundingMode;

public class LoanCalculator {
  private double principle;
  private double annualInterestRate;
  private int numOfYears;

  // constructor
  public LoanCalculator (double principle, double annualInterestRate, int numOfYears) {
    this.principle = principle;
    this.annualInterestRate = annualInterestRate;
    this.numOfYears = numOfYears;
  }

  //totalInterestAfterYears()
  public double totalInterestAfterYears() {
    //priciple = * (1 + annualInterestRate/100)^numOfYears) -principle
    return BigDecimal.valueOf(this.principle) //
    .multiply(BigDecimal.valueOf(Math.pow(1+ this.annualInterestRate/100.0, this.numOfYears)))
    .subtract(BigDecimal.valueOf(this.principle))  //
    .doubleValue();
  }
  public static double totalInterestAfterYears2(double principle, 
  double annualInterestRate, int numOfYears) {
    return BigDecimal.valueOf(principle) //
    .multiply(BigDecimal.valueOf(Math.pow(1+ annualInterestRate/100.0, numOfYears)))
    .subtract(BigDecimal.valueOf(principle))  //
    .doubleValue();
  }

  public static void main(String[] args) {
    LoanCalculator lc = new LoanCalculator (10_000,2.0,2);
    System.out.println(lc.totalInterestAfterYears());
  }
}
