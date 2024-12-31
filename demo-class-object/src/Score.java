
public class Score {

  private int candy;

  public Score(int candy){
    this.candy = candy;
  }

  public int getCandy() {
    return this.candy;
    int score = [i];
    int getCandy = ' ';
    if(score <= 80) {
      getCandy = '2';
    } else if (score >=60 && score <= 79) {
      getCandy = '1';
    } else{
      getCandy = '0';
    }
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

}
