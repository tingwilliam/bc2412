public class Teacher {
  private Candy2[] candies;

public Teacher(Candy2[] candies, Student[] students) {
    this.candies = candies;
    this.students = students;
}


public static boolean shouldDistribute(int score, char color) {
    return score >=80 && color == 'R'
    || score >= 60 && score <80 && color == 'B'
    || score < 60 && color =='Y';
}
//Teacher, Candy2, Student2
//Rule: Every round of distribution, Above 80 score -> 2 candies; Above 60 - 79 -> 1 candy
//YELLOW

  public void distribute() {
      int pos = 0;
      while (pos < this.candies.length) { //19
      for (Student2 student : this.students) {
        if (shouldDistribute(Student.getScore(), candy.getColor())) {
          student.receiveCandy(this.candies[pos]); //student candy bag +1
          this.candies[pos] = null; //teacher's candy bag -1
          pos++; //breaking student loop
        }
      }
    }
  }


  public static void main(String[] args) {
    Candy2[] candies = new Candy2[] {new Candy2 ('R'), new Candy2 ('R'),
    new Candy2 ('R'), new Candy2 ('Y'), new Candy2 ('B'), new Candy2 ('R'),
    new Candy2 ('Y'), new Candy2 ('R'), new Candy2 ('R'), new Candy2 ('R'),
    new Candy2 ('R'), new Candy2 ('B'), new Candy2 ('B'), new Candy2 ('R'),
    new Candy2 ('Y'), new Candy2 ('Y'), new Candy2 ('R'), new Candy2 ('R'),
    new Candy2 ('R'), new Candy2 ('R'),};
    System.out.println(candies.length);
      Teacher t1 = new Teacher(candies);
    t1.distribute();
    //t1.distribute() <-> s1.



    //new Candy2('R')
    //Teacher t1 =new Teacher();
    //t1.distribute() <-> s1.setCandies()


  }
}
