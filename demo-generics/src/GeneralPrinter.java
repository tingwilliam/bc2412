// Generics Design -> Reduce number of class
public class GeneralPrinter<T> { //<T> present the scope of "T" insode the class
  private T value;

  public GeneralPrinter(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }
  
  public String print() {
    return "this is " + this.value.toString();
  }

  public static void main(String[] args) {
    GeneralPrinter<Integer> printer = new GeneralPrinter<>(Integer.valueOf(3));
    GeneralPrinter<Integer> printer2 = new GeneralPrinter<>(Integer.valueOf(3));

    Object obj = 3;
    if(obj instanceof Integer) { // safety concern
      Integer integer = (Integer) obj;
      System.out.println(integer.compareTo(2)); // true
    }
  }
}
