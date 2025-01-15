import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// Exercise 1: Array List Basic Operations

// 1a. Create an ArrayList of integers.
// 1b. Add the following numbers: 10, 20, 30, 40, and 50.
// 1c. Print all the elements in the list.
// 1d. Remove the number 30 from the list.
// 1e. Print the size of the list.

public class ArrayListExercise {

  public static String serachStudentById(ArrayList<Classroom> students,
      int id) {
    for (Classroom student : students) {
      if (student.getId() == id) {
        System.out.println("");
        return student.getName();
      }
    }
    return "Student not found";

  }


  public static void main(String[] args) {
    ArrayList<Integer> ints = new ArrayList<>();
    ints.add(10);
    ints.add(20);
    ints.add(30);
    ints.add(40);
    ints.add(50);

    System.out.println(ints.get(0) + " " + ints.get(1) + " " + ints.get(2) + " "
        + ints.get(3) + " " + ints.get(4));

    ints.remove(2);
    System.out.println(ints);

    System.out.println(ints.size());

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.
    // public static void main(String[] args){
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Orange");

    System.out.println(fruits.contains("Grapes"));

    fruits.add("Grapes");
    fruits.set(2, "Peach");
    System.out.println(fruits);

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.

    ArrayList<Integer> Exercise3a = new ArrayList<>();
    Exercise3a.add(10);
    Exercise3a.add(20);
    Exercise3a.add(10);
    Exercise3a.add(30);
    Exercise3a.add(40);
    Exercise3a.add(20);
    Exercise3a.add(50);

    HashSet<Integer> Exercise3b = new HashSet<>(Exercise3a);
    System.out.println(Exercise3b);

    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.
    HashSet<String> CountryNames = new HashSet<>();
    CountryNames.add("USA");
    CountryNames.add("India");
    CountryNames.add("China");
    CountryNames.add("Japan");
    System.out.println(CountryNames);

    System.out.println((CountryNames.add("Canada")));
    System.out.println(CountryNames);

    System.out.println((CountryNames.add("India")));
    System.out.println(CountryNames);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.
    HashSet<Double> integers = new HashSet<>();
    integers.add(1.1);
    integers.add(2.2);
    integers.add(3.3);
    integers.add(4.4);
    integers.add(5.5);
    System.out.println(integers);

    System.out.println(integers.contains(3.3));
    integers.remove(2.2);
    System.out.println(integers);

    System.out.println(integers.size());


    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.
    HashSet<Integer> set1 = new HashSet<>();
    set1.add(10);
    set1.add(20);
    set1.add(30);
    set1.add(40);
    System.out.println(set1);

    HashSet<Integer> set2 = new HashSet<>();
    set2.add(30);
    set2.add(40);
    set2.add(50);
    set2.add(60);
    System.out.println(set2);

    HashSet<Integer> commonNumbers = new HashSet<>();
    for(Integer set1A : set1) {
      for(Integer set2A : set2) {
        if(set1A == set2A){
          commonNumbers.add(set1A);
        }
      }
    }
    System.out.println(commonNumbers);

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.
    HashSet<String> nickname = new HashSet<>();
    nickname.add("Cherry");
    nickname.add("Steve");
    nickname.add("Chole");
    nickname.add("Jenny");
    nickname.add("Vicky");
    ArrayList<String> nickname2 = new ArrayList<>(nickname);
    System.out.println(nickname2);

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'
    /*
     * String[] Exercise8a = new String[] {"ID: 1, Name: Alice", "ID: 2, Name: Bob","ID: 3, Name: Charlie"}; System.out.println(Exercise8a[0]); System.out.println(Exercise8a[1]);
     * System.out.println(Exercise8a[2]);
     */
    ArrayList<Classroom> studentGp1 = new ArrayList<>();
    studentGp1.add(new Classroom(1, "Alice"));
    studentGp1.add(new Classroom(2, "Bob"));
    studentGp1.add(new Classroom(3, "Charlie"));
    // 8b Answer
    System.out.println(studentGp1);
    // 8c Answer
    studentGp1.remove(1);
    System.out.println(studentGp1);
    // 8d Answer
    String ans = serachStudentById(studentGp1, 4);
    System.out.println(ans);
    // 8e Answer
    ArrayList<Classroom> startwithAStudent = new ArrayList<>();
    for (Classroom student : studentGp1) {
      if (student.getName().charAt(0) == 'A')
        startwithAStudent.add(student);
    }
    System.out.println(startwithAStudent);
    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
    HashSet<Classroom> studentGp1A = new HashSet<>(studentGp1);
    HashSet<Classroom> studentGp2A = new HashSet<>();
    studentGp1A.add(new Classroom(2, "Bob"));
    studentGp2A.add(new Classroom(2, "Bob"));
    studentGp2A.add(new Classroom(3, "Charlie"));
    studentGp2A.add(new Classroom(4, "David"));

    HashSet<Classroom> studentGp = new HashSet<>();
    for (Classroom studentGp1a : studentGp1A) {
      for (Classroom studentGp1b : studentGp2A) {
        if (studentGp1a.getName() == studentGp1b.getName()) {
          studentGp.add(studentGp1a);
        }
      }
    }
    System.out.println(studentGp1A);
    System.out.println(studentGp.toString());


  }
}
