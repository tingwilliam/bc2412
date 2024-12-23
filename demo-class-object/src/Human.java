import java.math.BigDecimal;
import java.math.RoundingMode;

public class Human {
  private double height; //instance variable
  private double weight; //instance variable

    //Contructor
    public Human (double height, double weight) {
      this.weight = weight;
      this.height = height;
    }

    //instance method
    public double bmi() {
      return BigDecimal.valueOf(this.weight) //
      .divide(BigDecimal.valueOf(Math.pow(this.height,2.0)),2, RoundingMode.HALF_UP) //
      .setScale(2, RoundingMode.HALF_DOWN) // for other operation, +, -, *
      .doubleValue();
    }

    //instance method
    //Able to call object attribute & instance method
    public String bmiIndex() {
      double bmiValue = this.bmi();
      if (bmiValue > 35.0) {
        return "Extremely Obese";
      }else if(bmiValue >= 30.0 && bmiValue < 35) {
        return "Obese";
      }else if(bmiValue >= 25.0 && bmiValue < 30) {
        return "Overweight";
      }else if(bmiValue >= 18.5 && bmiValue < 25) {
        return "Normal";
      }else {
        return"Under Weight";
      }
      }

    //static method
    public static double bmi2(double weight, double height) {
      return BigDecimal.valueOf(weight) //
      .divide(BigDecimal.valueOf(Math.pow(height,2.0)),2, 
            RoundingMode.HALF_UP)
      .doubleValue();
    }
    //getter
    //public double getWeight() {
      //return this.weight;
    //}
    //public double getHeight() {
      //return this.height;
    //}
    //setter
    //public void setWeight(double weight) {
      //this.weight = weight;
//}
    //public void setHeight(double height) {
      //this.height = height;
//}
    //instance method
    //public double bmi(){
      //return BigDecimal.valueOf(this.weight)
      // .divide((BigDecimal.valueOf(this.height))
      // .multiply(BigDecimal.valueOf(this.height)))
      //.doubleValue();
    //}


public static void main(String[]args) {
    Human h1 = new Human (1.74, 68) ;
    System.out.println(h1.bmiIndex()); //Normal
    System.out.println(h1.bmi()); //22.46
    System.out.println(Human.bmi2(1.74, 68)); //22.46

}
}
