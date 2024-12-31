public class Library {
  private Book[] books;

    // Search a sub-string of the title
  //public Book[] searchByTitle(String title) {
    //for (int i=0; i<title.length(); i++ ) {
      //if (title.substrng(i, i + ))
    //}
  // A library has many books
  // A Book has attributes, title & author
  // The library has functions:

  // constructor
  public Library() {
    this.books = new Book[0];
  }

  // method signatures
  // 1) add a Book, return void.
  public void addBook(Book book) {
    Book[] newArr = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++) {
    newArr[i] = this.books[i];
    }
    newArr[newArr.length - 1] = book;
    this.books = newArr;
  }

  // Assume remove the first book with same title
  // 2) removeByTitle, return Book.
  public void removeBook(String title) {
    Book[] newArr = new Book[this.books.length -1];
    int idx = 0;
    int countTarget = 0;
    for (int i = 0; i < this.books.length; i++) {
      if(this.books[i].getTitle().equals(title) && countTarget ==0) {
        countTarget++;
        continue;
      }
      newArr[idx++] = this.books[i];
    }
    this.books = newArr;
  }


  // 3) searchByTitle, return Book[]
  // Librarian (add/remove), Library(search), book
    public void searchBook(String title) {
      Book[] newArr = new Book[this.books.length =()];
      
    }
  /////////////////////////////////////////////////////////////////////////
  // public Library (int bookStock) {
  // this.bookStock = bookStock;
  // }

  // public int getbookStock() {
  // return this.bookStock;
  // }

  // public void setbookStock(int bookStock) {
  // this.bookStock = bookStock;
  // }



  public static void main(String[] args) {
    Library l1 = new Library();
    Book b1 = new Book("abc", "Lucas");
    l1.addBook(b1);
    Book b2 = new Book("def", "apple");
    l1.addBook(b2);
    l1.removeBook("abc");

    for(Book book: l1.books){
      System.out.println(book.getTitle());
    }

    //this.books = new Book[0];
  }
}


