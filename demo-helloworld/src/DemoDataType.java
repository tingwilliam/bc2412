public class DemoDataType {
  public static void main(String[] args) {
    // Comment. Welcome to bootcamp! @
    // ! 1. Data Type (8 Primitive)
    // int (data type ->Integer
    //x, day0fWeek -> variable
    int x =3; //from right to left
    int day0fWeek = 7;
    // int y =3.2; //! not OK, y is a variable that can store integer onlt.

    double y2 =3.2;
    //double 2w = 10.0:// !not OK

    //variable namingconvension
    //caml case: day0fWeek, y2

    // ! x cannot be declared twice
    //int x =102;

    // Variable Declaration
    int x100;
    // Value Assignment
    x100 = 9;


    //Re-assignmentg
    x = 101; // re-assign 101 to x
    x = x + 10; // right: 101 +10, left: assign 111 to x
    x = x - 40; // 111 - 40 -> 71
    x = x * 3; // 71 * 3 -> 213
    x = x / 213; //213 / 213

    //Print out 
    System.out.println(x); // 1
    x = x + 8 * 2 / 4 + 1; 
    // 8 * 2 / 4 -> 4
    // 1 + 4 + 1
    // 6
    System.out.println(x); // 6

    x = (x + 2) * 2 / (3 +1);
    System.out.println(x); // 4

    x = ((x + 3) /  (6 + 1)) * (x + 1);
    System.out.println(x); // 5

    //divide by 0
   // int f = 10 / 0; // ! error
    // System.out.println(f); 

    //0 / 10
    System.out.println(0 / 10); // 0

    // divide
    int x2 = 3 / 2;
    // Step 1: 3 -> int value, 2 -> int value
    // Step 2: int value / int value -> int value
    // Step 3: 3 /2 -> 1
    // Step 4: assign 1 (int value) to int type variable (OK!)
    System.out.println(x2); // 1

    double x3 = 3/ 2;
    // Step 1: 3 -> int value, 2 -> int value
    // Step 2: int value / int value -> int value
    // Step 3: 3 /2 -> 1
    // Step 4: assign 1 (int value) to double type variable (convert 1 to 1.0)
    System.out.println(x3); // 1.0

    double x4 =3.0 / 2;
    // Step 1: 3.0 -> double value, 2 -> int value
    // Step 2: double value / int value -> double value
    // Step 3: 3.0 / 2.0 -> 1.5
    // Step 4: assign 1.5 (double value) to double type variable 
    System.out.println(x4); // 1.5

    // ! int x5 = 3.0 / 2;
    // Step 1: 3.0 -> double value, 2 -> int value
    // Step 2: double value / int value -> double value
    // Step 3: 3.0 / 2.0 -> 1.5
    // Step 4: assign 1.5 (double value) to int type variable (downcasting)
    // ! Not allow assign a higher level value to a lower level type of variable

    //int ->double (upcast)
    //double  -> int (downcast)

    //! Store Integer. Java: int, byte, short, long
    int value=1000000;
    int value2=1_000_000;
    int maxInteger = 2_147_483_647;
    //int maxInteger = 2_147_483_648;
    //int maxInteger = -2_147_483_6479;

    // !byte -128 to 127
    // -128 ->int value
    //assign an int value to byte type variable
    byte b1 = -128;
    byte b2 = 127;

    // !short -32768 to 32767
    //-32768 -> int value
    short s1 = -32_768;
    short s2 = 32_167;

    // !long
    // 2_147_483_648 ->int value
    //int value ->double type variable

    long l1 = 2147483648L; // " L" -> declare it is a long value
    // ! Step 1: declare an int value (NOT OK)
    // ! Step 2: convert an int value to long type

    // ! Declare a hardcode long value, you should always add "L"
    long L2 = 2147483648L;

    //float -> double
    double d1 = 10.2; // 10.2 -> double value
    double d2 = 10.2d; //10.2d -> double value
    float f1 = 10.2f; // 10.2f -> float value
    float f2 = 10000000000000000.22222222222f;

    // conversion
    float f4 = 10.2f;
    double d3 = f4; // assign float value to double variable
    //float f5 = d3; // ! not safe

    double d4 = 10.2f; // upcasting (float -> double)

    double d5 = f4 + 10.2d;
    // float + double -> double
    System.out.println(d5); // 20.3999

    double d6 = 0.2 + 0.1;
    System.out.println(d6); // 0.300000

    double d7 = 0.2 + 0.2;
    System.out.println(d7); // 0.4

    // - * / on double

    char c = 'x';
    char c2 = '1';
    char c3 = '!';
    char c4 = ' '; // space
    // char c5 = ''; // ! at least one character

    //boolean
    boolean b = true;
    boolean b10 = false;

    boolean isSmoker = false;
    int age = 66;
    boolean isElderly = age>65; //"age >65" ->asking if age >65 (yes no question)
    System.out.println(isElderly); // true

    int age2 = 18;
    boolean isAdult = age2 >=18;
    System.out.println(isAdult); // true

    char q = 'a';
    int u = q ; // !char value can be assigned to int ???
    System.out.println(u); //97
    // char -> int

    char q2 = 97;
    System.out.println(q2);
    // char q3 = 70000;

    //ASCII code(0-127)
    // a -> 97
    // b -> 98
    // ...

    //0, A, a
    //48. 65, 97

    char q1 = '0';
    int u1 = q1 ; // !char value can be assigned to int ???
    System.out.println(u1);//48

    char q3 = 'A';
    int u2 = q3 ; // !char value can be assigned to int ???
    System.out.println(u2);//65

    char q4 = 65;
    System.out.println(q4);//A
    int u4 = q4 ; // !char value can be assigned to int ???
    System.out.println(u4);

    char q5 = 10000;
    System.out.println(q5);
    char q6 = '你';
    int u6 = q6 ; // !char value can be assigned to int ???
    System.out.println(u6); // 20320

    char q7 = '悶';
    int u7 = q7 ; // !char value can be assigned to int ???
    System.out.println(u7); //24758

    //char q8 = 70000; //!out of the range of char value

    // byte -> short -> int -> long -> float -> double
    float f11 =97;
    double d11 =97;
    //char -> int -> long -> float -> double
    long l10 = 'a';
    float f10 = 'a';
    double d10 = 'a';

    String s;
    s.c






  }
}
