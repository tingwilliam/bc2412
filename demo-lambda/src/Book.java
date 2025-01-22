public record Book (String name, double price) {
    //private string author;
    public static final double PI = 3.14;

    //public Book() {

    //}

public void print() {
  System.out.println(name + price);
}
  public static void main(String[] args) {
    Book b1 = new Book("ABC", 10.5);
    System.out.println(b1.name());
    System.out.println(b1.price());
    System.out.println(new Book("ABC", 10.5).equals(b1)); //true
    System.out.println(new Book("ABC", 10.5).hashCode()); //1078168574
    System.out.println(b1.hashCode()); //1078168574
    System.out.println(b1); // Book[name=ABC, price=10.5]
    b1.print();


    // All-arg constructor ONLY
    // renamed getter
    // no setter (immutable)
    // Support equals() and hashCode()
    // Support toString()
    // Support static variable/ method
    // Support custom instance method
    //Do not support custom attirbute
    //Do not support custom acontructor

  }
}

