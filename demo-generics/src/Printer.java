public class Printer {
  private Integer x;


  public Printer (Integer x) {
    this.x = x;
  }

  public String print() {
    return " this is "+ this.x;
  }

  public static <T extends Shape> double totalArea2(T[] shapes) {
    return 0.1;
  } 

  public static void main(String[] args) {
    Printer p1 = new Printer(10);
    System.out.println(p1.print()); //this is 10;

    //WHat if DoublePrinter? LongPrinter ? BigDecimalPrinter ? -> New Class

    // Another solution: Generics
    //10 ->Integer 10-> Long 10 (NOT OK)
    // 10L ->
    GeneralPrinter<Long> longPrinter = new GeneralPrinter<>(10L);
    //You defined T as Long.

    GeneralPrinter<Book> bookPrinter = new GeneralPrinter<>(new Book("ABC"));
    System.out.println(bookPrinter.print()); // this is Book [name=ABC]
    }

}
