import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    String result = "Hello";
    for(int i= 0; i < 6; i++) {
      System.out.println(result);
    }

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    for(int i= 0; i < 5; i++) {
    if(i<5) {
    System.out.println(i);
    }
      //int[] arr2 = 
      //System.out.print(Arrays.toString(i));
    }
    


    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    for (int i = 2; i < 22; i++) {
      if (i % 2 == 0) { // even number definition
        System.out.println(i);
      }
    }
    // 4. Print the numbers, which can be divided by 3 or 5
    // Use: for loop + if
    for (int i = 0; i < 21; i++) {
      if (i % 3 == 0 && i % 5 == 0)
        System.out.println(i);
    }
    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int sum = 0;
    for (int i = 0; i < 15; i++)
    {
      sum += i; 
    }
    System.out.println(sum);
    // 6. sum up all odd numbers betwen 0 - 10
    sum = 0;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 1)
      sum += i;
    }
        System.out.println(sum);
    // Sum up all even numbers betwen 0 - 10

    // Find the product of evenSum and oddSum
    // Use: for loop + if
    sum = 0;
    for (int i = 0; i <= 10; i++) {
      if (i % 2 == 0)
      sum += i;
    }
        System.out.println(sum);
    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    boolean found = false;
    for (int i = 0; i < str7.length(); i++) {
      if (str7.charAt(i) == 'd') {
        found = true;
        break;
      }
    }
   if (found == true){
    System.out.println("d is found.");
    } else {
      System.out.println("d is not found.");
    }


    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";

      boolean isSubstringExist = false;
      for (int i = 0; i < s8a.length() - s8b.length()+1; i++) {
        if (s8a.substring(i, i + s8b.length()).equals(s8b)) {
          isSubstringExist = true;
          break;
        }
      }
      if (isSubstringExist == true){
        System.out.println("s8b is a substring.");
        } else {
          System.out.println("s8b is not a substring.");
        }

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';

    int count = 0;//0係基數
    for (int i = 0; i < s9. length(); i++){ //loopall values +filtering
    if (s9.charAt(i) == c9) {
      count++;
    }
    }
    System.out.println("count=" + count);


    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    for( int i =   0; i < arr10.length; i++) { 
      arr10 [i] = arr10 [i].replace("x" , "k");
    }
    System.out.println(Arrays.toString(arr10));
    
    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
    int count1 = 0;
    for (int i = 0 ; i < s11.length(); i++) {
      char upperCase = s11.charAt(i);
      if (upperCase >= 'A' && upperCase <= 'Z' ){
      count1++;
    }
    }
    System.out.println("count uppercase=" + count1);
 

    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****

    for (int i1 = 0; i1 < 3 ; i1++) {
      System.out.println("*****");
    }

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";
    int totalScore = 0; 

    for(int i = 0 ; i <s13.length(); i++) {
      char ch = s13.charAt(i);
    switch(ch) {
      case 'l':
      totalScore += 1;
      break;
      case 'r':
      totalScore += 3;
      break;
      case 'd':
      totalScore += 2;
      break;
      case 'u':
      totalScore += 4;
      break;
      default:
      totalScore -= 1;
      break;
      }
    }
    System.out.println("Total score: " + totalScore);

    
    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];
    arr14[0] = 1;
    arr14[1] = 4;
    arr14[2] = 9;
    arr14[3] = -4; 

    for (long value : arr14) {
      System.out.println(value);
  }

    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    long maxValue = arr14[0];
    long minValue = arr14[0];

    for (int i = 0; i < arr14.length; i++) {
      if (arr14[i] > maxValue) {
        maxValue = arr14[i];
      }
      if (arr14[i] < minValue) {
        minValue = arr14[i];
      }
    }
    System.out.println("max value:" + maxValue);
    System.out.println("min value:" + minValue);

    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.5

    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    // Use: BigDecimal

    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";



   //char[] arr = new char [s. length()];
    //for (int i = 0; i < indices.length; i++) {
        //arr[indices[i]] = s.charAt(i);
    



    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
    
  
}
}