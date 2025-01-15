package OutOfClass;
public class Person5 {
    //Integer
  public int age;
  public String name;


    //Contructor
    public Person5 (int age, String name) {
      this.age = age;
      this.name =name;
    }
    
    //Getter
    public int getAge(){
      return this.age;
    }
    public String getName(){
      return this.name;
    }
  //Setter
  public void setAge(int age) {
    this.age = age;
  }

  
  public String toString() {
    return this.getName() + this.getAge();
  }
  
    public static void main(String[] args) {
    }
}
