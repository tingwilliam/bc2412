import java.util.ArrayList;


public class Classroom {
  private int id;
  private String name; 

    public Classroom (int id, String name) {
      this.id = id;
      this.name = name;
    }
  //Getter
    public int getId() {
      return this.id;
    }
    public String getName() {
    return this.name;
    }
//"ID: 1, Name: Alice", "ID: 2, Name: Bob","ID: 3, Name: Charlie"
    @Override
    public String toString(){
    return "ID:" + this.id + " ,Name:" + this.name;
    }
    
  

    public static void main(String[] args) {
    Classroom studentA = new Classroom(1, "Alice");
    Classroom studentB = new Classroom(2, "Bob");
    Classroom studentC = new Classroom(3, "Charlie");
      System.out.println(studentA.toString());
      System.out.println(studentB.toString());
      System.out.println(studentC.toString());
    }



}
