public class Deck {
  //52cards
  //private String row;
  private Card[] cards;

  //public Deck(String row) {
    //this.row = row;
    //this.cards = new Card[0];

  public Deck(){

    this.cards = new Card[Card.SUITES.length * Card.RANKS.length]; //13*4
    int idx = 0;
    for(char rank : Card.RANKS) {
      for(char suite : Card.SUITES) {
        this.cards[idx++] = new Card(rank, suite) ;
      }
    }
    //for(int i = 0; i<suites.length; i++) {
      //for(int j = 0; j<ranks.length; j++) {
        
      }

  
public static void main(String[] args) {
  Deck deck = new Deck(); //52 cards
    //Card c1 = new Card('A', 'D');

    System.out.println(Math.PI); // public & static
    //Math.PI = 1.0; // final

    //Card.x =10;
    //Card.suites = new char[3];

    //Card c1 =new Card ('A' ,'D);
}
}
