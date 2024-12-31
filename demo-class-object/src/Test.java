import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    //Compile time
    // Run time -> p1.getAge()

    Person p1 = null; //
    // p1. getK(); // Compile Error -> p1 dome from Person.class, and this class has NO getK() method

    //p1.getAge();
    //Compile OK -> pl come from Person.class, and this class has getAge() method
    //Runtime Error -> because p1 object reference finally cannot point to an object.

    String1 str = new String1("abc");
    System.out.println(str.charAt(1)); // b
    System.out.println(str.length()); // 3
    //System.out.println(str.startsWith('a')); //true

    String sentence = "hello world";
    String[] subSentences = sentence.split("");
    System.out.println(Arrays.toString(subSentences)); // [hello,world]


    //BDDBCDCEBB
  }
  }