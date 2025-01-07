public interface Shape2 {
  //Problem:
  //No attribute
  //Before Java 8, no static & no default method
  double area();

  default double calculate() {
    return area() +3;
  }


  
}
