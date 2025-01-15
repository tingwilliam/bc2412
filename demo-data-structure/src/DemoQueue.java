import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DemoQueue {
  public static void main(String[] args) {
    //FIFO
    Queue<String> strings = new LinkedList<>();//linkedlist ->add/removehead/tail
    strings.add("Oscar"); // addLast
    strings.add("Vincent"); // addLast
    strings.add("Lucas"); // addLast

    System.out.println(strings);
    String head = strings.poll(); //removeFirst
    System.out.println(head);

    System.out.println(strings);

    //Queue Interface hidden lots of funtions of LinkedList
    strings.remove(); //similar to poll()
    System.out.println(strings.contains("Lucus")); //ture

    //loopup, the head element,not pick up
    System.out.println(strings.peek());
    System.out.println(strings.size()); //1

    strings.offer("Jenny");
    Queue<String> qq = new ArrayBlockingQueue<> (3);
    System.out.println(qq.offer("ABC")); //true
    System.out.println(qq.offer("DEF")); //true
    System.out.println(qq.offer("IJK")); //true
    System.out.println(qq.offer("XYZ")); //false

    // for-each support Queue
    for (String s : strings) {
      System.out.println(s); //Lucus Jenny
    }

    List<String> newStrings = new ArrayList<>();
    newStrings.add("AAA");
    newStrings.add("BBB");
    strings.addAll(newStrings);
    System.out.println(strings);//[Lucas, Jenny, AAA, BBB]
    
  }
}
