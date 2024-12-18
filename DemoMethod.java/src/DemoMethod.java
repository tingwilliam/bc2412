public class DemoMethod {

    //! sum(int x, int y) -> input parameters
    //! int -> return type
    public static int sum(int x, int y) {
        int result = x + y;
    return result;
    }

    public static double subtract(double a, double b) {
    return  a - b; 
    }

    public static int multiply(int x, int y) {
        int result = x * y;
    return result; 
    }

    //source -> "hello"
    //target 'l'
    //return 2
 
    public static int countCharacter(String source, char target) {
      // toCharArray
      int count = 0;
    for (int i = 0 ;i < source.length(); i++); {
        if (target == source.charAt(i) ) ;
        count++;
    } 
    return count;
    }
////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    int x = 3;
    int a = 10;
    int b = 11;
    int y = a + b;
    System.out.println(y); //21
    a = 19;
    b = 21;
    y = a + b;
    System.out.println(y); //40

    //call sum() method
    y = sum(10, 11);
    System.out.println(y); //21
    y = sum(19, 21);
    System.err.println(y); //40

    //call subract() method
    double c;
    c = subtract(10, 11);
    System.out.println(c); //-1.0
    c = subtract(19, 11);
    System.out.println(c); //8.0
    
    y = multiply(10, 11);
    System.out.println(y); //110
    y = multiply(19, 11);
    System.out.println(y); //209

    System.out.println(countCharacter("hello", 'l')); //2
    System.out.println(countCharacter("abc", 'l')); //0
    System.out.println(countCharacter("", 'l')); //0
    System.out.println(countCharacter("abc", 'a')); //1





}
}
