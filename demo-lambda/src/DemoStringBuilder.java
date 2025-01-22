public class DemoStringBuilder {
  public static void main(String[] args) {
    String s = "hello";
    s += "!!!";
    s += "???";

    System.out.println(System.currentTimeMillis()); //1737012418387
    s = "";
    long before = System.currentTimeMillis();
    for(int i =0; i < 100_000; i++) {
      s += "!";
    }
    long after = System.currentTimeMillis();
    System.out.println(after - before); //285ms

    StringBuilder sb = new StringBuilder("");
    before = System.currentTimeMillis();
    for (int i = 0; i < 100_000; i++) {
      sb = sb.append("!") ;  //similar to setter
    }
    System.out.println(sb.length()); //100000
    after = System.currentTimeMillis();
    System.out.println(after-before); // 3ms

    sb = new StringBuilder("abcd");
    sb.reverse(); //String Does not have reverse()
    System.out.println(sb); //dcba

    System.out.println(sb.charAt(2));
    sb.replace(0, 2,"yy");
    System.out.println(sb);//yyba

    sb.deleteCharAt(2);
    System.out.println(sb); //yya;

    sb.setCharAt(2, 'o');
    System.out.println(sb); //yyo

    sb.insert(1, "!!!");
    System.out.println(sb); //y!!!yo

  }
}
