import java.util.function.Function;

// Function (Java Built-in interface)
public class StringLengthFunction implements Function<String, Integer>{
  @Override
  public Integer apply(String s) {
    return s.length();
  }
  
  public static void main(String[] args) {
    //traditional Class & Interface
    StringLengthFunction slf = new StringLengthFunction();
    System.out.println(slf.apply("hello")); //5

    //Lambda Expression ->
    Function<String, Integer> stringLength = s -> s.length();
    System.out.println(stringLength.apply("hello")); //5
  }
}
