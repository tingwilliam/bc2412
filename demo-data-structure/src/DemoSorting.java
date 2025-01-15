import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSorting {
  public static void main(String[] args) {
    // bubble sort (Nested Loop)

    List<Integer> integers = Arrays.asList(1, 3, 10, -4, 2);

    // integers = Collections.sort(integers);
    Collections.sort(integers); // pass by reference
    System.out.println(integers); // [-4, 1, 2, 3, 10]

    int[] arr = new int[] {10, 2, 9};
    allZero(arr);
    System.out.println(Arrays.toString(arr)); // [0, 0, 0]

    // In Java, array & all custom types are always pass by reference.
    // Primitive, wrapper class & String are always pass by value (a copy of value)

    // Custom Type (Book)
    Book book = new Book("Sun");
    changeBookName(book); // pass by Book reference
    System.out.println(book); // Book[name=hello]

    // Primitives or Wrapper Class
    int a = 3;
    int b = 4;
    System.out.println(sum(a, b)); // 300
    System.out.println(a); // 3, but not 100, because we pass by value for primitives
    System.out.println(b); // 4, but not 200, because we pass by value for primitives
  }

  public static int sum(int x, int y) {
    x = 100;
    y = 200;
    return x + y;
  }

  public static String concat(String x, String y) {
    return x.concat(y);
  }

  // overflow -> int * int -> int
  // long * long -> long -> Long
  public static Long multiply(int x, int y) {
    return (long) x * (long) y; // avoid overflow
  }

  public static void allZero(int[] arr) { // pass by object reference
  // public static int[] allZero(int[] arr) { // pass by object reference
    for (int i = 0; i < arr.length; i++) {
      arr[i] = 0;
    }
  }

  public static Book changeBookName(Book book) {
    book.setName("hello");
    return new Book("hello"); //Similar to BigDecimal
  }

  // BigDecimal? pass by value OR pass by reference
  public static BigDecimal addBigDecimal(BigDecimal orignal, BigDecimal delta) {
    //Can you revise the value inside a BigDecimal Object?
    return orignal.add(delta); //always return a new BigDecimal Object
  }
}