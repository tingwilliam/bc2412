import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoTypeInference {
  //private
  public static void main(String[] args) {
    //Java 10
    //Once you assign the value to var variable, the varible type will be defined as usual.
    //var can be 
    var x =3; // x is an int variable

    //x = 3.3;

    var y =3.3; //y is a double type.
    y = 3; //upcast
    System.out.println(y); //3.0

    List<List<String>> stringLists = new ArrayList<>();
    stringLists.add(Arrays.asList("abc", "def"));
    stringLists.add(Arrays.asList("vincent", "lucas"));

    //List<List<String>
    //[[abc, def], [vincent, lucas]]
    for (List<String> list : stringLists) {
      for (String str : list) {
        System.out.println(str);
      }
    }

    //Same as the above
    //var can be defined as reference type for a certain DS
    for(var list : stringLists) {
      for (var str : list) {
        System.out.println(str);
      }
    }

    // u has to be initialized at declaration
    // var u = null;
    // u = 3;

    var arr = new int[] {3, 2, 1}; // normally, var supports array

    //var arr10{3, 2, 1}; //NOT OK, {3, 2, 1} can be a double array
    double[] arr10 = {3, 2, 1};

    //Stream flatmap
    //List<List<String>> -> List<String>
    List<String> result = stringLists.stream() //
    .flatMap(e ->e.stream()) //
    .collect(Collectors.toList());

    System.out.println(result); //[abc, def, vincent, lucas]

    List<Customer> customers = Arrays.asList(new Customer("Vincent", "vlau"),
    new Customer("lucas", "lll"));
    // map()
    List<String> usernames = customers.stream().map(e -> e.getUserName())
    .collect(Collectors.toList());
    System.out.println(usernames); //{vlau, lll}

    //Find all nicknames of my customers
    List<Customer> customers2 =Arrays
      .asList(new Customer("vincent", "vlau", Arrays.asList("abc", "def")) //
        , new Customer("steven", "swong", Arrays.asList("ab" , "ijkm"))
        , new Customer("lucas", "lll", Arrays.asList("ijk" , "xyz")));

    List<String> nicknames = customers2.stream()
    .filter(e -> e.getName().length() > 5) //
    .flatMap(e -> e.getNickNames().stream())//
    .filter(e -> e.charAt(0) == 'a') //
    .collect(Collectors.toList());

    System.out.println(nicknames); //[abcd, ijkm]
  }
    //Java doesn't allow defining var as variable type.
    //because java is Strong type (type has to be determined during compile time)
    //public static int sum (var x, var y) {
    //return x + y;
    //}

    //return type cannot be defined as var type.
    public static var sum2(int x, int y) {
      String a = "a";
      if (a.equals("a"))
      return (long) x + (long) y;
      else
      return x + y;
    }

  public static class Customer {
    private String name;
    private String username;
    private List<String> nicknames;

    public Customer(String name, String username, List<String> nicknames) {
      this.name = name;
      this.username = username;
      this.nicknames = nicknames;
    }
    public Customer(String name, String username) {
      this.name = name;
      this.username = username;
    }

    public List<String> getNickNames() {
      return this.nicknames;
    }

  }
}
