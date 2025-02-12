public class PatternManager {
  private Card[] cards = new Card[5];

  public PatternManager() {
    if(cards.length != 5)
    throw new IllegalArgumentException();
    if(cards[0] == null || cards[1] == null || cards[2] == null
    || cards[3] == null || cards[4] == null)
    throw new IllegalArgumentException();
    this.cards = cards;
  }

  public boolean hasThreeKind() {
    int[] count = new int[13]; // 0-12
    for (int i = 0; i < this.cards.length; i++) {
      if (++count[this.cards[i].getRank().getValue() - 1] >= 3)
      return true;
    }
    return false;
  }
  public boolean hasPair() {
    int[]count1 = new int[13];
    for(int i = 0; i < this.cards.length; i++) {
      if (++count1[this.cards[i].getRank().getValue() - 1] >= 2)
      return true;
    }
    return false;
  }
  
  public boolean isFullHouse() {

  }
}
