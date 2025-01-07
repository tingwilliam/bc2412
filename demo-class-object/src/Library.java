import java.util.Arrays;

public class Library {
    // A library has many books
  // A Book has attributes, title & author
  // The library has functions:
  // 1) add a Book, return void.
  // 2) removeByTitle, return Book.
  // 3) searchByTitle, return Book[]

  // Librarian (add/remove), Library(search), Book

  private Book[] books;
  // private Librarian librarian;

  // constructor
  public Library() {
    this.books = new Book[0];
  }

  public Book[] getBooks() {
    return this.books;
  }

  public Book[] setBooks() {
    return this.books;
  }

  //method signatures
  public void add(Book book) {
    Book[] books = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++) {
    books[i] = this.books[i];
    }
    books[books.length - 1] = book;
    this.books = books;
  }
  // Assume remove the first book with same title
  //1. Remove the item
  //2. return removed item

  //Pro-reading:
  //1. Focus negative cases
  //2. Variable Scope
  public Book removeByTitle(String title) {
    int targetRemoveIndex = -1;
    for (int i = 0; i < this.books.length; i++) {
      if(this.books[i].getTitle().equals(title)) {
      targetRemoveIndex = i;
      break;
      }
    }
    Book targetRemoveBook = null;
    if (targetRemoveIndex != -1) { // book found
      Book[] books = new Book[this.books.length - 1];
      int idx = 0;
      for (int i = 0; i < this.books.length; i++) {
        if (i != targetRemoveIndex) {
          books[idx++] = this.books[i];
        } else {
          targetRemoveBook = this.books[i]; // write down the address
        }
      }
      this.books = books;
    }
    return targetRemoveBook; // if not found, return nul
  }
  
  // Search a sub-string of the title
  // What Book object you are going to return?
  public Book[] searchByTitle(String title) { //Didn't change the value of this.books
    int count = 0;
    for (int i =0; i < this.books.length; i++) {
      if (this.books[i].getTitle(). contains(title))
        count++;
    }
    Book[] books = new Book[count];
    int idx =0;
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].getTitle(). contains(title))
      books [idx++] = this.books[i];
    }
    return books;
  }

  public int size() {
    return this.books.length;
}
  public static void main(String[] args) {
    // Book
    // Library
    // Librarian


    Library lb1 = new Library();
    Librarian lbn = new Librarian(lb1);
    lb1.add(new Book("ABC", "Tommy"));
    lb1.add(new Book("DEF", "Jenny"));
    lb1.add(new Book("ABCD", "Jimmy"));
    
        for (Book book : lb1.getBooks()) {
          System.out.println(book.getTitle() + " " + book.getAuthor());
        }
    //ABC Tommy
    //DEF Jenny
    //ABCD Jimmy
    
    for (Book book : lb1.searchByTitle("BC")) {
    System.out.println(book.getTitle() + " " + book.getAuthor());
    }
    // ABC Tommy
    //ABCD Jimmy
    
    Book removedBook = lbn.removeByTitle("DEF");
    System.out.println(removedBook.getTitle() + " " + removedBook.getAuthor()); // DEF Jenny
    System.out.println(lb1.size()); // 2
  }

  public void setBooks(Book[] books2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setBooks'");
  }
      }

