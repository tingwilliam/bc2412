public class Exercise20241210 {

  public static void main(String[] args) {
    double priceForApple = 7.3;
    double priceForOrange = 6.5;
    int quantityOfApple = 3;
    int quantityOfOrange = 4;

    double x = priceForApple * quantityOfApple + priceForOrange * quantityOfOrange;
//x = 21.9 + 26
//x = 47.9
    System.out.println(x); // (47.9)

    int mathScore = 73;
    int englishScore = 60;
    int historyScore = 61;


    double x2 = (mathScore + englishScore + historyScore) / 3.0;
//x = 194 / 3
//x = 64.66666
    System.out.println(x2); // (64.66666)


  }
}