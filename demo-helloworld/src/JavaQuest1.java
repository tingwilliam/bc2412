/**
 * Expected Output:
 * 
 * I am going to add two numbers together:
 * The first one: 31
 * The second one: 42
 * The sum is 73
 * The subtraction reuslt is 11
 * The another sum result is 130
 * The variable varB is false
 * The variable varC is true
 * The variable fnumber is -130.2
 * The variable dnumber is -20.5
 * The variable reminder is 1
 * The variable result is 3
 */
// Primitive types and operators
public class JavaQuest1 {

  public static void main(String[] args) {

    System.out.println("I am going to add two numbers together:");

    int first = 31;
    // declare the second one
    // code here ...
    System.out.println("The first one: " + first);

    int second = 42;
    System.out.println("The second one: " + second);

    int sum = first + second;
    // Add two numbers and print it out
    // code here ...
    System.out.println("The sum is " + sum);

    int subtract = second - first;
    // subtraction
    // code here with tips, pls fix ...
    // subtract = first - second
    System.out.println("The subtraction reuslt is " + subtract);

  
    // another sum
    byte b1 = 60;
    byte b2 = 70;
    sum = b1 + b2;
    // code here with tips, pls fix ...
    // sum = b1 + b2;
    System.out.println("The another sum reuslt is " + sum);

    boolean varB = true;
    boolean varC = false;
    // declare two boolean variable with true and false value
    // code here
    System.out.println("The variable varB is " + varB);
    System.out.println("The variable varC is " + varC);

    // Reading Example
    float fnumber = -130.20f; // By default, numbers are treated as double in Java.
    // Use suffix 'f' with value to make it float.
    double dnumber = -20.50d;
    System.out.println("The variable fnumber is " + fnumber);
    System.out.println("The variable dnumber is " + dnumber);

     // Find reminder. Declare variable a & reminder
     int a = 7;
     int b = 3;
     // Fix it ...
     int reminder = a - 2 * b;
     System.out.println("The variable reminder is " + reminder);

    // declare a variable x and assign value to it.
    int e = 7;
    int o = 8;
    int y = 4;
    int x = 2;
    // code here ... define the x and assign value to it
    int result = e - o * x / y;
    //result = 7 - 8 * 2 / 4;

    System.out.println("The variable result is " + result);


  }
}