public class String1 {
  private char[] arr;
  //constructor
  public String1(String s) {
    this.arr = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      this.arr[i] = s.charAt (i);
    }
  }

  public char charAt (int index){
    return this.arr[index];
}

public int length() {
    return this.arr.length;
}

public boolean startWith(char value) {
  return this.arr[0] == value;
  
}
  public static void main(String[] args) {
    String1 str = new String1("abc");
    System.out.println(str.charAt(1)); //b
    System.out.println(str.length()); //3
    System.out.println(str.startWith('a')); //true

  }
  

}
