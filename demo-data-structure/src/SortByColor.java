import java.util.Comparator;

public class SortByColor implements Comparator<Ball> {
  @Override
  public int compare(Ball B1, Ball B2) {
    //b1 (-1), b2 (1)
    if(B1.getColor() == Ball.Color.RED)
    return -1;
    if(B2.getColor() == Ball.Color.RED)
    return 1;
    if(B1.getColor() == Ball.Color.BLUE)
    return -1;
    return 1;
  }
  
}
