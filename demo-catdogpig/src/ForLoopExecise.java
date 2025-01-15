public class ForLoopExecise {
  public static void main(String[] args) {
    
    //Searching
    String str = "abcdefghi";

    boolean find = false;
    for(int i =0; i< str.length() ; i++) {
      if(str.charAt(i) =='a') {
        find = true;
      }
    }
    System.out.println(find);
    System.out.println(" ");

    String str2 = "hello";
    String findIt = "ll";
    String findIt2 = "lo";

    boolean ans = false;
    for(int i=0 ; i < str2.length() - findIt.length(); i++) {
      if (str2.substring(i, i + findIt.length()).equals(findIt)) {
        ans = true;
        break;
      }
    }
    System.out.println(ans);

    boolean ans2 = false;
    for(int i=0 ; i <= str2.length() - findIt2.length(); i++) {
      if (str2.substring(i, i + findIt2.length()).equals(findIt2)) {
        ans2 = true;
        break;
      }
    }
    System.out.println(ans2);


//Counting
    String q ="Helllllllllllo";
    int count = 0;
    for(int i =0; i < q.length(); i++) {
      if(q.charAt(i) == 'l') {
        count++;
      }
    }
    System.out.println(count);

     //char t = "hello".charAt(4);
    //System.out.println(t); //o

    count = 0;
    for(int i = 0; i <q.length(); i++) {
      if(q.charAt(i) != 'l') {
        continue;
      }
      count++;
    }
    System.out.println(count);

    System.out.println(" ");



    for(int i = 1; i<101 ; i++) {
       if(i % 3 == 0 && i % 4 != 0
       || i % 4 == 0 && i % 3 !=0
       || i %3 != 0 && i% 4 !=0) {
       continue;
       }
       System.out.print(i);
    }

    System.out.println(" ");

    for (int i = 1 ; i < 101 ; i++) {
      if (i % 3 == 0 && i % 4 == 0) {
      System.out.println(i);
        }
      }

      System.out.println(" ");







      }

    }
