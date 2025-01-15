public class CCat {
  private String name;
  private int age;
  private int weight;
  
  public CCat (String name, int age, int weight){
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  public String getName() {
    return this.name;
  }
  public int getAge() {
    return this.age;
  }
  public int getWeight() {
    return this.weight;
  }

public String toString()  {
  return this.name + this.age + this.weight;
}

  public static void main(String[] args) {
    CCat cat = new CCat("Betty", 5, 30);
    CCat cat2 = new CCat("Mary", 4, 20);
    System.out.println(cat.getName() + cat.getAge() + cat.getWeight() );
    System.out.println(cat2);
  }


  
}
