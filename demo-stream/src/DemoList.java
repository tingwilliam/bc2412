import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {

  public static void main(String[] args) {
    //new ArrayList<>()
    //List.of()
    //Arrays.asList()

    //1. new ArrayList<>()
    //Able to add/ remove/ modify
    List<String> strings1 = new ArrayList<>();
    strings1.add("ABC");
    strings1.add("DEF");
    List<String> strings2 = new ArrayList<>(Arrays.asList("ABC", "DEF"));
    strings1.add("IJK");
    strings1.add("DEF");
    strings1.add(0, "XYZ");
    System.out.println(strings1);
    System.out.println(strings2);

    //2. Arrays.asList()
    // Cannot add and remove ONLY. Able to modify element ONLY.
    List<String> strings3 = Arrays.asList("ABC", "DEF", "IJK");
    //strings3.add("XYZ"); //java.lang.UnsupportedOperationException
    //strings3.remove("IJK"); //java.lang.UnsupportedOperationException
    strings3.set(0, "OPQ");
    System.out.println(strings3);

    //3. List.of()
    //Able to read ONLY.
    List<String> strings4 = List.of("ABC", "DEF", "IJK");
    //string4.add("XYZ")
    //string4.remove("ABC")
    //string4.set(0, "LLL")
    System.out.println(strings4.get(2)); //IJK

  }
  
}
