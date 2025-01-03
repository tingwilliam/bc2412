public class Student2 {
  private long id;
  private int score;
  private Candy2[] candies;

  public Student2(int score) {
    this.score =score;
    this.candies = new Candy2[0];
  }

  public void receiveCandy(Candy2 candy) {
    // new Array
    Candy2[] candies = new Candy2 [this.candies.length +1] ;
    // for loop to copy
    for (int i = 0; i < this.candies.length; i++) {
      candies[i] = this.candies[i];
    }
    // place candy at the tail
    candies [candies.length - 1] = candy;
    // replace the reference
    this.candies = candies;
  }

  public int getScore() {
    return this.score;
  }

  public int getCandyCount() {
    return this.candies.length;
  }

  public static void main(String[] args) {
    Student2[] student = new Student2[] {
      new Student2(67),
      new Student2(89),
      new Student2(50),
      new Student2(99),
      new Student2(60),
      new Student2(59),
};

  }
}
