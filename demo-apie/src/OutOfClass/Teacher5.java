package OutOfClass;
public class Teacher5 extends Person5{
  //Integer
public int after2yrAge;

    //Contructor
    public Teacher5 (int age, String name, int after2yrAge ) {
      super(age, name );
    this.after2yrAge = after2yrAge;
    }

  //Setter
  public void setAge(int age) {
    this.age = age;
  }

  public String toString() {
    return this.getName() + this.getAge() + this.after2yrAge; 
  }

public static void main(String[] args) {
  Teacher5 teacherNewAge = new Teacher5 (18, "Betty", 20);
  Teacher5 teacherNewAge2 = new Teacher5 (22, "Mary", 24);
  // Teacher5 teacherNewAge3 = new Teacher5 (10, "Mary");

  // teacherNewAge2.setAge(10);
  
  System.out.println(teacherNewAge);
  System.out.println(teacherNewAge2);
  Student5 studentNew = new Student5 (3, "Tom");

  System.out.println(studentNew);
}



}
