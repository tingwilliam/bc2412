import java.util.Scanner;

public class JavaQuest2 {

  public static void main(String[] args) {
    double priceForApple = 7.3;
    double priceForOrange = 6.5;
    int quantityOfApple = 3;
    int quantityOfOrange = 4;

    double x = priceForApple * quantityOfApple + priceForOrange * quantityOfOrange;
//x = 21.9 + 26
//x = 47.9
    System.out.println(x); // (47.9)

    int mathScore = 73;
    int englishScore = 60;
    int historyScore = 61;


    double x2 = (mathScore + englishScore + historyScore) / 3.0;
//x = 194 / 3
//x = 64.66666
    System.out.println(x2); // (64.66666)

    //byte -> short -> int -> long
    byte maxByte = 127;

    //int value -> byte
    maxByte = (byte)(maxByte - 2); //Java: is it safe? Not safe
    //byte value + int value ->int value
    //can we assign int value to byte variable? (downcating)

    System.out.println(maxByte); // -127. overflow

    int x3 = maxByte; //Java: is it safe? it is safe



    // ! Java (1) Compile time + (2) Run time
    // (1) java file (.java) -> class file (.class): java code -> byte code (machine)
      // (1.1) compile fail. for example (missing ; -> syntax error)
      // (1.2) compile success -> class file
    // (2) Java Virtual Machine (JVM) -> convert class file to machine code -> execute machine code

    int a = 10;
    if (a == 9) {
      System.out.println("a is equals to 9");
    } else if (a >= 0 && a < 9 ) {
      System.out.println("a is between 0 and 8");
    // how about a > 9?
    } else if (a > 9) {
      System.out.println("a > 9");
    } else if (a < 0 ){
      System.out.println("a < 0");
    }
    String str = "I love Java. I love coding";
    if (str.length() == 27) {
      System.out.println("str length=27");
    } else if (str.length() < 27) { // code here ... add the condition
      System.out.println("str length < 27");
    } else if (str.length()  > 27) { // code here ... complete the code
      System.out.println("str length > 27");
    }


    }  
      
  



  }
