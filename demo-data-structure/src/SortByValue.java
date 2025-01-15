  import java.util.Comparator;

  public class SortByValue implements Comparator<Ball> {
    @Override
    public int compare(Ball B1, Ball B2) {
      //b1 (-1), b2 (1)
      if(B1.getValue() > B2.getValue())
      return -1;
      return 1;
    }
    
  }
