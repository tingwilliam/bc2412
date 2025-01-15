import java.util.PriorityQueue;

public class DemoPQ {

  public static class Person {
    private int age;
    private String name;


    public Person(String name, int age) {
      this.age = age;
      this.name = name;
    }

    // getter
    public int getAge() {
      return this.age;
    }

    // setter
    public void setAge(int age) {
      this.age = age;
    }

    @Override
    public String toString() {
      return this.name + " " + this.age + " ";
    }


    public static void main(String[] args) {
      PriorityQueue<String> pq = new PriorityQueue<>();
      pq.add("Vincent");
      // pq.add("ABC");
      System.out.println(pq); // [Vincent]
      pq.add("Oscar");
      System.out.println(pq); // [Oscar, Vincent]
      pq.add("Lucas");
      System.out.println(pq); // [Lucas, Oscar, Vincent] (No ordering)
      System.out.println(pq.size()); // 3

      // For poll(), ordering -> String natural order
      System.out.println(pq.poll()); // Lucas
      System.out.println(pq.poll()); // Oscar
      System.out.println(pq.poll()); // Vincent

      PriorityQueue<Person> pq2 = new PriorityQueue<>(new SortByAge());
      pq2.add(new Person("Oscar", 45));
      pq2.add(new Person("Lucas", 50));
      pq2.add(new Person("Vincent", 60));
      pq2.add(new Person("Tommy", 46));

      System.out.println(pq2);
      System.out.println(pq2.poll());
      System.out.println(pq2.poll());
      System.out.println(pq2.poll());

      System.out.println(pq2.poll());


    }
  }
}
