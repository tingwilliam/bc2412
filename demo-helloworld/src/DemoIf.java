public class DemoIf {
  public static void main(String[] args) {
    // if -> check event -. event result
    int x = 3;
    if (x > 2) { // "x > 2" is an event -> true/false
      System.out.println("x is > 2.");
    }

    String s = "hello";
    // check if length > 3
    if (s.length() > 3) {
    System.out.println("s length >3.");
  }else{
    System.out.println("s length <3.");
  }
    // equal(), charAt()
    if (s.equals("hello")) {
      System.out.println("true");

      if (s.charAt(1) == 'e') {
        System.out.println("The chat at index 1 =e");
      }
      if (x > 5) {
        System.out.println("x > 5.");
      } else { // x <=5
        System.out.println("x <= 5.");
      }
      int y = 10;
      // check it y is an even number
      if (y % 2 == 0) {
        System.out.println("it is an even number"); // can print
      }

      if (y % 2 == 1) {
        System.out.println("it is not odd number"); // cannot print

      }
      // check if y > 3 and y is even number
      if (y > 3 && y % 2 == 0) {
        System.out.println("y > 3 and y is an even number");
      }
      char k = 'k';
      if (k == 'k') {
        System.out.println("it is k.");
      }
      int age = 17;
      boolean isAdult = age >= 18;

      if (isAdult == false) {
        System.out.println("It is not an adult");
      }
      if (!isAdult) {
        System.out.println("It is not an adult");
      }

    int score = 100;
    char gender = 'F';
    // score >=90, grade A
    // ! score between 85 and 89 for female, grade T
    // ! score between 87 and 89 for male, grade T
    // score between 80 and 84 for female, grade B
    // score between 80 and 86 for male, grade B
    // score between 70 and 79, grade C
    // under 70, grade F
    char grade = ' ';
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 85 && score <= 89 && gender == 'F' || score >= 87 && score <= 89 && gender == 'M') {
      grade = 'T';
    } else if (score >= 80 && score <= 84 && gender == 'F' || score >= 80 && score <= 86 && gender == 'M') {
      grade = 'B';
    } else if (score >= 70 && score <= 79) {
      grade = 'C';
    } else {
      grade = 'F';
    }

    System.out.println(grade); // C

    //Test case
    // 1. M 90 ->A
    // 2. F 90 ->A
    // 3. M 87 ->T
    // 4. F 85 ->T
    // 5. M 80 ->B
    // 6. F 80 ->B
    // 7. M 70 ->C
    // 8. F 70 ->C
    // 9. M 69 ->F
    // 10. F 69 ->F


    }
  }



}


