import java.nio.file.SecureDirectoryStream;

public class DemoSwitch {
  public static void main(String[] args) {
    int x = 1;
    if (x == 1){
    System.out.println("x=1");
   } else if (x == 2) {
    System.out.println("x=2");
   } else if (x ==3)  {
    System.out.println("x=3"); // print
   } else {
    System.out.println(" simethings else ...");
   }

   // switch
   switch (x) { // checking x == ?
    case 1:
    System.out.println("x=1");
    break;
    case 2:
    System.out.println("x=2");
    break;
    case 3:
    System.out.println("x=3");
    break;
    default:
    System.out.println("something else ...");
    }

    char gender = 'M'; //F, M (Well defind value range)
    switch (gender) {
      case 'M':
      System.out.println("Males");
      break;
      case 'F':
      System.out.println("Famale");
      break;
      default:
      System.out.println("unknown");
    }








   }
  
}
