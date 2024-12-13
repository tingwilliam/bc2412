import java.util.Scanner;

public class JavaQuest3 {
  /**
   * Expected Output:
   * 
   * Example 1: Input a month number: 2 Input a year: 2016
   * 
   * February 2016 has 29 days
   * 
   * Example 2: Input a month number: 12 Input a year: 2014
   * 
   * December 2014 has 31 days
   */

  // Program the number of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    int numberOfDaysInMonth = 0;
    String monthOfName = "unknown";


    System.out.print("Input a month number: ");
    int month = input.nextInt(); // assume 1 - 12

    System.out.print("Input a year: ");
    int year = input.nextInt(); // > 0

    // The February has 29 days: (Every 4 years and the year cannot divded by
    // 100) or The year can divided by 400
    // otherwise the February should have 28 days only

    boolean isLeapYear = true;
    if (year % 400 == 0 && year % 4 == 0 && year % 100 != 0) {
      isLeapYear = false;
    }

    if (month == 1) {
      numberOfDaysInMonth = 31;
     monthOfName = "Jan" ;
    }else if (month == 2) {
    monthOfName = "Feb" ;
      if (isLeapYear == true) {
        numberOfDaysInMonth = 29;
      } else {
        numberOfDaysInMonth = 28;
      }
    } else if (month == 3) {
      numberOfDaysInMonth = 31;
      monthOfName = "Mar" ;
    }else if (month == 4) {
      numberOfDaysInMonth = 30;
      monthOfName = "Apr" ;
    }else if (month == 5) {
      numberOfDaysInMonth = 31;
      monthOfName = "May" ;
    }else if (month == 6) {
      numberOfDaysInMonth = 30;
      monthOfName = "Jun" ;
    }else if (month == 7) {
      numberOfDaysInMonth = 31;
      monthOfName = "Jul" ;
    }else if (month == 8) {
      numberOfDaysInMonth = 31;
      monthOfName = "Aug" ;
    } else if (month == 9) {
      numberOfDaysInMonth = 30;
      monthOfName = "Sep" ;
    } else if (month == 10) {
      numberOfDaysInMonth = 31;
      monthOfName = "Oct" ;
    } else if (month == 11) {
      numberOfDaysInMonth = 30;
      monthOfName = "Nov" ;
    } else if (month == 12) {
      numberOfDaysInMonth = 31;
      monthOfName = "Dec" ;
    } 
    else
    {
      monthOfName = "error";
    }
    System.out.println(
        monthOfName + " " + year + " has " + numberOfDaysInMonth + " days");
  }

}