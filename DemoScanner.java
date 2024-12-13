import java.util.Scanner;

//JDK vs Java Project (load built-in tools, String, Primitives)
//proactively import non-built-in tools (Scanner)
public class DemoScanner {
  public static void main (String [] aigs) {
    String s = "abc" ;
    Scanner scanner = new Scanner(System.in);

    System.out.println(" Please input a number");
    int day = scanner.nextInt();//scanner.next
    //num = num * 2;
    //System.out.println("num=" + num);//String +int -> String
    
    //scanner.nextLine();

    //System.out.println("Please input a string:");
    //String str = scanner.nextLine();
    //System.out.println("str" + str);
    //for (int i = 0 ; i < num ; i++ ){
    //System.out.println("hello");
    //}
    //num -> numbers of days
    // for loop
    int totalMinutes = 0;
    for (int i = 0 ; i < day ; i++) {
      for  (int j = 0 ; j < i ; j++)
    totalMinutes += 24*60;
  }
    System.out.println(totalMinutes);

  }
  
}
