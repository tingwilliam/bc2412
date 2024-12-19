public class training {
  public static void main(String[] args) {

    System.out.println("dear my friend");

    int a = 1 + 1;
    System.out.println (a); // 2

    int b = 4 * 2;
    System.out.println (b); //8

    int c = 3 / 2;
    System.out.println (c); //1


    double d = 3.0 / 2;
    System.out.println (d); //1.5

    double e = 3 / 2.0;
    System.out.println(e); //1.5

    double f = 3 / 1.5;
    System.out.println(f); //2.0

    double g = 22.0 / 7;
    System.out.println(g); //2.0

    byte h = 42 * 3 ;
    System.out.println(h); //126

    float i = 1000 / 225f;
    System.out.println(i); //4.4444447

    float j = 42.2f;
    double k = j;
    System.out.println(k); //42.20000076293945

    // int l = 126; 
    // ! byte m = l; byte-> int
    //System.out.println(m+500); not OK

    char l = 'a';
    char l2 = ' ';
    char l3 = '=';
    System.out.println(l); //a
    System.out.println(l2); //
    System.out.println(l3); //=

    double peter = 65;
    boolean isYounger = peter<=65; 
    System.out.println(isYounger); //true

    double pi = 3.14159;
    boolean isCorrect = pi == 3.14159;
    System.out.println( "this is " + isCorrect); // this is true

    String password = "abcd1234";
    String emailAddress = "abc@gmail.com";
    System.out.println("password"); //password
    System.out.println(password); //abcd1234
    System.out.println("password is " + password); //password is abcd1234
    password = password + 5; 
    System.out.println("password is " + password); //password is abcd12345
    System.out.println(emailAddress); //abc@gmail.com

    char firstWord = 'A';
    String idCardNum = "123456";
    char lastWord = '7';
    idCardNum = firstWord + idCardNum + '(' + lastWord + ')';
    System.out.println(idCardNum);
    System.out.println(firstWord + idCardNum + '{' + lastWord + '}');

    char num = idCardNum.charAt (8);
    System.out.println(num);
    char num2 = idCardNum.charAt (2);
    char num3 = idCardNum.charAt (3);
    System.out.println(num2 + "" + num3);

    int howManyWord = idCardNum.length();
    System.out.println(howManyWord);

    String a1 = "A123456(7)";
    String a2 = "AA123456(7){7}";
    boolean result1 = a1.equals(a2);
    System.out.println(result1);

    String q = "hello" ;
    if(q.equals("hello")) {
    System.out.println("true");
    } else {
    System.out.println("false");
    }

  }

 













  }
