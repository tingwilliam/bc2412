import java.util.Scanner;

public class ExceptionExercise3 {
  // Question: Create a custom exception called InvalidAgeException. Throw this exception if a user
  // enters an age less than 18.

  // 1. If NumberFormatException is caught, print "Error: Please enter a valid number."
  // 2. Pass the age number into a static method checkAge(). 
  // This method will throw a custom exception InvalidAgeException if the age < 18; otherwise, print "Age X is accepted".
  // 3. For the method caller, handle the potential exception by printing "Age is invalid. Please input again later."
public static int checkAge (int x) {
  if (x >= 18) {
    return x;
  } else { 
    throw new InvalidAgeExecption();
  }
}

  public static void main(String[] args) {
        // code here for the caller...
    try{
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the age: ");
    int inputAge = Integer.parseInt(scanner.nextLine());
    
  // code here for the method
      System.out.println("Age" + checkAge(inputAge) + "is accepted");
    }catch (NumberFormatException e) {
      System.out.println("Error: Please enter a valid number.");
    }catch (InvalidAgeExecption e) {
      System.out.println("Age is invalid. Please input again later.");
    }
  }
}