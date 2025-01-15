import java.util.Comparator;

public class SortByAge implements Comparator<DemoPQ.Person> {
  //private int age;

    @Override
    public int compare(DemoPQ.Person P1, DemoPQ.Person P2) {
    if(P1.getAge() > P2.getAge())
    return -1;
    return 1;
    }
    
  }
