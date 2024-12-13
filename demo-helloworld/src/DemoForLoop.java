import org.w3c.dom.css.Counter;

public class DemoForLoop {
  public static void main(String[] args) {
    // 2^100
    int x = 2;
    x = x * 2;
    x *= 2;
    System.out.println(x);

    // For Loop
    // for( ; ; ) {
    // }

    // "i < 3" -> continue crteria
    // "i++" -> modifier
    // ! You have to let the modifier work with " continue criteria",
    // ! so that continue crteria at the end become false
    for (int i = 0; i < 3; i++) { // 3 - 0
      System.out.println("hello)");
    }
    // Step 1: int i = 0;
    // Step 2: i < 3 (question) -> true
    // Step 3: if true, print hello
    // Step 4: i++, i become 1
    // Step 5: i < 3 (question) -> true
    // Step 6: if true, print hello
    // Step 7: i++, i become 2
    // Step 8: i < 3 (question) -> true
    // Step 9: if true, print hello
    // Step 10: i++, i become 3
    // Step 11: i < 3 (question) -> false
    // Step 12: exit for loop

    for (int i = 0; i < 5; ++i) { // 0,1,2,3,4
      System.out.println("hello)");
    }

    // print even numbers
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) { // even number definition
        System.out.println(i);
      }
    }
    // print 0 - 100, divided by 3 and divided by 4
    for (int i = 0; i < 101; i++) {
      if (i % 3 == 0 && i % 4 == 0)
        System.out.println(i);
    }

    // sum up 0 - 20: 0 + 1 + 2... + 20
    int sum = 0;
    for (int i = 0; i < 21; i++) // i=i+1
    {
      sum += i; // sum = sum + i;
    }
    System.out.println(sum); // 210
    // System.out.println(i); ! i is declared within the for loop

    // sum up all odd number between 0 - 10
    // sum up all even number between 0 - 10
    // ! Find the difference between evenSum and oddSum -> positive number
    int oddSum = 0;
    int evenSum = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 1) {
        oddSum += i;
    }else {
    evenSum += i;
      }
    }
    //int diff = -1;
    // if (oddSum > evenSum) {
    //   diff = oddSum - evenSum;
    //} else {
    //   diff = evenSum - oddSum;
    //}
    int diff = oddSum > evenSum ? oddSum -evenSum : evenSum - oddSum;
    System.out.println(diff); // 5

    for (int i2 = 0; i2 < 11; i2++) {
      if (i2 % 2 == 0)
        System.out.println(sum);
    }


    // Searching
    String str = "abcedfghi";

    // 1. Check if 'd' exists in the string.
    // for loop + if +chart
    boolean found = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'd') {
        found = true;
        break; // break the nearest loop
      }
    }

    System.out.println(found);

    // Test Case:
    // 1. "abcdefghi"
    // 2. "abcefghi"
    // 3. " "
    // 4. "abcdefghijkd"

    // 2. check if the string value contains given sub-string
    String substr = "ll";
    String str2 = "hello";

    boolean isSubstringExist = false;
    for (int i = 0; i < str2.length() - substr.length(); i++) {
      if (str2.substring(i, i + substr.length()).equals(substr)) {
        isSubstringExist = true;
        break;
      }
    }
    // for loop + substring
    System.out.println(isSubstringExist); // true

    // Counting
    String s = "hellllllo";
    //Count the number of 'l'
    // for + if
    int count = 0;//0係基數
    for (int i = 0; i < s. length(); i++){ //loopall values +filtering
    if (s.charAt(i) == 'l') {
      count++;
    }
    }
    System.out.println(count);

    // continue - skip the rest, go to next iteration
    count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != 'l') {
        continue; // skip count++, go to i++
    }
    }
    
    // 1-100, print all numbers., which can be divided by 3 and 4
    // continue
    for (int i = 1 ; i < 101 ; i++) {
    if (i % 3 == 0 && i % 4 != 0 
    || i % 4 == 0 && i % 3 != 0 
    || i % 3 != 0 && i % 4 != 0 ){
    continue; //skip print
    }
    System.out.println(i);
    }
    for (int i = 1 ; i < 101 ; i++) {
    if (i % 3 == 0 && i % 4 == 0) {
    System.out.println(i);
      }
    }

    // Nested Loop
    for (int i = 0; i < 3 ; i++) {
      // i = 0
      for (int j = 0; j < 4; j++) {
        //System.out.println("*"); // print and next line
        System.out.print("*"); // print
      }
      //go to i++
    }

    // !Step 1: i = 0, j = 0, print *
    // Step 2: i = 0, j = 1, print *
    // Step 3: i = 0, j = 2, print *
    // Step 4: i = 0, j = 3, print *

    // !Step 5: i = 1, j = 1, print *
    // Step 6: i = 1, j = 2, print *
    // Step 7: i = 1, j = 3, print *
    // Step 8: i = 1, j = 4, print *

    // !Step 9: i = 2, j = 2, print *
    // Step 10: i = 2, j = 3, print *
    // Step 11 i = 2, j = 4, print *
    // Step 12: i = 2, j = 5, print *

    // *
    // **
    // ***
    // ****

    System.out.println();
    for (int i = 0; i < 1 ; i++) {
      for (int j = 0; j < 1; j++) {
    System.out.println("*"); 
      }
    }
    for (int i1 = 0; i1 < 1 ; i1++) {
      for (int j1 = 0; j1 < 2; j1++) {
    System.out.print("*");
      }
    }
    System.out.println();
    for (int i1 = 0; i1 < 1 ; i1++) {
      for (int j1 = 0; j1 < 3; j1++) {
    System.out.print("*");
      }
    }
    System.out.println();
    for (int i1 = 0; i1 < 1 ; i1++) {
      for (int j1 = 0; j1 < 4; j1++) {
    System.out.print("*");
      }
    }
    
    System.out.println();

    for (int i1 = 0; i1 < 4; i1++) {
      for (int j1 = 0; j1 < i1; j1++) {
        System.out.print("*");
  }
    System.out.println("*");
}
int n = 4;
for (int i = 0; i < n; i++) {
  for (int j = 0; j < i + 1; j++) {
    System.out.println("*");
  }
    System.out.println("");
}


  }
}


