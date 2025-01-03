public class Student {
  private int score;
  private String name;
  private int candy;

  public Student(String name, int score) {
    this.score = score;
    this.name = name;
    this.candy = 0;
  }
    public String getName() {
      return name;
    }
    public int getCandy() {
      return candy;
    }
  
public static void main(String[] args) {
    Student[] Student = {
    new Student("Student1", 67),
    new Student("Student2", 89),
    new Student("Student3", 50),
    new Student("Student4", 99),
    new Student("Student5", 60),
    new Student("Student6", 59),
};
    int totalCandies = 20;{
          while(totalCandies > 0) {
            for (Student stu : Student) 
            if(stu.score >= 80 && totalCandies >=2 ) {
              stu.candy += 2;
              totalCandies -= 2;
            } else if(stu.score >=60 && stu.score <80 && totalCandies >=1 ) {
              stu.candy += 1;
              totalCandies -= 1;
            }
            //break;
          }
          for (Student stu : Student) 
    System.out.println(stu.getName() + " has " + stu.getCandy() + "Candies");
    }
  }
  }

  //Expected Output:
  //20 candies -> distribute students according to their score
  // Rule: Every round of distribution, Above 80 score -> 2 candies; Above 60 - 79 -> 1 candy

  //Student1: 67 score
  //Student2: 89 score
  //Student3: 50 score
  //Student4: 99 score
  //Student5: 60 score
  //Student6: 59 score

  //Expected Output:
  // Student 1 has 4 candies
  // Student 2 has 6 candies
  // Student 3 has 0 candies
  // Student 4 has 6 candies
  // Student 5 has 4 candies
  // Student 6 has 0 candies

  //Tips: static -> candyCount (while loop)



    



  //Question 2:
  //Candy.class has attribute color (RED, BLUE, YELLOW)
  //Student2.class to store his own candies

  //20.candies -> distribute students according to their score
  // Rule: Every round of distribution, Above 80 score -> RED; between 60 - 79 score -> BLUE, else YELLOW

  //Student1: 67 score
  //Student2: 89 score
  //Student3: 50 score
  //Student4: 99 score
  //Student5: 60 score
  //Student6: 59 score

  // Expected Output: return Student [] (Student should have Candy attribute)

