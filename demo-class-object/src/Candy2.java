
public class Candy2 {

  private char color;

    public static final char RED = 'R';
    public static final char BLUE = 'B';
    public static final char YELLOW = 'Y';

  public Candy2(char color) {
    this.color =color;
  }
  public char getColor() {
    return color;
  }
    //TODO Auto-generated constructor stub
  }





  //Expected Output:
  //20 candies -> distribute students according to their score
  // Rule: Every round of distribution, Above 80 score -> 2 candies; Above 60 - 79 -> 1 candy

  //Student1: 67 score
  //Student2: 89 score
  //Student3: 50 score
  //Student4: 99 score
  //Student5: 60 score
  //Student6: 59 score

  //Expected Output:
  // Student 1 has 4 candies
  // Student 2 has 6 candies
  // Student 3 has 0 candies
  // Student 4 has 6 candies
  // Student 5 has 4 candies
  // Student 6 has 0 candies


