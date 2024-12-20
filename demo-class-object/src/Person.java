public class Person { // blueprint - define a Person
    // attributes
  // attributes
  private String name;
  private int age;
  private String emailaddress;

  // constructor (Not Method)
  // constructor is to create object
  public Person (String name, int age, String emailaddress) {
      this.name = name;
      this.age = age;
      this.emailaddress = emailaddress;
  }

  //getter (instance = object)
  //instance Method is able to return self value
  public String getName() {
    return this.name;
  }
  public int getAge() {
    return this.age;
  }
  public String getEmailAddress() {
    return this.emailaddress;
  }

  //setter
  //void -> return type (return nothing)
  public void setAge(int age) {
    this.age = age;
  }
  public void setName(String name) {
    this.name = name;
  }
    public void setEmailAddress(String emailAddress) {
      this.emailaddress = emailAddress;
  }
public static int sum(int x, int y){
    return x + y;
}

}
