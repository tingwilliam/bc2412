public class DemoComparison {
  public static void main(String[] args) {
    // ! >, <, .>=, <=, !=, == (true or false)
    // "==" -> asking if they are equals
    // "=" -> assignment

    int age = 20;
    boolean isAdult = age >= 18; // adult defintion
    System.out.println(isAdult); // true

    double pi = 3.14159;
    boolean isCorrect = pi == 3.14159;
    System.out.println(isCorrect); // true

    char gender = 'F';
    boolean isMale = gender == 'M';
    System.out.println(isMale); // false

    float price = 10.2f;
    System.out.println(price !=10.2f); //false
    System.out.println(price !=10.2); //false, during comparsion, convert price to double before comparsion
    
    //! operator (NOT)
    boolean result = !isAdult;
    System.out.println(result);//false

    if (age >=18) {
      //do something ...
    }

    if (age >=18) { // age < 18
      //do something ...
    }

    if (!isAdult) {
      //do something ...
    }

    int age2 = 30;
    char gender2 = 'F';
    //&& AND
    boolean result2 = age2 >= 30 && gender2 == 'M';
    // event 1: age2 .= 30 -> true
    // event 2: gender2 == 'M' -> false
    System.out.println(result2); // false

    //|| OR
    boolean result3 = age2 >= 30 || gender2 == 'M';
    // event 1: age2 .= 30 -> true
    // event 2: gender2 == 'M' -> false
    System.out.println(result3); // true

    //|| OR (false || false)
    int age3 = 18;
    char gender3 = 'F';
    boolean result4 = age3 == 31 || gender3 == 'M';
    System.out.println(result4); // 

    //AND OR (true AND (false OR true))
    int age4 = 30;
    char gender4 = 'F';
    boolean result5 = age4 > 28 && (gender4 == 'F' || age4 > 18);
    System.out.println(result5);

    // ! The ordering of event checking is defferent
    // AND go first
    boolean result6 = age2 >= 30 && gender2 == 'M' || age2 > 18;
    System.out.println(result6);
    //Step1: age2 >= 30 && gender2 == 'M' -> true && false -> false
    //Step2: true || false -> true

  }
}
