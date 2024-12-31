public class Card {
  //static: shared values
  //final: cannot be modified after initialization
  //static and final can be better
  //"static final" -> constant
  // Constant naming convention
  public static final char[] SUITES = new char[] {'D', 'C', 'H', 'S'};
  public static final char[] RANKS = new char[] {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};

  public static final int x = 3;
  // String (more than one char) Vs char (Single charater)
  private char rank;// 'A', '2', ...'T', 'J', 'K'
  private char suite;// 'D', 'C, , 'H', 'S'

  public Card (char rank, char suite) {
    this.rank = rank; 
    this.suite = suite; 
  }
  public char getRank() {
    return this.rank;
  }
  public char getSuite() {
    return this.suite;
  }
}
