public class Exercise20241210 {

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


  }
}